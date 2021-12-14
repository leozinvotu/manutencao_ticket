package com.tcc.manutencao_adm_ticket.model;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario implements UserDetails {

    @Id
    @Column(name = "email_usuario")
    private String email;

    @NotNull
    @Column(name = "nome")
    private String nomeUsuario;

    @NotNull
    @Column(name = "estado")
    private String estado;

    @NotNull
    @Column(name = "cidade")
    private String cidade;

    @NotNull
    @Column(name = "empresa")
    private String empresa;

    @NotNull
    @Column(name = "telefone")
    private String telefone;

    @NotNull
    @Column(name = "senha")
    private String senha;

//    @ManyToMany
//    @JoinTable(name = "usuario_role",
//            joinColumns = @JoinColumn(name = "email_usuario"),
//            inverseJoinColumns = @JoinColumn(name = "nome_role"))
//    private Collection<Role> roles;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="nome_role", nullable=false)
    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(this.role);
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return this.senha;
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }

}
