package com.tcc.manutencao_adm_ticket.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
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

    public int getIdFuncM() {
        return idFuncM;
    }

    public void setIdFuncM(int idFuncM) {
        this.idFuncM = idFuncM;
    }

    public String getNomeFuncManutencao() {
        return nomeFuncManutencao;
    }

    public void setNomeFuncManutencao(String nomeFuncManutencao) {
        this.nomeFuncManutencao = nomeFuncManutencao;
    }

    public String getTelefoneFuncManutencao() {
        return telefoneFuncManutencao;
    }

    public void setTelefoneFuncManutencao(String telefoneFuncManutencao) {
        this.telefoneFuncManutencao = telefoneFuncManutencao;
    }

    public String getCargoFuncManutencao() {
        return cargoFuncManutencao;
    }

    public void setCargoFuncManutencao(String cargoFuncManutencao) {
        this.cargoFuncManutencao = cargoFuncManutencao;
    }

    public String getEmailFuncManutencao() {
        return emailFuncManutencao;
    }

    public void setEmailFuncManutencao(String emailFuncManutencao) {
        this.emailFuncManutencao = emailFuncManutencao;
    }

    public String getSenhaFuncManutencao() {
        return senhaFuncManutencao;
    }

    public void setSenhaFuncManutencao(String senhaFuncManutencao) {
        this.senhaFuncManutencao = senhaFuncManutencao;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public funcionarioManutencao(int idFuncM, String nomeFuncManutencao, String telefoneFuncManutencao, String cargoFuncManutencao, String emailFuncManutencao, String senhaFuncManutencao, int idAdministrador) {
        this.idFuncM = idFuncM;
        this.nomeFuncManutencao = nomeFuncManutencao;
        this.telefoneFuncManutencao = telefoneFuncManutencao;
        this.cargoFuncManutencao = cargoFuncManutencao;
        this.emailFuncManutencao = emailFuncManutencao;
        this.senhaFuncManutencao = senhaFuncManutencao;
        this.idAdministrador = idAdministrador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        funcionarioManutencao that = (funcionarioManutencao) o;
        return idFuncM == that.idFuncM && idAdministrador == that.idAdministrador && Objects.equals(nomeFuncManutencao, that.nomeFuncManutencao) && Objects.equals(telefoneFuncManutencao, that.telefoneFuncManutencao) && Objects.equals(cargoFuncManutencao, that.cargoFuncManutencao) && Objects.equals(emailFuncManutencao, that.emailFuncManutencao) && Objects.equals(senhaFuncManutencao, that.senhaFuncManutencao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFuncM, nomeFuncManutencao, telefoneFuncManutencao, cargoFuncManutencao, emailFuncManutencao, senhaFuncManutencao, idAdministrador);
    }
}
