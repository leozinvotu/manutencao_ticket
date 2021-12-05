package com.tcc.manutencao_adm_ticket.controller;

import com.tcc.manutencao_adm_ticket.model.Usuario;
import com.tcc.manutencao_adm_ticket.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/usuario/login")
    public ModelAndView loginUsuario(Usuario usuario)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login_usuario");
        mv.addObject("usuario", new Usuario());
        return mv;
    }
}
