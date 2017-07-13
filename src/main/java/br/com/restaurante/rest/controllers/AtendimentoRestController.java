package br.com.restaurante.rest.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.restaurante.models.Atendimento;
@RestController
@RequestMapping("/atendimento")
public class AtendimentoRestController {
	
	@RequestMapping(method = RequestMethod.POST, value = "/adicionar", 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Atendimento> insert(Atendimento objeto) {
		System.out.println("inserindo");
		return null;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/remover",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> delete(Atendimento objeto) {
		System.out.println("removendo");
		return null;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/alterar", 
	consumes = MediaType.APPLICATION_JSON_VALUE,
	produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Atendimento> update(Atendimento objeto) {
		System.out.println("alterando");
		return null;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/busca-por-id", 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Atendimento>  getByID(long id) {
		return null;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/busca-por-nome", 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Atendimento>> getByName(String nome) {
		return null;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/todos", 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Atendimento>> getAll() {
		return null;
	}
	
	
	@RequestMapping("/pega")
	public ResponseEntity<Atendimento> pega() {
		Atendimento a = new Atendimento();
		a.setId(1);
		a.setIdUsuario(1);
		a.setNumeroDaMesa(2);
		return new ResponseEntity<Atendimento>(a, HttpStatus.OK);		
	}
    
    
}
