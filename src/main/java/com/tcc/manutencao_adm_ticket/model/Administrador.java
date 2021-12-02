package com.tcc.manutencao_adm_ticket.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
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

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNomeAdministrador() {
        return nomeAdministrador;
    }

    public void setNomeAdministrador(String nomeAdministrador) {
        this.nomeAdministrador = nomeAdministrador;
    }

    public String getTelefoneAdministrador() {
        return telefoneAdministrador;
    }

    public void setTelefoneAdministrador(String telefoneAdministrador) {
        this.telefoneAdministrador = telefoneAdministrador;
    }

    public String getCargoAdministrador() {
        return cargoAdministrador;
    }

    public void setCargoAdministrador(String cargoAdministrador) {
        this.cargoAdministrador = cargoAdministrador;
    }

    public String getEmailAdministrador() {
        return emailAdministrador;
    }

    public void setEmailAdministrador(String emailAdministrador) {
        this.emailAdministrador = emailAdministrador;
    }

    public String getSenhaAdministrador() {
        return senhaAdministrador;
    }

    public void setSenhaAdministrador(String senhaAdministrador) {
        this.senhaAdministrador = senhaAdministrador;
    }

    public Administrador(int idAdministrador, String nomeAdministrador, String telefoneAdministrador, String cargoAdministrador, String emailAdministrador, String senhaAdministrador) {
        this.idAdministrador = idAdministrador;
        this.nomeAdministrador = nomeAdministrador;
        this.telefoneAdministrador = telefoneAdministrador;
        this.cargoAdministrador = cargoAdministrador;
        this.emailAdministrador = emailAdministrador;
        this.senhaAdministrador = senhaAdministrador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Administrador that = (Administrador) o;
        return idAdministrador == that.idAdministrador && Objects.equals(nomeAdministrador, that.nomeAdministrador) && Objects.equals(telefoneAdministrador, that.telefoneAdministrador) && Objects.equals(cargoAdministrador, that.cargoAdministrador) && Objects.equals(emailAdministrador, that.emailAdministrador) && Objects.equals(senhaAdministrador, that.senhaAdministrador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAdministrador, nomeAdministrador, telefoneAdministrador, cargoAdministrador, emailAdministrador, senhaAdministrador);
    }
}
