package com.fonfriadev.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import com.fonfriadev.projectjsf.dto.UsuarioDTO;

/**
 * 
 * @author Fonfriadev
 * Clase que permite controlar el funcionamiento de la pantalla de login.xhtml
 *
 */

@ManagedBean
public class LoginController {
	
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	
	public void ingresar() {
		
		System.out.println("Usuario conectado: " + usuario);
		
		if(usuario.equals("dani") && password.equals("1234")) {
			
			try {
				sessionController.setUsuarioDTO(new UsuarioDTO(usuario, password));
				redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage(
						"formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe",""));
			}
			
		} else {
			
			FacesContext.getCurrentInstance().addMessage(
					"formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o contraseña incorrectos",""));
		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect(pagina);
	}

	private String usuario;
	private String password;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}

	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}
	
	
}
