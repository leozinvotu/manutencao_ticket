package com.tcc.manutencao_adm_ticket.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
public class Ticket {

    @Id
    @Column(name = "id_ticket")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTicket;

    @NotNull
    @Column
    private String titulo;

    @NotNull
    @Column
    private String descricao;

    @NotNull
    @Column(name = "status_Ticket")
    private String statusTicket;

    @NotNull
    @Column(name = "data_solicitacao")
    private Timestamp dataSolicitacao;

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatusTicket() {
        return statusTicket;
    }

    public void setStatusTicket(String statusTicket) {
        this.statusTicket = statusTicket;
    }

    public Timestamp getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Timestamp dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Ticket(int idTicket, String titulo, String descricao, String statusTicket, Timestamp dataSolicitacao) {
        this.idTicket = idTicket;
        this.titulo = titulo;
        this.descricao = descricao;
        this.statusTicket = statusTicket;
        this.dataSolicitacao = dataSolicitacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return idTicket == ticket.idTicket && Objects.equals(titulo, ticket.titulo) && Objects.equals(descricao, ticket.descricao) && Objects.equals(statusTicket, ticket.statusTicket) && Objects.equals(dataSolicitacao, ticket.dataSolicitacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTicket, titulo, descricao, statusTicket, dataSolicitacao);
    }
}
