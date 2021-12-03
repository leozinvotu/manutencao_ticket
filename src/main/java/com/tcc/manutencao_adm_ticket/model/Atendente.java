package com.tcc.manutencao_adm_ticket.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "atendente")
public class Atendente {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAtendente;

    @NotNull
    @Column(name = "nome")
    private String nomeAtendente;

    @NotNull
    @Column(name = "telefone")
    private String telefoneAtendente;


    @Column(name = "cargo")
    private String cargoAtendente;

    @NotNull
    @Column(name = "email")
    private String emailAtendente;

    @NotNull
    @Column(name = "senha")
    private String senhaAtendente;

    @Column(name = "id_administrador")
    private int idAdministrador;
    //fk tabela administrador
}
