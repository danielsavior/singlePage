package br.com.restaurante.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.restaurante.daos.UsuarioRepository;
import br.com.restaurante.models.Usuario;

@Component
public class UsuarioService {
	@Autowired
	private UsuarioRepository repository;
	
	@PersistenceContext
	private EntityManager manager;
	
	public Iterable<Usuario> obterTodos(){
        Iterable<Usuario> usuarios = repository.findAll();
        return usuarios;
    }
	
	public void salvar(Usuario usuario){
		repository.save(usuario);
	}
	
	public Usuario efetuarLogin(String userName, String password){
		return manager.createQuery("select u from Usuario u where u.nomeDoUsuario = :nomeDoUsuario and u.senhaDoUsuario = :senhaDoUsuario", Usuario.class).setParameter("nomeDoUsuario", userName).setParameter("senhaDoUsuario", password).getSingleResult();
	}
	
}
