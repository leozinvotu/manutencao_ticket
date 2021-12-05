create table usuario_role(
	id_usuario_role serial NOT NULL,
	email_usuario VARCHAR(50) UNIQUE,
	nome_role VARCHAR(30),
	constraint fk_usuario foreign key(email_usuario) references usuario(email_usuario),
	constraint fk_role foreign key(nome_role) references role(nome_role),
	constraint pk_usuario_role primary key(id_usuario_role)


);

