package com.gustavo.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.gustavo.projectjsf.entity.Empleado;

/**
 * Clase que permite realizar la logica de negocio para empleados.
 * 
 * @author Calistos
 *
 */
public class EmpleadoService {

	/**
	 * Metodo que se encarga de consultar la lista de empleados de las empresas IT.
	 * @return {@link List} <{@link Empleado}>
	 */
	public List<Empleado> consultarEmpleados() {

		// Lista de empleados a consultar:
		List<Empleado> empleados = new ArrayList<>();

		// Instancia de empleados a guardarse en el listado:
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoGoogle = new Empleado();
		Empleado empleadoMeta = new Empleado();
		Empleado empleadoInstagram = new Empleado();
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoYoutube = new Empleado();
		Empleado empleadoLinkedin = new Empleado();
		Empleado empleadoMercadoLibre = new Empleado();

		// IBM:
		empleadoIBM.setNombre("Axel");
		empleadoIBM.setApellido("Peralta");
		empleadoIBM.setPuesto("Ingeniero Software");
		empleadoIBM.setEstatus(true);

		// GOOGLE:
		empleadoGoogle.setNombre("Alexis");
		empleadoGoogle.setApellido("Avila");
		empleadoGoogle.setPuesto("CEO");
		empleadoGoogle.setEstatus(true);

		// META:
		empleadoMeta.setNombre("Mauricio");
		empleadoMeta.setApellido("Avila");
		empleadoMeta.setPuesto("Ingeniero Cloud");
		empleadoMeta.setEstatus(true);

		// INSTAGRAM:
		empleadoInstagram.setNombre("Mario");
		empleadoInstagram.setApellido("Bearzi");
		empleadoInstagram.setPuesto("Desarrollador");
		empleadoInstagram.setEstatus(true);

		// NETFLIX:
		empleadoNetflix.setNombre("Noe");
		empleadoNetflix.setApellido("Rodriguez");
		empleadoNetflix.setPuesto("Desarrollador");
		empleadoNetflix.setEstatus(true);

		// YOUTUBE:
		empleadoYoutube.setNombre("Nilda");
		empleadoYoutube.setApellido("Carnero");
		empleadoYoutube.setPuesto("CEO");
		empleadoYoutube.setEstatus(true);

		// LINKEDIN:
		empleadoLinkedin.setNombre("Manuel");
		empleadoLinkedin.setApellido("Carnero");
		empleadoLinkedin.setPuesto("CEO");
		empleadoLinkedin.setEstatus(true);

		// MERCADO LIBRE:
		empleadoMercadoLibre.setNombre("Gustavo");
		empleadoMercadoLibre.setApellido("Bearzi");
		empleadoMercadoLibre.setPuesto("Ingeniero IA");
		empleadoMercadoLibre.setEstatus(true);
		
		
		// Agregar los empleados al listado.
		empleados.add(empleadoIBM);
		empleados.add(empleadoGoogle);
		empleados.add(empleadoMeta);
		empleados.add(empleadoInstagram);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoYoutube);
		empleados.add(empleadoLinkedin);
		empleados.add(empleadoMercadoLibre);

		// Retorno de la lista:
		return empleados;
	}
}
