package br.com.restaurante.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.restaurante.models.Usuario;
import br.com.restaurante.service.UsuarioService;

/**
 *
 * @author daniel
 */
@Controller
@RequestMapping("/usuarios")
public class UsuarioRestController{
	
	@Autowired
	private UsuarioService service;
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/todos", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Usuario>> listausuarios() {		
	 Iterable<Usuario> iteratorusuarios = service.obterTodos();	 
	 List<Usuario> usuarios = new ArrayList<Usuario>();
	 iteratorusuarios.forEach(x-> usuarios.add(x));
	 return new ResponseEntity<List<Usuario>>(usuarios,HttpStatus.OK);
	}

}
