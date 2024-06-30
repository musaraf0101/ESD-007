--create a database
CREATE DATABASE school;

--use database
USE school;

--show databases
SHOW DATABASES;

--drop database
DROP DATABASE school;

--create table with colum name
create table student(
fullname varchar(50),
nic varchar(40),
gender varchar(20),
age INT
);

--describe of table (View colum)
describe student;

--drop a table 
drop table student;

--add new column exits table
alter table student add column z_score double;

--change column name
alter table student change column fullname fullName varchar(40);

--change data type
alter table student change age age varchar(10);

--rename table name
alter table student rename to student_info;


--insert into valus
INSERT INTO student(fullName,nic,gender,age)
values('musaraf','2002','male','22'),
        ('jaseema','1981','female','43'),
        ('sahan','2002','male','22');



--view all data from table 
SELECT * FROM student;


--view a specific column
SELECT fullName FROM student;

--view two specific column
SELECT fullName,age FROM student;

/*
* database  name fullname but user want view that column name name
*/
SELECT fullName as name from student;
SELECT fullName as name , nic as uniqNumber from student;

--filter using  values
--  filter upto 22 age 
select * from student where age >22;

