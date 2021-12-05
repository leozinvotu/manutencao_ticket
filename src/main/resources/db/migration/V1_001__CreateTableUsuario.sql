create table usuario(
	nome varchar(50) NOT NULL,
	estado varchar(40) NOT NULL,
	cidade varchar(40) NOT NULL,
	empresa varchar(40) NOT NULL,
	telefone varchar(40) NOT NULL,
	email_usuario varchar(50) NOT NULL,
	senha varchar(100) NOT NULL,
	constraint pk_usuario primary key(email_usuario)
);