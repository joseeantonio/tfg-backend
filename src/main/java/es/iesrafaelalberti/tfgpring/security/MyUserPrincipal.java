package es.iesrafaelalberti.tfgpring.security;

import es.iesrafaelalberti.tfgpring.models.Cliente;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class MyUserPrincipal implements UserDetails {
    private Cliente cliente;

    public MyUserPrincipal(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//        ArrayList<GrantedAuthority> resultado = new ArrayList<>();
//        if(Cliente.admin())
//            resultado.add(new SimpleGrantedAuthority("ADMIN"));
//        return resultado;
        return null;
    }

    @Override
    public String getPassword() {
        return cliente.getContraseña();
    }

    @Override
    public String getUsername() {
        return cliente.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}