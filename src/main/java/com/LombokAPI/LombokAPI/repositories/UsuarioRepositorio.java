package com.LombokAPI.LombokAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LombokAPI.LombokAPI.entities.Usuario;

	public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

	}


