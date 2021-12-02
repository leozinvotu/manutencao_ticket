package com.tcc.manutencao_adm_ticket.model;


import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
public class Manutencao {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idManutencao;

    @NotNull
    @Column
    private String statusManutencao;

    @NotNull
    @Column
    private  String materiaisUtilizados;

    @NotNull
    @Column
    private Timestamp dataLicitacao;

    @Column(name = "id_func_m")
    private int idFuncM;

    @Column(name = "id_ticket")
    private int idTicket;

    public int getIdManutencao() {
        return idManutencao;
    }

    public void setIdManutencao(int idManutencao) {
        this.idManutencao = idManutencao;
    }

    public String getStatusManutencao() {
        return statusManutencao;
    }

    public void setStatusManutencao(String statusManutencao) {
        this.statusManutencao = statusManutencao;
    }

    public String getMateriaisUtilizados() {
        return materiaisUtilizados;
    }

    public void setMateriaisUtilizados(String materiaisUtilizados) {
        this.materiaisUtilizados = materiaisUtilizados;
    }

    public Timestamp getDataLicitacao() {
        return dataLicitacao;
    }

    public void setDataLicitacao(Timestamp dataLicitacao) {
        this.dataLicitacao = dataLicitacao;
    }

    public int getIdFuncM() {
        return idFuncM;
    }

    public void setIdFuncM(int idFuncM) {
        this.idFuncM = idFuncM;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public Manutencao(int idManutencao, String statusManutencao, String materiaisUtilizados, Timestamp dataLicitacao, int idFuncM, int idTicket) {
        this.idManutencao = idManutencao;
        this.statusManutencao = statusManutencao;
        this.materiaisUtilizados = materiaisUtilizados;
        this.dataLicitacao = dataLicitacao;
        this.idFuncM = idFuncM;
        this.idTicket = idTicket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manutencao that = (Manutencao) o;
        return idManutencao == that.idManutencao && idFuncM == that.idFuncM && idTicket == that.idTicket && Objects.equals(statusManutencao, that.statusManutencao) && Objects.equals(materiaisUtilizados, that.materiaisUtilizados) && Objects.equals(dataLicitacao, that.dataLicitacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idManutencao, statusManutencao, materiaisUtilizados, dataLicitacao, idFuncM, idTicket);
    }
}
