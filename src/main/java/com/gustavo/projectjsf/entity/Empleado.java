package com.gustavo.projectjsf.entity;

/**
 * Clase que representa a un empleado.
 * @author Calistos
 *
 */
public class Empleado {

	/**
	 * Nombre del empleado.
	 */
	private String nombre;
	/**
	 * Apellido del empleado.
	 */
	private String apellido;
	/**
	 * Puesto del empleado.
	 */
	private String puesto;
	/**
	 * Estado del empelado
	 */
	private boolean estatus;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
}
