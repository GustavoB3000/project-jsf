package com.gustavo.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.gustavo.projectjsf.dto.UsuarioDTO;


/**
 * 
 * @author Calistos
 */
@ManagedBean
public class LoginController {
	/**
	 * Usuario.
	 */
	private String user;
	/**
	 * Contraseña.
	 */
	private String password;
	
	/**
	 * Bean que mantiene la info en session.
	 */
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;

	public void mostrarDatos() {
		
		if (password.equals("1234") && user.equals("Axel")) {
			try {
				//Se crea un usuario para la session.
				UsuarioDTO U1 = new UsuarioDTO();
				
				//Se vinculan los datos correctos a los atributos correspondientes del usuario.
				U1.setUser(this.user);
				U1.setPassword(this.password);
				
				//Finalmente se le da la session al usuario.
				this.sessionController.setUsuarioDTO(null);
				
				//Redireccionamiento a otra pagina.
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
