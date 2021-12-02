package com.tcc.manutencao_adm_ticket.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
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


    public int getIdAtendente() {
        return idAtendente;
    }

    public void setIdAtendente(int idAtendente) {
        this.idAtendente = idAtendente;
    }

    public String getNomeAtendente() {
        return nomeAtendente;
    }

    public void setNomeAtendente(String nomeAtendente) {
        this.nomeAtendente = nomeAtendente;
    }

    public String getTelefoneAtendente() {
        return telefoneAtendente;
    }

    public void setTelefoneAtendente(String telefoneAtendente) {
        this.telefoneAtendente = telefoneAtendente;
    }

    public String getCargoAtendente() {
        return cargoAtendente;
    }

    public void setCargoAtendente(String cargoAtendente) {
        this.cargoAtendente = cargoAtendente;
    }

    public String getEmailAtendente() {
        return emailAtendente;
    }

    public void setEmailAtendente(String emailAtendente) {
        this.emailAtendente = emailAtendente;
    }

    public String getSenhaAtendente() {
        return senhaAtendente;
    }

    public void setSenhaAtendente(String senhaAtendente) {
        this.senhaAtendente = senhaAtendente;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Atendente(int idAtendente, String nomeAtendente, String telefoneAtendente, String cargoAtendente, String emailAtendente, String senhaAtendente, int idAdministrador) {
        this.idAtendente = idAtendente;
        this.nomeAtendente = nomeAtendente;
        this.telefoneAtendente = telefoneAtendente;
        this.cargoAtendente = cargoAtendente;
        this.emailAtendente = emailAtendente;
        this.senhaAtendente = senhaAtendente;
        this.idAdministrador = idAdministrador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atendente atendente = (Atendente) o;
        return idAtendente == atendente.idAtendente && idAdministrador == atendente.idAdministrador && Objects.equals(nomeAtendente, atendente.nomeAtendente) && Objects.equals(telefoneAtendente, atendente.telefoneAtendente) && Objects.equals(cargoAtendente, atendente.cargoAtendente) && Objects.equals(emailAtendente, atendente.emailAtendente) && Objects.equals(senhaAtendente, atendente.senhaAtendente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAtendente, nomeAtendente, telefoneAtendente, cargoAtendente, emailAtendente, senhaAtendente, idAdministrador);
    }
}
