package br.com.restaurante.controllers;

import br.com.restaurante.models.Usuario;



public interface IUsuarioController {        
    Usuario efetuarLogin(String usuario,String senha);
}

