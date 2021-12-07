create table status_ticket(
	id_status_ticket serial NOT NULL,
	id_ticket int NOT NULL,
	id_status int NOT NULL,
    email_usuario VARCHAR(50),
	constraint pk_status_ticket primary key(id_status_ticket),
	constraint fk_usuario foreign key(email_usuario) references usuario(email_usuario),
	constraint fk_ticket foreign key(id_ticket) references ticket(id_ticket),
	constraint fk_status foreign key(id_status) references status(id_status)
);