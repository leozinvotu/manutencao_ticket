create table ticket(
	id_ticket serial NOT NULL,
	titulo VARCHAR(30) NOT NULL,
	descricao VARCHAR(100) NOT NULL,
	data_solicitacao TIMESTAMP NOT NULL,
	id_usuario_role int NOT NULL,
	constraint pk_ticket primary key(id_ticket),
	constraint fk_usuario_role foreign key(id_usuario_role) references usuario_role(id_usuario_role)
);