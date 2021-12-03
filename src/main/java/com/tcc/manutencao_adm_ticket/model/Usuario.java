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
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @NotNull
    @Column(name = "nome")
    private String nomeUsuario;

    @Column(name = "estado")
    private String estadoUsuario;

    @Column(name = "cidade")
    private String cidadeUsuario;

    @Column(name = "empresa")
    private String empresaUsuario;

    @NotNull
    @Column(name = "telefone")
    private String telefoneUsuario;

    @NotNull
    @Column(name = "email")
    private String emailUsuario;

    @NotNull
    @Column(name = "senha")
    private String senhaUsuario;

}
