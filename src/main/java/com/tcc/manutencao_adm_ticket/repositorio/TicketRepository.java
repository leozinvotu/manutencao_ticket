package com.tcc.manutencao_adm_ticket.repositorio;

import com.tcc.manutencao_adm_ticket.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
