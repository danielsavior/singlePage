package br.com.restaurante.models;

import java.io.Serializable;

public class Configuracao implements Serializable{
    
	private static final long serialVersionUID = 1L;
	
	private String ipBanco;
    private String usuario;
    private String senha;
    private String ipWebService;
    private int nMesas;
    
    public String getIp() {
        return ipBanco;
    }

    public void setIp(String ip) {
        this.ipBanco = ip;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getIpWebService() {
        return ipWebService;
    }

    public void setIpWebService(String ipWebService) {
        this.ipWebService = ipWebService;
    }
    
    public int getnMesas() {
        return nMesas;
    }

    public void setnMesas(int nMesas) {
        this.nMesas = nMesas;
    }   
    
}
