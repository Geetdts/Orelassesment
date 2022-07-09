package com.assessment.userRegistration.Controller;
import com.assessment.userRegistration.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.Collections;

public class CustomUserDetails implements UserDetails {

    @Autowired//Bind User entity
    private User user;
    public CustomUserDetails(User user) {
        super();
        this.user = user;
    }
    @Autowired //Bind model Mapper
    private ModelMapper modelMapper;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       return Collections.singleton(new SimpleGrantedAuthority(user.getRole()));

    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
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
