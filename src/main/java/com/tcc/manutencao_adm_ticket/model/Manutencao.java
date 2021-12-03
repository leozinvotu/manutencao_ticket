package com.tcc.manutencao_adm_ticket.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "manutencao")
public class Manutencao {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idManutencao;

    @NotNull
    @Column
    private String statusManutencao;

    @NotNull
    @Column
    private  String materiaisUtilizados;

    @NotNull
    @Column
    private Timestamp dataLicitacao;

    @Column(name = "id_func_m")
    private int idFuncM;

    @Column(name = "id_ticket")
    private int idTicket;

}
