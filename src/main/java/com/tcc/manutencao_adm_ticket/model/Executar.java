package com.tcc.manutencao_adm_ticket.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
public class Executar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_executar")
    private int idExecuta;

    @Column(name = "data_execucao")
    private Timestamp dataExcucao;

    @Column(name = "id_func_m")
    private  int idFuncMfk;

    public int getIdExecuta() {
        return idExecuta;
    }

    public void setIdExecuta(int idExecuta) {
        this.idExecuta = idExecuta;
    }

    public Timestamp getDataExcucao() {
        return dataExcucao;
    }

    public void setDataExcucao(Timestamp dataExcucao) {
        this.dataExcucao = dataExcucao;
    }

    public int getIdFuncMfk() {
        return idFuncMfk;
    }

    public void setIdFuncMfk(int idFuncMfk) {
        this.idFuncMfk = idFuncMfk;
    }

    public Executar(int idExecuta, Timestamp dataExcucao, int idFuncMfk) {
        this.idExecuta = idExecuta;
        this.dataExcucao = dataExcucao;
        this.idFuncMfk = idFuncMfk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Executar executar = (Executar) o;
        return idExecuta == executar.idExecuta && idFuncMfk == executar.idFuncMfk && Objects.equals(dataExcucao, executar.dataExcucao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idExecuta, dataExcucao, idFuncMfk);
    }
}
