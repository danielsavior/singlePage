package br.com.restaurante.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.restaurante.models.Usuario;
import br.com.restaurante.service.UsuarioService;
import br.com.restaurante.utils.Utilidades;

@Controller
public class LoginController {
	
	@Autowired
	private UsuarioService service;
	
	@RequestMapping("/")
	public String index(){	
		System.out.println("estou chamando o index");
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/efetuar-login",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> efetuarLogin(@RequestBody Usuario usuario){	
		System.out.println("estou chamando o teste");
		String password = Utilidades.criptografarSenha(usuario.getSenhaDoUsuario());
		return new ResponseEntity<Usuario>(service.efetuarLogin(usuario.getNomeDoUsuario(), password),HttpStatus.OK);
	}
}
