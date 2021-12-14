package com.tcc.manutencao_adm_ticket.service;

import com.tcc.manutencao_adm_ticket.exception.BadResourceException;
import com.tcc.manutencao_adm_ticket.exception.ResourceAlreadyExistsException;
import com.tcc.manutencao_adm_ticket.model.Usuario;
import com.tcc.manutencao_adm_ticket.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private boolean existsById(String email) {
        return usuarioRepository.existsById(email);
    }

    public Usuario findById(String email) throws ResourceNotFoundException {
        Usuario usuario = usuarioRepository.findById(email).orElse(null);
        if (usuario==null) {
            throw new ResourceNotFoundException("Não foi possivel encontrar o seguinte email: " + email);
        }
        else return usuario;
    }

    public Iterable<Usuario> findAll() {
        Iterable<Usuario> usuarios = usuarioRepository.findAll(Sort.by("email"));
        return usuarios;
    }

    public Usuario save(Usuario usuario) throws BadResourceException, ResourceAlreadyExistsException {
        if (!StringUtils.isEmpty(usuario.getEmail())) {
            if (usuario.getEmail() != null && existsById(usuario.getEmail())) {
                throw new ResourceAlreadyExistsException("Usuario com o email: " + usuario.getEmail() +
                        " ja existe");
            }
            return usuarioRepository.save(usuario);
        }
        else {
            BadResourceException exc = new BadResourceException("Falha ao salvar o usuario");
            exc.addErrorMessage("Usuario vazio ou nulo");
            throw exc;
        }
    }

    public void update(Usuario usuario)
            throws BadResourceException, ResourceNotFoundException {
        if (!StringUtils.isEmpty(usuario.getEmail())) {
            if (!existsById(usuario.getEmail())) {
                throw new ResourceNotFoundException("Não foi possivel localizar este usuario: " + usuario.getEmail());
            }
            usuarioRepository.save(usuario);
        }
        else {
            BadResourceException exc = new BadResourceException("Falha ao salvar o usuario");
            exc.addErrorMessage("Usuario vazio ou nulo");
            throw exc;
        }
    }

    public void deleteById(String email) throws ResourceNotFoundException {
        if (!existsById(email)) {
            throw new ResourceNotFoundException("Não foi possivel encontrar um usuario com o email: " + email);
        }
        else {
            usuarioRepository.deleteById(email);
        }
    }

    public Long count() {
        return usuarioRepository.count();
    }
}
