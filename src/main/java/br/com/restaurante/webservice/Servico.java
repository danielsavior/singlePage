package br.com.restaurante.webservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import javax.jws.WebService;
import org.json.JSONArray;
import org.json.JSONObject;
import br.com.restaurante.models.Atendimento;
import br.com.restaurante.models.Configuracao;
import br.com.restaurante.models.Produto;
import br.com.restaurante.models.Usuario;
import br.com.restaurante.controllers.AtendimentoController;
import br.com.restaurante.controllers.ItemDoAtendimentoController;
import br.com.restaurante.controllers.ProdutoController;
import br.com.restaurante.controllers.UsuarioController;
import br.com.restaurante.utils.Utilidades;

/**
 *
 * @author daniel
 */
@WebService
public class Servico extends Observable{
    
    public List<String>listarNomeUsuarios(){
        List<String>nomes=new ArrayList<String>();
        try{
            for(Usuario u: new UsuarioController().listar()){
                nomes.add(u.getNomeDoUsuario());
            }
            return nomes;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    
    }
    
    public Usuario login(String usuario, String senha){
        try{
            return  new UsuarioController().efetuarLogin(usuario, Utilidades.criptografarSenha(senha));
        }catch(ExceptionInInitializerError e){
            throw new ExceptionInInitializerError();
        }
    }
    
    public List<Produto>carregarAtendimento(int mesa, int usuario){
        setChanged();
        notifyObservers(mesa);         
        Atendimento atendimento=new Atendimento();
        atendimento.setIdUsuario(Long.valueOf(((Integer)usuario).toString()));
        atendimento.setNumeroDaMesa(mesa);
        new AtendimentoController().insert(atendimento);
        return new ItemDoAtendimentoController().listar(mesa);
        
    }
    
    public void gravarAtendimento(String lista,int mesa, long idUser){
        List<Produto>listaDeProdutos=new ArrayList<Produto> ();
        JSONObject jo= new JSONObject(lista);
        JSONArray ja=jo.getJSONArray("lista");
        for(int i=0;i<ja.length();i++){
            Produto p=new Produto();
            p.setId(ja.getJSONObject(i).getLong("id"));
            p.setDescricao(ja.getJSONObject(i).getString("descricao"));
            p.setPreco(ja.getJSONObject(i).getDouble("preco"));
            p.setQuantidade(ja.getJSONObject(i).getInt("quantidade"));
            p.setTotal(ja.getJSONObject(i).getDouble("total"));
            listaDeProdutos.add(p);
        }
        new ItemDoAtendimentoController().insertWebService(listaDeProdutos, mesa,idUser);        
    }
    
    public Produto buscarProduto(int id){
        return new ProdutoController().buscarPorID((long)Integer.valueOf(id));
    }
    public List<String>listarNomeProdutos(){
        List<String>produtos=new ArrayList<String>();
        try{
            for(Produto p: new ProdutoController().listar()){
                produtos.add(p.getDescricao()+" codigo"+p.getId()+"-preco"+p.getPreco());
            }
            return produtos;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }    
    }
    public int qtdMesas(){
        Configuracao c=Utilidades.lerConfiguracao();
        return c.getnMesas();
    }
}
