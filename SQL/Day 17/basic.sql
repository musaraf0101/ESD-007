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

--view detail table
describe student;

--drop a table 
drop student;

--add new column exits table
alter table student add column z_score double;

--change column name
alter table student change column fullname fullName varchar(40);

--change data type
alter table student change age age varchar(10);

--rename table name
alter table student rename to student_info;