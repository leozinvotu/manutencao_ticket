package com.tcc.manutencao_adm_ticket.controller;

import com.tcc.manutencao_adm_ticket.exception.TicketNotFound;
import com.tcc.manutencao_adm_ticket.model.Ticket;
import com.tcc.manutencao_adm_ticket.model.Usuario;
import com.tcc.manutencao_adm_ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ticket")
@Controller
public class TicketController {

    private static  final int ROW_PER_PAGE = 5;

    @Autowired
    private TicketService ticketService;


    @PostMapping(value = "/cadastrar_ticket")
    public ModelAndView criandoTicket(Model model,
                                   @ModelAttribute("ticket") Ticket ticket) {
        try {
            Ticket newticket = ticketService.createTicket(ticket);
            return new ModelAndView("redirect:/ticket/listar_ticket");
        } catch (Exception ex) {
            String errorMessage = ex.getMessage();
            ModelAndView modelAndView = new ModelAndView("usuario/cadastrar_ticket");
            modelAndView.addObject("errorMessage", errorMessage);
            modelAndView.addObject("usuarioObj", new Usuario());
            modelAndView.addObject("roles", ticketService.findAll());
            return modelAndView;
        }
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Ticket findById(@PathVariable Long id) throws TicketNotFound {
        return ticketService.findById(id);

    }

    @GetMapping("/All")
    public List<Ticket> listAll() throws TicketNotFound{
        return (List<Ticket>) ticketService.findAll();

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id)throws  TicketNotFound{
        ticketService.deleteById(id);

    }


}


