create table manutencao(
	id_manutencao serial,
	status_manutencao varchar(20),
	materiais_utilizados varchar (100),
	data_licitacao timestamp,
	id_func_m integer,
	id_ticket integer,
	constraint pk_manutencao primary key(id_manutencao),
	constraint fk_ticket_manutencao foreign key(id_ticket) references ticket(id_ticket),
	constraint fk_manutencao_funcionario_M foreign key (id_func_m) references funcionario_manutencao(id_func_m)

);
