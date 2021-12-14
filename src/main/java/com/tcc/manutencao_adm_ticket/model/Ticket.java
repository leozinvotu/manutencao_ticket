package com.tcc.manutencao_adm_ticket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idTicket;

    @Column
    private String titulo;

    @Column
    private String descricao;

    @Column(name = "data_solicitacao")
    private Timestamp dataSolicitacao;

    @ManyToOne
    @Column(name = "email_usuario")
    private String emailUsuario;


}
