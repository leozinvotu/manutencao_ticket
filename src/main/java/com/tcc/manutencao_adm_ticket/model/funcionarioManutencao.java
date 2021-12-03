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
@Table(name = "funcionario_manutencao")
public class funcionarioManutencao {

    @Id
    @Column(name = "id_func_m")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFuncM;

    @NotNull
    @Column(name = "nome")
    private String nomeFuncManutencao;

    @NotNull
    @Column(name = "telefone")
    private String telefoneFuncManutencao;

    @Column(name = "cargo")
    private String cargoFuncManutencao;

    @NotNull
    @Column(name = "email")
    private String emailFuncManutencao;

    @NotNull
    @Column(name = "senha")
    private String senhaFuncManutencao;

    @Column(name = "id_administrador")
    private int idAdministrador;

}
