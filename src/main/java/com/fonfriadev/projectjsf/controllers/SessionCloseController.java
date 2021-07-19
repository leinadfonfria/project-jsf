package com.fonfriadev.projectjsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class SessionCloseController {

	@PostConstruct
	public void init() {
		System.out.println("Cerrar sesión");
	}
	
	public void cerrarSesion() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		try {
			redireccionar("login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect(pagina);
	}
}
