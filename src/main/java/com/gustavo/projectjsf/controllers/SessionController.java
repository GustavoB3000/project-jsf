package com.gustavo.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.gustavo.projectjsf.dto.UsuarioDTO;

/**
 * Clase que se encarga de mantener la informacion del usuario que ingresa al aplicativo.
 * @author Calistos
 *
 */
@ManagedBean
@SessionScoped
public class SessionController {

	/**
	 * usuario que se mantendra en session.
	 */
	private UsuarioDTO usuarioDTO;
	
	/**
	 * Inicializa la session del usuario.
	 */
	@PostConstruct
	public void init() {
		System.out.println("Cargando info del usuario en la session.");
	}

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	
}
