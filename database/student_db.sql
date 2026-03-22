create database student_db;
use student_db;
create table students(
id int primary key auto_increment,
name varchar(100),
age int,
course varchar(100),
email varchar(100)
);
