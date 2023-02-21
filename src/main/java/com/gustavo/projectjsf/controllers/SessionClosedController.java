package com.gustavo.projectjsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * Clase que se encargade cerrar la seccion del usuario.
 * @author Calistos
 *
 */
@ManagedBean
public class SessionClosedController {

	@PostConstruct
	public void init() {
		System.out.println("Cerrar session...");
	}
	
	/**
	 * Metodo que permite cerrar la session y regresar al logion.
	 */
	public void cerrarSession() {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.invalidateSession();
		
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void redireccionar(String paginaARedirecionar) throws IOException {
		// Objeto que permite el redireccionamiento.
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();

		// Metodo del objeto ExternalContext que redirecciona a la pagina.
		ec.redirect(paginaARedirecionar);
	}
}
