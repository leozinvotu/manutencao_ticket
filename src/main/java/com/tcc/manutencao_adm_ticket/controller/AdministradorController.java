package com.tcc.manutencao_adm_ticket.controller;

import com.tcc.manutencao_adm_ticket.model.Administrador;
import com.tcc.manutencao_adm_ticket.repositorio.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdministradorController {

    @Autowired
    private AdministradorRepository administradorRepository;

    @GetMapping("/administrador/login")
    public ModelAndView loginAdmin(Administrador administrador)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login_administrador");
        mv.addObject("administrador", new Administrador());
        return mv;
    }
}
