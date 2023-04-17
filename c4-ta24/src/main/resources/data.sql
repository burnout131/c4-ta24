DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
    trabajo varchar(250),
	salario int
);

insert into empleado (nombre, trabajo, salario) values('Marc', 'PROGRAMMER', 25000);
insert into empleado (nombre, trabajo, salario) values('Jose', 'TESTER', 30000);
insert into empleado (nombre, trabajo, salario) values('Javi', 'ADMINISTRATOR', 12000);