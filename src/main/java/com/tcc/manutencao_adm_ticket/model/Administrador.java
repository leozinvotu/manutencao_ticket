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
@Table(name = "administrador")
public class Administrador {


    @Id
    @Column(name = "id_administrador ")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdministrador;

    @NotNull
    @Column(name = "nome")
    private String nomeAdministrador;

    @NotNull
    @Column(name = "telefone")
    private String telefoneAdministrador;

    @Column(name = "cargo")
    private String cargoAdministrador;

    @NotNull
    @Column(name = "email")
    private String emailAdministrador;

    @NotNull
    @Column(name = "senha")
    private String senhaAdministrador;
}
