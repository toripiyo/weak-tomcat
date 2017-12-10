create database book;
create table book.books(id int not null primary key auto_increment, title varchar(60));
insert into book.books (title) values ('cat meal complete book');
insert into book.books (title) values ('coffee and donuts');
insert into book.books (title) values ('travel to Italy');
