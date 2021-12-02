create table executar(
    id_executar serial,
	data_execucao timestamp,
	id_func_m integer,
	constraint pk_executar primary key(id_executar),
	constraint fk_executar foreign key(id_func_m) references funcionario_manutencao
);
