package com.ensa.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ensa.metier.UserDetailsService;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
@Autowired
private PasswordEncoder passwordEncoder;
@Autowired
private UserDetailsService userDetailsService;
 

// Pour l'identification
//Authentification
@Autowired
public void globalConfig(AuthenticationManagerBuilder auth) throws Exception {

}
// Pour les ressources
// Autorisation
@Override
protected void configure(HttpSecurity http) throws Exception {
	http
	  .httpBasic()
	  .and()
	     .authorizeRequests()
	        .antMatchers("/")
	           .permitAll()
	  .and()
	    .authorizeRequests()
	      .antMatchers("/conferences").authenticated()
	           .antMatchers("/conferences/**").hasRole("ADMIN");

}

@Bean
public BCryptPasswordEncoder passwordEncoder() {
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    return bCryptPasswordEncoder;
}

@Bean
DaoAuthenticationProvider authenticationProvider(){
	DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
	daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
    daoAuthenticationProvider.setUserDetailsService(this.userDetailsService);
    return daoAuthenticationProvider;
}


}