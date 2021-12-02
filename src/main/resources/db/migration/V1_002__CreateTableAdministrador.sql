create table administrador(
	id_administrador serial,
	nome varchar(40),
	telefone varchar(40),
	cargo varchar (40),
	email varchar (40),
	senha varchar (40),
	constraint pk_administrador primary key(id_administrador)

);