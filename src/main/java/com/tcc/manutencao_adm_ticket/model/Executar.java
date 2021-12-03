package com.tcc.manutencao_adm_ticket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "executar")
public class Executar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_executar")
    private int idExecuta;

    @Column(name = "data_execucao")
    private Timestamp dataExcucao;

    @Column(name = "id_func_m")
    private  int idFuncMfk;

}
