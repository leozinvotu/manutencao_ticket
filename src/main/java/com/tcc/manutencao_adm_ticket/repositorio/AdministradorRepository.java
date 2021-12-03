package com.tcc.manutencao_adm_ticket.repositorio;

import com.tcc.manutencao_adm_ticket.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorRepository extends JpaRepository<Administrador, Integer> {
}