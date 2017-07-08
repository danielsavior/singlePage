/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.restaurante.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author daniel
 */
@Entity
public class Recebimento implements IHaveID{
    @Id
    @GeneratedValue
    private long id;
    private long idAtendimento;
    private double valorRecebido;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the idAtendimento
     */
    public long getIdAtendimento() {
        return idAtendimento;
    }

    /**
     * @param idAtendimento the idAtendimento to set
     */
    public void setIdAtendimento(long idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    /**
     * @return the valorRecebido
     */
    public double getValorRecebido() {
        return valorRecebido;
    }

    /**
     * @param valorRecebido the valorRecebido to set
     */
    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }
    
}
