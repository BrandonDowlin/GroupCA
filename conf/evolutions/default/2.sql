# --- Sample dataset
 
# --- !Ups
 
delete from employee;
delete from project;
# --- delete from address;

insert into project (id,name, description, department) values ( 1,'ca1', "The First CA!", "Finance" );
insert into project (id,name, description, department) values ( 2,'ca2', "The Second CA!", "IT" );
insert into project (id,name, description, department) values ( 3,'ca3', "The Third CA!", "Sales" );
insert into project (id,name, description, department) values ( 4,'ca4', "The Fourth CA!", "Human Resources" );
insert into project (id,name, description, department) values ( 5,'ca5', "The Fifth CA!", "Maintenance" );
insert into project (id,name, description, department) values ( 6,'ca6', "The Sixth CA!", "Research & Development" );
insert into project (id,name, description, department) values ( 7,'ca7', "The Seventh CA!", "Finance" );
insert into project (id,name, description, department) values ( 8,'ca8', "The Eighth CA!", "Maintenance" );
insert into project (id,name, description, department) values ( 9,'ca9', "The Ninth CA!", "IT" );
insert into project (id,name, description, department) values ( 10,'ca10', "The Tenth CA!", "Finance" );


insert into employee (id,fname, lname ,department) values ( 1,'John','Smith', 'IT');
insert into employee (id,fname, lname ,department) values ( 1,'Jack','Jones', 'Research & Development');
insert into employee (id,fname, lname ,department) values ( 1,'Brandon','Harris', 'Human Resources');
insert into employee (id,fname, lname ,department) values ( 1,'Fred','Rogers', 'Sales');
insert into employee (id,fname, lname ,department) values ( 1,'Lila','Cruz', 'Public Relations');
insert into employee (id,fname, lname ,department) values ( 1,'Greg','Hyde', 'Finance');
insert into employee (id,fname, lname ,department) values ( 1,'Brendan','Coby', 'Maintenance');
insert into employee (id,fname, lname ,department) values ( 1,'Aidan','Kobeild', 'Human Resources');
insert into employee (id,fname, lname ,department) values ( 1,'Josh','Walter', 'Finance');
insert into employee (id,fname, lname ,department) values ( 1,'Aaron','Alan', 'IT');
insert into employee (id,fname, lname ,department) values ( 1,'Nathan','Dread', 'Human Resources');
insert into employee (id,fname, lname ,department) values ( 1,'Lazaras','Pif', 'Research & Delvelopment');
insert into employee (id,fname, lname ,department) values ( 1,'Luke','Walsh', 'Finance');
insert into employee (id,fname, lname ,department) values ( 1,'Martin','Smitherman', 'Human Resources');
insert into employee (id,fname, lname ,department) values ( 1,'Sony','Girotto', 'Sales');
insert into employee (id,fname, lname ,department) values ( 1,'George','Starkey', 'Maintenance');
insert into employee (id,fname, lname ,department) values ( 1,'Kid','Burnley', 'Human Resources');
insert into employee (id,fname, lname ,department) values ( 1,'Harry','Hart', 'Human Resources');
insert into employee (id,fname, lname ,department) values ( 1,'Felisha','Park', 'Research & Development');
insert into employee (id,fname, lname ,department) values ( 1,'Caireann','Bushemmi', 'Sales');
insert into employee (id,fname, lname ,department) values ( 1,'Welma','Packard', 'Finance');
insert into employee (id,fname, lname ,department) values ( 1,'Tanya','Johnston', 'IT');
insert into employee (id,fname, lname ,department) values ( 1,'Wayne','Boyce', 'Research & Development');

 
insert into project_employee (project_id,employee_id) values (5,1);
insert into project_employee (project_id,employee_id) values (5,2);
insert into project_employee (project_id,employee_id) values (1,3);
insert into project_employee (project_id,employee_id) values (3,4);
insert into project_employee (project_id,employee_id) values (3,5);
insert into project_employee (project_id,employee_id) values (8,6);
insert into project_employee (project_id,employee_id) values (10,7);
insert into project_employee (project_id,employee_id) values (7,8);  
insert into project_employee (project_id,employee_id) values (3,9);
insert into project_employee (project_id,employee_id) values (5,10);
insert into project_employee (project_id,employee_id) values (9,11);
insert into project_employee (project_id,employee_id) values (2,12);
insert into project_employee (project_id,employee_id) values (8,7);
insert into project_employee (project_id,employee_id) values (6,8);
insert into project_employee (project_id,employee_id) values (2,3);  

-- insert into address (id,name,description,stock,price) values ( 1,'Kettle','Steel Electric Kettle',100,55.00 );
-- insert into address (id,name,description,stock,price) values ( 2,'Fridge freezer','Fridge + freezer large',45,799.00 );
-- insert into address (id,name,description,stock,price) values ( 3,'Portable Music Player','250GB music player (MP3,MP4,WMA,WAV)',5,99.00 );
-- insert into address (id,name,description,stock,price) values ( 4,'13inch Laptop','HP laptop,8GB RAM,250GB SSD',45,799.00 );
-- insert into address (id,name,description,stock,price) values ( 5,'8inch Tablet','Android 5.1 Tablet,32GB storage,8inch screen',5,99.00 );
-- insert into address (id,name,description,stock,price) values ( 6,'46inch TV','Sony 4K,OLED,Smart TV',12,2799.00 );
-- insert into address (id,name,description,stock,price) values ( 7,'Washing Machine','1600rpm spin,A+++ rated,10KG',50,699.00 );
-- insert into address (id,name,description,stock,price) values ( 8,'Phone','Windows 10,5.2inch OLED,3GB RAM,64GB Storage',45,799.00 );
-- insert into address (id,name,description,stock,price) values ( 9,'10inch Tablet','Windows 10,128GB storage,8inch screen',5,299.00 );
-- insert into address (id,name,description,stock,price) values ( 10,'Oven','Oven + Grill,Stainless Steel',10,399.00 );
-- insert into address (id,name,description,stock,price) values ( 11,'Bed','Super King size,super comfort mattress',5,899.00 );
-- insert into address (id,name,description,stock,price) values ( 12,'Learning JavaScript','Become a JavaScript expert in 2 hours!',50,29.00 );
 