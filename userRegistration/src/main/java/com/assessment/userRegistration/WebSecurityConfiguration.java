package com.assessment.userRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsService userDetailsService;
    AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider
                =new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder());
        return provider;
    }
//set Authorizations here
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //for the testing allowed for all users all paths
        http.authorizeRequests().antMatchers("/user/getUsers").permitAll();
        http.authorizeRequests().antMatchers("/user/saveUser").permitAll();
        http.authorizeRequests().antMatchers("/user/updateUser").permitAll();
        http.authorizeRequests().antMatchers("/user/deleteUser").permitAll();
        http.authorizeRequests().antMatchers("/user/getUserByUserID/{userID}").permitAll();
//        http.authorizeHttpRequests()
//                .antMatchers("/")
//                .permitAll()
//                .antMatchers("/user/getUsers")
//                .permitAll()
//                .antMatchers("/user/getUsers")
//                .hasAuthority("USER")
//                .antMatchers("/user/getUsers")
//                .hasAuthority("ADMIN")
//                .anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic();

    }
}
