package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employeeextends Model {
    
        // Properties
        @Id
        private Long id;

        @ManyToMany(cascade = CascadeType.ALL, mappedBy= "employees")
        public List<Employee> pList;

        @Constraints.Required
        private String name;
        
        @Constraints.Required
        private Department department; 
        
       

        public List<Long> projSelect = new ArrayList<Long>();

        public static final Finder<Long, employee> find = new Finder<>(Employee.class);
    

        public static final List<employee> findAll() { 
            
                    return employee.find.all();
        }
        // Default Constructor
        public employee() {
        }
    
        // Constructor to initialise object
        public employee(Long id, String name, Department department) {
            this.id = id;
            this.name = name;
            this.department=department;
        }
        public List<Long> getprojSelect(){
            return this.projSelect;
        }
    
        // Accessor methods
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public Department getDepartment(){
            return this.department;
        }
        public void setDepartment(Department d){
            this.department=d;
        }
       
        
    }
    