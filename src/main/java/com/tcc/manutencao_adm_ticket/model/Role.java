package com.tcc.manutencao_adm_ticket.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "role")
public class Role implements GrantedAuthority {

    @Id
    @NotNull
    @Column(name = "nome_role")
    private String role;

    @ManyToMany(mappedBy = "roles")
    private Collection<Usuario> usuarios;

    @Override
    public String getAuthority() {
        // TODO Auto-generated method stub
        return this.role;
    }
}
