create table ticket(
	id_ticket serial NOT NULL,
	titulo VARCHAR(30) NOT NULL,
	descricao VARCHAR(100) NOT NULL,
	data_solicitacao TIMESTAMP NOT NULL,
	email_usuario VARCHAR(50) NOT NULL,
	constraint pk_ticket primary key(id_ticket),
	constraint fk_usuario foreign key(email_usuario) references usuario(email_usuario)
);