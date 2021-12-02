create table ticket(
	id_ticket serial,
	titulo varchar(40),
	descricao varchar(150),
	status_ticket varchar(20),
	data_solicitacao timestamp,
	id_usuario integer,
	id_manutencao integer,
	constraint pk_ticket primary key(id_ticket),
	constraint fk_ticket_usuario foreign key(id_usuario) references usuario(id_usuario)

);

