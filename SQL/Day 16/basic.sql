--create database
create database school;

--Drop database
drop database school;

--view all database
show databases;

--use databases
use database school;

--create table including colum names
create table student(
    id int primary key,
    name varchar(20),
    age int,
    address varchar(20)
);

--insert value (single value)
insert into student values(1,'Rahul',20,'Delhi');
