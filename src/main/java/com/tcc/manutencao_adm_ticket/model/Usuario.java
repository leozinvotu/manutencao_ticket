package com.tcc.manutencao_adm_ticket.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
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


    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getCidadeUsuario() {
        return cidadeUsuario;
    }

    public void setCidadeUsuario(String cidadeUsuario) {
        this.cidadeUsuario = cidadeUsuario;
    }

    public String getEmpresaUsuario() {
        return empresaUsuario;
    }

    public void setEmpresaUsuario(String empresaUsuario) {
        this.empresaUsuario = empresaUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public Usuario(int idUsuario, String nomeUsuario, String estadoUsuario, String cidadeUsuario, String empresaUsuario, String telefoneUsuario, String emailUsuario, String senhaUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.estadoUsuario = estadoUsuario;
        this.cidadeUsuario = cidadeUsuario;
        this.empresaUsuario = empresaUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idUsuario == usuario.idUsuario && Objects.equals(nomeUsuario, usuario.nomeUsuario) && Objects.equals(estadoUsuario, usuario.estadoUsuario) && Objects.equals(cidadeUsuario, usuario.cidadeUsuario) && Objects.equals(empresaUsuario, usuario.empresaUsuario) && Objects.equals(telefoneUsuario, usuario.telefoneUsuario) && Objects.equals(emailUsuario, usuario.emailUsuario) && Objects.equals(senhaUsuario, usuario.senhaUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, nomeUsuario, estadoUsuario, cidadeUsuario, empresaUsuario, telefoneUsuario, emailUsuario, senhaUsuario);
    }
}
