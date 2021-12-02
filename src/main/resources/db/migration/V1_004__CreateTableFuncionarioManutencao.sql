create table funcionario_manutencao(
	id_func_m serial,
	nome varchar (40),
	telefone varchar(40),
	cargo varchar (40),
	email varchar (40),
	senha varchar (40),
	id_administrador integer,
	constraint pk_funcionario_manutencao primary key(id_func_m),
	constraint fk_funcionario_manutencao foreign key(id_administrador) references administrador

);
