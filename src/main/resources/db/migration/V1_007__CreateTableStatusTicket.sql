create table status_ticket(
	id_status_ticket serial NOT NULL,
	id_ticket int NOT NULL,
	id_status int NOT NULL,
    id_usuario_role int,
	constraint pk_status_ticket primary key(id_status_ticket),
	constraint fk_usuario_role foreign key(id_usuario_role) references usuario_role(id_usuario_role),
	constraint fk_ticket foreign key(id_ticket) references ticket(id_ticket),
	constraint fk_status foreign key(id_status) references status(id_status)
);