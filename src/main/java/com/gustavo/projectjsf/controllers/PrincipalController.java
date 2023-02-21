package com.gustavo.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import com.gustavo.projectjsf.entity.Empleado;
import com.gustavo.projectjsf.services.EmpleadoService;

/**
 * Clase encargada de procesar la informacion para la nueva Pagina.
 * (nuevaPagina.xhtml)
 * 
 * @author Calistos
 *
 */
@ManagedBean(name = "principal")
//Procesar la informacion a nivel de pantalla(Es decir, mantiene la informacion que se esta viendo actualmente en esa pestalla
//antes de que se traslade a otra pantalla.):
@ViewScoped
public class PrincipalController {

	/**
	 * Lista de empleados para la tabla. (Se sacan del objeto que traemos de otra
	 * clase y los guardamos aca para posteriormente procesarlos)
	 */
	private List<Empleado> empleados;

	/**
	 * Servicio con los metodos que realizan la logica de negocio de empleados.
	 */
	private EmpleadoService empleadoService = new EmpleadoService();

	/**
	 * Metodo que se encarga de inicializar la informacion de la nueva pagina.
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	/**
	 * Metodo que consulta la lista de empleados.
	 */
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
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
