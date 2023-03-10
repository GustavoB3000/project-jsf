package com.gustavo.projectjsf.dto;

/**
 * Clase que permitira contener informacion del usuario en session.
 * @author Calistos
 *
 */
public class UsuarioDTO {

	/**
	 * Usuario.
	 */
	private String user;
	/**
	 * Contraseña.
	 */
	private String password;

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
