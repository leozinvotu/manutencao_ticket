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
@Table(name = "ticket")
public class Ticket {

    @Id
    @Column(name = "id_ticket")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTicket;

    @NotNull
    @Column
    private String titulo;

    @NotNull
    @Column
    private String descricao;

    @NotNull
    @Column(name = "status_Ticket")
    private String statusTicket;

    @NotNull
    @Column(name = "data_solicitacao")
    private Timestamp dataSolicitacao;
}
