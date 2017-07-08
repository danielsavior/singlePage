package br.com.restaurante.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.ws.Endpoint;

import br.com.restaurante.models.Configuracao;
import br.com.restaurante.webservice.Servico;

/**
 *
 * @author daniel
 */
public final class Utilidades {
   //testando
   public static DecimalFormat formatadorDecimal=new DecimalFormat("##,##00.00");
   public static String criptografarSenha(String senhaPassada){
       try{
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = algorithm.digest(senhaPassada.getBytes("UTF-8"));

            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
              hexString.append(String.format("%02X", 0xFF & b));
            }
            return hexString.toString();   
        }catch(Throwable t){
            return null;
         }
   }
   
   
   
   public static List<Integer>nMesas(List<Integer> l,int status){
      /* Session session=null;
       Query query=null;
       try{
          session=HibernateUtil.getSessionFactory().openSession();
          query=session.createQuery("FROM Atendimento WHERE numeroDaMesa in(:l) and finalizado= 0");
          query.setParameterList("l", l);
          List<Atendimento>atendimentosAtivos=new ArrayList<>(query.list());
          if(status==0){
            for (Atendimento a : atendimentosAtivos) {
                l.remove(l.indexOf(a.getNumeroDaMesa()));
            }
            return l;
          }else{
             List<Integer>mesasComAtendimento =new ArrayList<>();
             for (Atendimento a : atendimentosAtivos) {
                mesasComAtendimento.add(a.getNumeroDaMesa());
             }
             return mesasComAtendimento;
         }
       }catch(Exception e){
           e.printStackTrace();
           return null;
       }finally{
           session.close();
       }*/
	   return null;
   
   }
   
   public static String retornarIP(){
       String n="127.0.0.1";
        try{                                                                              
            n=InetAddress.getByName(InetAddress.getLocalHost().getHostName()).toString();
            n=n.substring(0, n.indexOf("/"));            
            return InetAddress.getByName(InetAddress.getLocalHost().getHostName()+".local").getHostAddress();                                                              
        }catch(Exception e){            
            return n;             
        }
    }
   
   public static Configuracao lerConfiguracao(){
        FileInputStream fi;
       Configuracao c = new Configuracao();
       try {           
            fi = new FileInputStream(System.getProperty("user.dir")+File.separator+"confHB.cfg");
            ObjectInputStream oi= new ObjectInputStream(fi);
            c=(Configuracao)oi.readObject();
            oi.close();
            return c;
       } catch (FileNotFoundException ex) {
           Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
       }
       return c;
    }
   
   public static boolean conectarWebService(Configuracao c,Servico servico)throws FileNotFoundException{   
        try{                    
            FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+File.separator+"confHB.cfg");
            ObjectInputStream oi= new ObjectInputStream(fi);            
            c=(Configuracao)oi.readObject(); 
            oi.close();
            Endpoint.publish("http://"+c.getIpWebService()+":8787/restaurante", servico);                    
            return true;
        }catch(FileNotFoundException be){            
            throw  new FileNotFoundException("Não foi possível iniciar o serviço de rede\n Cheque suas configurações.");            
        }catch(Exception e){
            throw  new FileNotFoundException("Não é possível iniciar duas instâncias dessa aplicação");                        
        }
    }
   
}
