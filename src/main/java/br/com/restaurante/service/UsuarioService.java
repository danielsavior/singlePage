package br.com.restaurante.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.restaurante.daos.UsuarioRepository;
import br.com.restaurante.models.Usuario;

public class UsuarioService {
	@Autowired
	private UsuarioRepository repository;
	
	public Iterable<Usuario> obterTodos(){
        Iterable<Usuario> usuarios = repository.findAll();
        return usuarios;
    }
	
	public void salvar(Usuario usuario){
		repository.save(usuario);
	}
}
