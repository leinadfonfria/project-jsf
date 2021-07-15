package com.fonfriadev.projectjsf.services;

import java.util.List;

import com.fonfriadev.projectjsf.entity.Empleado;

/**
 * @author danie
 * 
 * Gestión de emppleados
 *
 */
public class EmpleadoService {

	/**
	 * @return {@link Empleado} lista de empleados.
	 * */
	public List<Empleado> consultarEmpleados() {
		return List.of(
				new Empleado("Juan", "Pérez", "Rodríguez", "Senior Developer Java", true),
				new Empleado("Pedro", "García", "Rodríguez", "CEO", true),
				new Empleado("Ana", "López", "Rodríguez", "Architect", true)
			);
	}
}
