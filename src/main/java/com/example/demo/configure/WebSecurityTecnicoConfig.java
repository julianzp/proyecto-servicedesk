package com.example.demo.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.service.TecnicoLoginService;
import com.example.demo.service.TecnicoService;
import com.example.demo.service.Impl.TecnicoLoginServiceImpl;


@Configuration
public class WebSecurityTecnicoConfig extends WebSecurityConfigurerAdapter{

	@Autowired
    private TecnicoLoginServiceImpl tecnicoLoginServiceImpl;
	
	 public WebSecurityTecnicoConfig() {
	        super();
	    }
	 
	//Necesario para evitar que la seguridad se aplique a los resources
	    //Como los css, imagenes y javascripts
	    String[] resources = new String[]{
	            "/include/**","/css/**","/icons/**","/image/**","/js/**","/layer/**"
	    };
	
	 
	    protected void configure(HttpSecurity http) throws Exception {
	 
	    	http
            .authorizeRequests()
	        .antMatchers(resources).permitAll()
	       
                .and()
            .formLogin()
                .loginPage("/loginUser")
                .failureUrl("/loginUser?error=true")
                .defaultSuccessUrl("/incidentes/listadoincidentestecnico")
                //.usernameParameter("username")
                //.passwordParameter("password")
                .and()
            .logout()
                .permitAll()
                .logoutSuccessUrl("/loginUser?logout");
                
	    }
	    
@Bean
public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}


	    
	    @Bean
	    public DaoAuthenticationProvider authenticationProvider() {
	        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
	        auth.setUserDetailsService(tecnicoLoginServiceImpl);
	        auth.setPasswordEncoder(passwordEncoder());
	        return auth;
	    }

	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.authenticationProvider(authenticationProvider());
	    }
		
	    
	/*
	 * @Bean public BCryptPasswordEncoder passwordEncoder() { BCryptPasswordEncoder
	 * bCryptPasswordEncoder = new BCryptPasswordEncoder(4); //El numero 4
	 * representa que tan fuerte quieres la encriptacion. //Se puede en un rango
	 * entre 4 y 31. //Si no pones un numero el programa utilizara uno
	 * aleatoriamente cada vez //que inicies la aplicacion, por lo cual tus
	 * contrasenas encriptadas no funcionaran bien return bCryptPasswordEncoder; }
	 * 
	 * 
	 * @Autowired TecnicoDetailsServiceImpl TecnicoDetailsServiceImpl;
	 * 
	 * //Registra el service para usuarios y el encriptador de contrasena
	 * 
	 * @Autowired public void configureGlobal(AuthenticationManagerBuilder auth)
	 * throws Exception {
	 * 
	 * // Setting Service to find User in the database.
	 * auth.userDetailsService(TecnicoDetailsServiceImpl).passwordEncoder(
	 * passwordEncoder()); }
	 */
		
			

}
