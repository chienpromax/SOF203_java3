create database assjava3

create table Student(
MaSV varchar(50) primary key ,
HoTen nvarchar(50),
Email nvarchar(50),
SoDT nvarchar(50),
GioiTinh bit,
DiaChi nvarchar(50),
Hinh nvarchar(50)
)
delete from Student where MaSV = 'sv01'
select * from Student
insert into Student values('sv01','tran xuan chien','chien@gmail.com','123456789',1,'da nang',null)
insert into Student values('sv02','tran xuan chien','chien@gmail.com','123456789',1,'da nang',null)
insert into Student values('sv03','tran xuan chien','chien@gmail.com','123456789',1,'da nang',null)
insert into Student values('sv04','tran xuan chien','chien@gmail.com','123456789',1,'da nang',null)

create table Grade(
ID int identity(1,1) primary key,
Masv varchar(50) references Student(MaSV),
TiengAnh int,
TinHoc int,
GDTC int
)
select * from Grade
insert into Grade values('sv01',7,8,8)
insert into Grade values('sv02',7,8,8)
insert into Grade values('sv03',7,8,8)
insert into Grade values('sv04',7,8,8)
create table Users(
UserName nvarchar(50) primary key,
Pass nvarchar(50),
role nvarchar(50)
)
insert into Users values('chien','123','admin')
insert into Users values('chien123','123','admin')
insert into Users values('chien12','123','user')