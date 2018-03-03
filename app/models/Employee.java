package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employee extends Model {
    
        // Properties
        @Id
        private Long id;

        @ManyToMany(cascade = CascadeType.ALL, mappedBy= "employees")
        public List<Project> projects;

        @Constraints.Required
        private String fname;

        @Constraints.Required
        private String lname;
        
        @Constraints.Required
        @ManyToOne
        private Department department; 
        
       

        public List<Long> projSelect = new ArrayList<Long>();

        public static final Finder<Long, Employee> find = new Finder<>(Employee.class);
    

        public static final List<Employee> findAll() { 
            
                    return Employee.find.all();
        }
        // Default Constructor
        public Employee() {
        }
    
        // Constructor to initialise object
        public Employee(Long id, String fname, String lname, Department department) {
            this.id = id;
            this.fname = fname;
            this.lname = lname;
            this.department=department;
        }
        public List<Long> getProjSelect(){
            return this.projSelect;
        }
    
        // Accessor methods
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getFname() {
            return fname;
        }
        public String getLname() {
            return lname;
        }
        public void setFname(String fname) {
            this.fname = fname;
        }
        public void setLname(String lname) {
            this.lname = lname;
        }
        public Department getDepartment(){
            return this.department;
        }
        public void setDepartment(Department d){
            this.department=d;
        }
        public List<Project> getProjects() {
            return projects;
        }
    
        public void setProjects(List<Project> projects) {
            this.projects = projects;
        }
        
    }
    