package com.tcc.manutencao_adm_ticket.controller;

import com.tcc.manutencao_adm_ticket.model.Usuario;
import com.tcc.manutencao_adm_ticket.repositorio.RoleRepository;
import com.tcc.manutencao_adm_ticket.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/usuario")
@Controller
public class UsuarioController {

    private static final int ROW_PER_PAGE = 5;
    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private RoleRepository roleRepository;

    //LISTAR USUARIOS
    @RequestMapping(value = "/listar_usuario", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView getUsuarios(Model model) {
        ModelAndView modelAndView = new ModelAndView("administrador/listar_usuario");
        Iterable<Usuario> usuarios = usuarioService.findAll();
        modelAndView.addObject("usuarios", usuarios);
        return modelAndView;
    }

    //BUSCAR POR EMAIL
    @PostMapping("/listar_usuario")
    public ModelAndView buscar_usuario(Model model, @RequestParam("email")String email) {
        ModelAndView modelAndView = new ModelAndView("administrador/listar_usuario");
        Usuario usuario = null;
        try {
            usuario = usuarioService.findById(email);
        } catch (ResourceNotFoundException ex) {
            model.addAttribute("errorMessage", "Nenhum email encontrado");
        }
        modelAndView.addObject("usuarios", usuario);
        return modelAndView;
    }


    //CADASTRAR USUARIO
    @GetMapping("/cadastrar_usuario")
    public ModelAndView salvar(@Validated Usuario usuario)
    {
        ModelAndView modelAndView = new ModelAndView("administrador/cadastrar_usuario");
        modelAndView.addObject("usuarioObj", new Usuario());
        modelAndView.addObject("roles", roleRepository.findAll(Sort.by("nomeRole")));
        return modelAndView;
    }


    @PostMapping(value = "/cadastrar_usuario")
    public ModelAndView addUsuario(Model model,
                                   @ModelAttribute("usuario") Usuario usuario) {
        try {
            Usuario newUsuario = usuarioService.save(usuario);
            return new ModelAndView("redirect:/usuario/listar_usuario");
        } catch (Exception ex) {
            String errorMessage = ex.getMessage();
            ModelAndView modelAndView = new ModelAndView("administrador/cadastrar_usuario");
            modelAndView.addObject("errorMessage", errorMessage);
            modelAndView.addObject("usuarioObj", new Usuario());
            modelAndView.addObject("roles", roleRepository.findAll());
            return modelAndView;
        }
    }




}

