create table students
(
  id   serial constraint students_pk primary key,
  name varchar(30) not null,
  mark integer
);