package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Project extends Model {
    @Id
    private Long id;
    
    @Constraints.Required
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Employee> Employees;

    public Project() {
    }

    public Project(Long id, String name, List<Employee> Employees) {
        this.id = id;
        this.name = name;
        this.Employees = Employees;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return Employees;
    }

    public void setEmployees(List<Employee> Employees) {
        this.Employees = Employees;
    }

    public static Finder<Long, Project> find = new Finder<Long, Project>(Project.class);

    public static List<Project> findAll() {
        return Project.find.query().where().orderBy("name asc").findList();
    }

    public static Map<String, String> options() {
        LinkedHashMap<String, String> options = new LinkedHashMap();

        for (Project c: Project.findAll()) {
            options.put(c.getId().toString(), c.getName());
        }
        
        return options;
    }
    public static boolean inProject(Long Project, Long Employee){
        return find.query().where().eq("Employees.id", Employee).eq("id" , Project).findCount() > 0;
    } 

}