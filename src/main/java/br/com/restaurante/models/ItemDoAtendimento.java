package br.com.restaurante.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author daniel
 */


@Entity
@Table (name="ItensDoAtendimento")
public class ItemDoAtendimento {
    @Id
    @GeneratedValue
    private long id; 
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    private long idAtendimento;
    private long idProduto;
    private int qtd;

    public long getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(long idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    
}
