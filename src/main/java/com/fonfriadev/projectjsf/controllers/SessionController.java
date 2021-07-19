package com.fonfriadev.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.fonfriadev.projectjsf.dto.UsuarioDTO;

@ManagedBean
@SessionScoped
public class SessionController {
	
	private UsuarioDTO usuarioDTO;
	
	@PostConstruct
	public void init() {
		System.out.println("Cargando información del usuario en la sesión...");
	}

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	
}
