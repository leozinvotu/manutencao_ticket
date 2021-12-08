package com.tcc.manutencao_adm_ticket.service;

import com.tcc.manutencao_adm_ticket.exception.UsuarioNotFound;
import com.tcc.manutencao_adm_ticket.model.Usuario;
import com.tcc.manutencao_adm_ticket.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criandoUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll(){
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario buscandoUsuarioId(String email){
        return usuarioRepository.findById(email).orElse(null);

    }

    public String deleteUsuario(String email){
        usuarioRepository.deleteById(email);
        return "Usuario Removido com sucesso !!" + email;
    }

    public Usuario updateUsuario(Usuario usuario){
        Optional<Usuario> usuarioEntidade = usuarioRepository.findById(usuario.getEmail());

        Usuario usu;
        if(usuarioEntidade.isPresent()){
            usu = usuarioEntidade.get();
        }else{
            throw new UsuarioNotFound();
        }
        usu.setNomeUsuario(usuario.getNomeUsuario());
        usu.setEstado(usuario.getEstado());
        usu.setCidade(usuario.getCidade());
        usu.setEmpresa(usuario.getEmpresa());
        usu.setTelefone(usuario.getTelefone());
        usu.setEmail(usuario.getEmail());
        usu.setSenha(usuario.getSenha());

        return usuarioRepository.save(usu);
    }
}
