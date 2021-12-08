package com.tcc.manutencao_adm_ticket.controller;

import com.tcc.manutencao_adm_ticket.model.Usuario;
import com.tcc.manutencao_adm_ticket.repositorio.UsuarioRepository;
import com.tcc.manutencao_adm_ticket.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/addUsuario")
    public Usuario addUsuario(@RequestBody Usuario usuario){
        return usuarioService.criandoUsuario(usuario);
    }

    @GetMapping("/todosUsuarios")
    public List<Usuario> findAllUsuarios(){
        return usuarioService.findAll();

    }

    @GetMapping("/usuario/{email}")
    public Usuario findUsuarioById(@PathVariable String email){
        return usuarioService.buscandoUsuarioId(email);
    }

    @PutMapping("/updateUsuario")
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping("/deleteUsuario/{id}")
    public String deleteUsuario(@PathVariable String email){
        return usuarioService.deleteUsuario(email);
    }
}
