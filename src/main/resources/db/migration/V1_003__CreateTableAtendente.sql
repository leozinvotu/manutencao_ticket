create table atendente(
	id_atendente serial,
	nome varchar (40),
	telefone varchar(40),
	cargo varchar (40),
	email varchar (40),
	senha varchar (40),
	id_administrador integer,
	constraint pk_atendente primary key(id_atendente),
	constraint fk_atendente foreign key(id_administrador) references administrador

);