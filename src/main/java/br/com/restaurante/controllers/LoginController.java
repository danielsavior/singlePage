package br.com.restaurante.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String index(){	
		System.out.println("estou chamando o index");
		return "index";
	}
	
	/*@RequestMapping("/")
	  public Map<String,Object> home() {
	    Map<String,Object> model = new HashMap<String,Object>();
	    model.put("id", UUID.randomUUID().toString());
	    model.put("content", "Hello World");
	    return model;
	  }*/
	
	@RequestMapping("/teste")
	public String teste(){	
		System.out.println("estou chamando o teste");
		return "index2";
	}
}
