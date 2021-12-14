package com.tcc.manutencao_adm_ticket.repositorio;

import com.tcc.manutencao_adm_ticket.model.Usuario;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, String> {
    Usuario findByEmail(String email);
}