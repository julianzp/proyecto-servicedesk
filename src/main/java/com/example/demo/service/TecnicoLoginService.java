package com.example.demo.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.entity.Tecnico;

public interface TecnicoLoginService extends UserDetailsService{

	Tecnico findByUsername(String username);

	Collection<? extends GrantedAuthority> getAuthorities();
}
