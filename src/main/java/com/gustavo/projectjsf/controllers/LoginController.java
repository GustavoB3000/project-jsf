package com.gustavo.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;


/**
 * 
 * @author Calistos
 */
@ManagedBean(name = "log")
public class LoginController {
	/**
	 * Usuario.
	 */
	private String user;
	/**
	 * Contraseña.
	 */
	private String password;

	public void mostrarDatos() {
		
		if (password.equals("1234") && user.equals("Axel")) {
			try {
				this.redireccionar("nuevaPagina.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUser",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina solicitada no existe.", ""));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUser",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario / Contraseña incorrecto.", ""));
		}
	}

	public void redireccionar(String paginaARedirecionar) throws IOException {
		// Objeto que permite el redireccionamiento.
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();

		// Metodo del objeto ExternalContext que redirecciona a la pagina.
		ec.redirect(paginaARedirecionar);
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
