package com.example.demo.service.Impl;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Tecnico;
import com.example.demo.repository.TecnicoLoginRepository;
import com.example.demo.service.TecnicoLoginService;

@Service
public class TecnicoLoginServiceImpl implements TecnicoLoginService {

	@Autowired
	TecnicoLoginRepository tecnicoLoginReposiory;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Tecnico tecnico = tecnicoLoginReposiory.findByUsername(username);
        if (tecnico == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
		
        return new org.springframework.security.core.userdetails.User(tecnico.getUsername(),
                tecnico.getPassword(),
                getAuthorities());
		

	}
	
	 @Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {        
	        return new HashSet<GrantedAuthority>();
	    }

	@Override
	public Tecnico findByUsername(String username) {
		
		return tecnicoLoginReposiory.findByUsername(username);

		
	}

}
