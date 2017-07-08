package br.com.restaurante.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.restaurante.models.Atendimento;
@RestController
@RequestMapping("/atendimento")
public class AtendimentoController implements ITodosController<Atendimento> {
	
	@RequestMapping("/add")
	public void insert(Atendimento objeto) {
		System.out.println("inserindo");		
	}
	
	@RequestMapping("/remove")
	public void delete(Atendimento objeto) {
		System.out.println("removendo");
	}
	
	@RequestMapping("/change")
	public void update(Atendimento objeto) {
		System.out.println("alterando");
	}

	public Atendimento buscarPorID(long id) {
		return null;
	}

	public List<Atendimento> buscarPorNome(String nome) {
		return null;
	}

	public List<Atendimento> listar() {
		return null;
	}
	
	
	@RequestMapping("/pega")
	public ResponseEntity<Atendimento> pega() {
		Atendimento a = new Atendimento();
		a.setId(1);
		a.setIdUsuario(1);
		a.setNumeroDaMesa(2);
		return new ResponseEntity(a, HttpStatus.OK);		
	}
    
    
}
