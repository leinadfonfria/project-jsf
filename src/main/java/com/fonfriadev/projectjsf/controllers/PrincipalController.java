package com.fonfriadev.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.fonfriadev.projectjsf.entity.Empleado;
import com.fonfriadev.projectjsf.services.EmpleadoService;

@ManagedBean
@ViewScoped
public class PrincipalController {

	private List<Empleado> empleados;
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/**
	 * Inicializa la información de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		consultarEmpleados();
	}
	
	public void consultarEmpleados() {
		empleados = empleadoService.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
}
