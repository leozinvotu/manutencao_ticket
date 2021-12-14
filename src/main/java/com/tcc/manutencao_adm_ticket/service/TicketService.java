package com.tcc.manutencao_adm_ticket.service;

import com.tcc.manutencao_adm_ticket.exception.TicketNotFound;
import com.tcc.manutencao_adm_ticket.model.Ticket;
import com.tcc.manutencao_adm_ticket.model.Usuario;
import com.tcc.manutencao_adm_ticket.repositorio.TicketRepository;
import com.tcc.manutencao_adm_ticket.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    public Iterable<Ticket> findAll() {
        Iterable<Ticket> tickets = ticketRepository.findAll();
        return tickets;
    }

    public Ticket findById(Long id) throws ResourceNotFoundException {
        Ticket ticket = ticketRepository.findById(id).orElse(null);
        if (ticket==null) {
            throw new ResourceNotFoundException("Não foi possivel encontrar o ticket referente ao id: " + id);
        }
        else return ticket;
    }

    public Ticket createTicket(Ticket ticket){
        Usuario usuario=usuarioRepository.findById(ticket.getEmailUsuario()).orElse(null);
        if(usuario!=null){

            ticket.setEmailUsuario(String.valueOf(usuario));
            ticketRepository.save(ticket);
        }
        return ticket;
    }

    public Ticket update(final Long id, final Ticket dto) {
        final Optional<Ticket> ticketEntity = ticketRepository.findById(id);
        final Ticket ticket;

        if (ticketEntity.isPresent()) {
            ticket = ticketEntity.get();
        }else {
            throw new TicketNotFound();
        }

        ticket.setTitulo(dto.getTitulo());
        ticket.setDescricao(dto.getDescricao());
        ticket.setDataSolicitacao(dto.getDataSolicitacao());

        return ticketRepository.save(ticket);
    }

    private boolean existsById(Long id) {
        return ticketRepository.existsById(id);
    }

    public void deleteById(Long id) throws ResourceNotFoundException {
        if (!existsById(id)) {
            throw new ResourceNotFoundException("Não foi possivel encontrar um ticket o ID: " + id);
        }
        else {
            ticketRepository.deleteById(id);
        }
    }








}
