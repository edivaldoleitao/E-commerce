
package projeto2va.negocio.beans;

import java.io.Serializable;



public abstract class ContaUsuario implements Serializable {

    private String Nome;
    private String senha; 
    

    public ContaUsuario(String Nome,  String senha) {
      
        this.Nome = Nome;
        this.senha = senha;
    }


    public String getNome() {
        return Nome;
    }

  
    public String getSenha() {
        return senha;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   
    
    
    
    
}
