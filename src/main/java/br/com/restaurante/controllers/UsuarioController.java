package br.com.restaurante.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.restaurante.models.Usuario;
import br.com.restaurante.service.UsuarioService;

/**
 *
 * @author daniel
 */
public class UsuarioController implements IUsuarioController, ITodosController<Usuario> {
	
	@Autowired
	private UsuarioService service;
	
	@RequestMapping("/")
	public String inicio(){
		return "index";
	}
	
	public void insert(Usuario objeto) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Usuario objeto) {
		// TODO Auto-generated method stub
		
	}

	public void update(Usuario objeto) {
		// TODO Auto-generated method stub
		
	}

	public Usuario buscarPorID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Usuario> buscarPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping("listausuarios")
	public String listausuarios(Model model) {		
	 Iterable<Usuario> usuarios = service.obterTodos();
	 model.addAttribute("usuarios", usuarios);
	 return "listaconvidados";
	}


	public Usuario efetuarLogin(String usuario, String senha) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
