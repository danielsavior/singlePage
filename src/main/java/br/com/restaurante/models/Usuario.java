package br.com.restaurante.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Usuarios")
public class Usuario implements IHaveID{
    @Id
    @GeneratedValue
    
    private long id;
    private String nomeDoUsuario;
    private String senhaDoUsuario;
    private boolean ativo;
    private char tipo;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public void setNomeDoUsuario(String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
    }

    public String getSenhaDoUsuario() {
        return senhaDoUsuario;
    }

    public void setSenhaDoUsuario(String senhaDoUsuario) {
        this.senhaDoUsuario = senhaDoUsuario;
    }

    /**
     * @return the ativo
     */
    public boolean getAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the tipo
     */
    public char getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    
}
