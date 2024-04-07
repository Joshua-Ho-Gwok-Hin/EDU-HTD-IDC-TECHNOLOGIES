create table batch.student1 (rollno int, name varchar(255), marks int);
select * from batch.student1;
alter table batch.student1 add marks2 int;
select isnull(marks2) from student1;
insert into batch.student1 (rollno, name, marks) values 
(1, "apple", 32),
(2, "orange", 2),
(3, "pear", 92),
(4, "purple", 52),
(5, "green", 62),
(6, "red", 12);
select isnull(marks2) from student1;
alter table batch.student1 add age int not null;
alter table student1 modify rollno int unique;
create table person(id int primary key, firstname varchar(255) not null, lastname varchar(255), age int);
select * from person;
select * from batch.employee;
alter table batch.employee add primary key(id); 
select * from batch.employee where name like 'j%';
alter table batch.employee drop column mood;
delete from batch.employee where id is null;
select * from batch.student1; 
alter table batch.employee add country varchar(255);
select * from batch.employee where country="singapore" and salary > 5000;
select * from batch.employee order by department, salary desc;
select * from batch.employee order by department, salary is not null;
select min(salary) , max(salary) from batch.employee;
select * from batch.employee;
select * from batch.employee where name like 'j%';
select * from batch.employee where department like '%r';
select * from batch.employee where department not like '%r';
select * from batch.employee where country in('Singapore', 'India');
select * from batch.employee where country not in('Singapore', 'India');
select * from batch.employee where country like  '%ing%';
select * from batch.employee where join_date between 2019/12/01 and '2020-02-02';

SELECT id AS ID, 
name AS 'Contact Person', 
department as Designation, 
join_date as 'Joining Date', 
salary as Salary, 
country as 'Country of Origin'
FROM batch.employee;

