package com.tcc.manutencao_adm_ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/index");
        return mv;
    }

    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }

    @RequestMapping("/home")
    public String home()
    {
        return "home";
    }

    @RequestMapping("/cadastro_administrador")
    public String cadastro_administrador()
    {
        return "cadastro_administrador";
    }
}
