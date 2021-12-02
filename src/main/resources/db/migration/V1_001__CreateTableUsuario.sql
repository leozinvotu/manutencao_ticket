create table usuario(
	id_usuario serial,
	nome varchar(50),
	estado varchar(40),
	cidade varchar(40),
	empresa varchar(40),
	telefone varchar(40),
	email varchar(50),
	senha varchar(50),
	constraint pk_usuario primary key(id_usuario)
);