package com.tcc.manutencao_adm_ticket.repositorio;

import com.tcc.manutencao_adm_ticket.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {
    Usuario findByEmail(String email);
}