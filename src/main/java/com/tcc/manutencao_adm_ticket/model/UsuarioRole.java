package com.tcc.manutencao_adm_ticket.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario_role")
public class UsuarioRole {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_role")
    private int idUsuarioCargo;

    @NotNull
    @Column(name = "email_usuario")
    private String emailUsuario;

    @NotNull
    @Column(name = "nome_role")
    private String nomeRole;
}
