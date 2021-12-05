package com.tcc.manutencao_adm_ticket.security;

import com.tcc.manutencao_adm_ticket.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private ImplementsUserDetailsService userDetailsService;

//    @Bean
//    public static BCryptPasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Autowired
//    private UsuarioRepository usuarioRepository;
//
//    @Autowired
//    private ImplementsUserDetailsService implementsUserDetailsService;
//
//    @Override
//    public UserDetailsService userDetailsServiceBean() throws Exception{
//        return new ImplementsUserDetailsService(usuarioRepository);
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
//       http.authorizeRequests()
//               .antMatchers(HttpMethod.GET, "/").permitAll()
//               .antMatchers(HttpMethod.GET, "/cadastro_administrador").hasRole("ATENDENTE")
//               .antMatchers(HttpMethod.GET, "/home").hasRole("USER")
//               .anyRequest()
//               .authenticated()
//               .and()
//               .formLogin()
//               .permitAll()
//               .and()
//               .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//               .logoutSuccessUrl("/login").permitAll()
//               .and()
//               .httpBasic();
//
//       http.csrf().disable();
//       http.headers().frameOptions().disable();

        http.csrf().disable().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/").permitAll()
                .antMatchers(HttpMethod.GET, "/home").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/cadastrar_administrador").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/login").permitAll()
                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .and().exceptionHandling().accessDeniedPage("/login?error");

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//        auth.inMemoryAuthentication()
//                .withUser("thomass@gmail.com").password(passwordEncoder().encode("12345")).roles("ATENDENTE");
//        auth.userDetailsService(userDetailsServiceBean())
//                .passwordEncoder(passwordEncoder());
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    public void configure(WebSecurity web) throws Exception{
        web.ignoring().antMatchers("/materialize/**", "/css/**", "/img/**");
    }
}
