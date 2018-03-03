# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);

create table category_product (
  category_id                   bigint not null,
  product_id                    bigint not null,
  constraint pk_category_product primary key (category_id,product_id)
);

create table customer (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  email                         varchar(255),
  constraint pk_customer primary key (id)
);

create table department (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_department primary key (id)
);

create table employee (
  id                            bigint auto_increment not null,
  fname                         varchar(255),
  lname                         varchar(255),
  department_id                 bigint,
  constraint pk_employee primary key (id)
);

create table product (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  description                   varchar(255),
  stock                         integer not null,
  price                         double not null,
  constraint pk_product primary key (id)
);

create table project (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_project primary key (id)
);

create table project_employee (
  project_id                    bigint not null,
  employee_id                   bigint not null,
  constraint pk_project_employee primary key (project_id,employee_id)
);

create table user (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table category_product add constraint fk_category_product_category foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_category_product_category on category_product (category_id);

alter table category_product add constraint fk_category_product_product foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_category_product_product on category_product (product_id);

alter table employee add constraint fk_employee_department_id foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_employee_department_id on employee (department_id);

alter table project_employee add constraint fk_project_employee_project foreign key (project_id) references project (id) on delete restrict on update restrict;
create index ix_project_employee_project on project_employee (project_id);

alter table project_employee add constraint fk_project_employee_employee foreign key (employee_id) references employee (id) on delete restrict on update restrict;
create index ix_project_employee_employee on project_employee (employee_id);


# --- !Downs

alter table category_product drop constraint if exists fk_category_product_category;
drop index if exists ix_category_product_category;

alter table category_product drop constraint if exists fk_category_product_product;
drop index if exists ix_category_product_product;

alter table employee drop constraint if exists fk_employee_department_id;
drop index if exists ix_employee_department_id;

alter table project_employee drop constraint if exists fk_project_employee_project;
drop index if exists ix_project_employee_project;

alter table project_employee drop constraint if exists fk_project_employee_employee;
drop index if exists ix_project_employee_employee;

drop table if exists category;

drop table if exists category_product;

drop table if exists customer;

drop table if exists department;

drop table if exists employee;

drop table if exists product;

drop table if exists project;

drop table if exists project_employee;

drop table if exists user;

