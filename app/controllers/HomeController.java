package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import models.*;
import models.users.*;
import views.html.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    private FormFactory formFactory;
    private Environment e;
    
        @Inject
        public HomeController(FormFactory f,Environment env) {
            this.formFactory = f;
            this.e = env;
        }
    
        public Result index(Long proj) {
            List<Employee> employeeList = null;
            List<Project> projectList = Project.findAll();
            if (proj == 0) {
                employeeList = Employee.findAll();
            }
            else {
                employeeList = Project.find.ref(proj).getEmployees();
            }
            return ok(index.render(employeeList, projectList, User.getUserById(session().get("email")),e));
        }

    
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addEmployee() {
        Form<Employee> employeeForm = formFactory.form(Employee.class);
        return ok(addEmployee.render(employeeForm, User.getUserById(session().get("email"))));
    }
    public Result addEmployeeSubmit() {
        Employee newEmployee;
        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();

        if (newEmployeeForm.hasErrors()) {
            return badRequest(addEmployee.render(newEmployeeForm, User.getUserById(session().get("email"))));
        } 
        else {
            newEmployee = newEmployeeForm.get();

            if (newEmployee.getId() == null) {

                newEmployee.save();

                for (Long proj : newEmployee.getProjSelect()) {
                    newEmployee.getProjects().add(Project.find.byId(proj));
                }
            newEmployee.update();

            flash("success", "Employee " + newEmployee.getLname() + " was updated");
        }
    }



        MultipartFormData data = request().body().asMultipartFormData();
        FilePart<File> image = data.getFile("upload");

        String saveImageMsg = saveFile(newEmployee.getId(), image);

        flash("success", "Employee " + newEmployee.getFname() + " " + newEmployee.getLname() + " has been created" + saveImageMsg);

        return redirect(controllers.routes.HomeController.index(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteEmployee(Long id) {
        Employee.find.ref(id).delete();

        flash("success", "employee has been deleted");
        
        return redirect(routes.HomeController.index(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateEmployee(Long id) {
        Employee e;
        Form<Employee> employeeForm;

        try {
            e = Employee.find.byId(id);
            employeeForm = formFactory.form(Employee.class).fill(e);
        } 
        catch (Exception ex) {
            return badRequest("error");
        }
        return ok(updateEmployee.render(id, employeeForm,User.getUserById(session().get("email"))));
    }
    public Result updateEmployeeSubmit(Long id) {
        
        // Retrieve the submitted form object (bind from the HTTP request)
        Form<Employee> updateEmployeeForm = formFactory.form(Employee.class).bindFromRequest();

        // Check for errors (based on constraints set in the employee class)
        if (updateEmployeeForm.hasErrors()) {
            // Display the form again by returning a bad request
            return badRequest(updateEmployee.render(id,updateEmployeeForm, User.getUserById(session().get("email"))));
        } else {
            // No errors found - extract the employee detail from the form
            Employee e = updateEmployeeForm.get();
            e.setId(id);
            
            List<Project> newProjs = new ArrayList<Project>();
            for(Long proj : e.getProjSelect()){
                newProjs.add(Project.find.byId(proj));
            }
            e.projects = newProjs;
            
            //update (save) this employee
            e.update();

            MultipartFormData data = request().body().asMultipartFormData();
            FilePart<File> image = data.getFile("upload");

            String saveImageMsg = saveFile(e.getId(), image);

            flash("success", "Employee " +e.getFname() + "" +e.getLname() + " has been  updated " + saveImageMsg);
            
            // Redirect to the index page
            return redirect(controllers.routes.HomeController.index(0));
        }
    }
    
    
    public String saveFile(Long id, FilePart<File> uploaded) {
        // make sure that the file exists
        if (uploaded != null) {
            // make sure that the content is indeed an image
            String mimeType = uploaded.getContentType(); 
            if (mimeType.startsWith("image/")) {
                // get the file name
                String fileName = uploaded.getFilename();                
                // save the file object (created without a path, File saves
                // the content to a default location, usually the temp or tmp
                // directory)
                File file = uploaded.getFile();
                // create an ImageMagik operation - this object is used to specify
                // the required image processing
                IMOperation op = new IMOperation();
                // add the uploaded image to the operationop.addImage(file.getAbsolutePath());
                op.addImage(file.getAbsolutePath());
                // resize the image using height and width saveFileOld(Long id, FilePart<File> uploaded) {
                op.resize(300, 200);
                // save the image as jpg 
                op.addImage("public/images/employeeImages/" + id + ".jpg");
                // create another Image Magick operation and repeat the process above to
                // specify how a thumbnail image should be processed - size 60px
                IMOperation thumb = new IMOperation();
                thumb.addImage(file.getAbsolutePath());
                thumb.resize(60);
                thumb.addImage("public/images/employeeImages/thumbnails/" + id + ".jpg");
                // we must make sure that the directories exist before running the operations
                File dir = new File("public/images/employeeImages/thumbnails/");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                // now we create an Image Magick command and execute the operations
                ConvertCmd cmd = new ConvertCmd();
                try {
                    cmd.run(op);
                    cmd.run(thumb);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                if(mimeType.startsWith("image/"))
                return " and image saved";
            }
        }
        return "";
    }
    public String saveFileOld(Long id, FilePart<File> uploaded) {
        // make sure that the file exists
        String mimeType = uploaded.getContentType(); 
        if (uploaded != null) {
            // make sure that the content is indeed an image
            if (mimeType.startsWith("image/")) {
                // get the file name
                String fileName = uploaded.getFilename();      
                String extension = "";
                int i = fileName.lastIndexOf('.');
                if (i >= 0) {
                    extension = fileName.substring(i+1);
                }
                // save the file object (created without a path, File saves
                // the content to a default location, usually the temp or tmp
                // directory)
                File file = uploaded.getFile();
                // we must make sure that the directory for the images exists before we save it
                File dir = new File("public/images/employeeImages");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                // move the file to the required location (in a real application 
                // the path to where images are stored would be configurable, but 
                // for the lab we just hard-code it)
                if(file.renameTo(new File("public/images/employeeImages/", id + "." + extension))) {
                    return "/ file uploaded";
                } else {
                    return "/ file upload failed";
                }
            }
        }
        return "/ no file";
    }


    }
