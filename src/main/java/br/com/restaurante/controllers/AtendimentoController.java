package br.com.restaurante.controllers;

import java.util.List;

import br.com.restaurante.models.Atendimento;

public class AtendimentoController implements ITodosController<Atendimento> {
	
	public void insert(Atendimento objeto) {
		System.out.println("inserindo");		
	}
	
	public void delete(Atendimento objeto) {
		System.out.println("removendo");
	}
	
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
	
}
