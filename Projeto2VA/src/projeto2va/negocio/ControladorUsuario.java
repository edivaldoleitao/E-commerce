
package projeto2va.negocio;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import projeto2va.exceptions.ElementoJaExisteException;
import projeto2va.exceptions.ElementoNaoExisteException;
import projeto2va.negocio.beans.ContaCliente;
import projeto2va.negocio.beans.ContaUsuario;

public class ControladorUsuario {
    
    
    private static ControladorUsuario instance;
    private IRepositorioGenerico<ContaUsuario> repositorioUsuarios;  
    
    private ControladorUsuario() {
        this.repositorioUsuarios = new RepositorioGenerico<>("usuarios.dat");
    }
    
    public static ControladorUsuario getInstance() {
        if(instance == null) {
            instance = new ControladorUsuario();
        }
       return instance;
    }
    
    public void inserirUsuario(ContaUsuario usuario) throws ElementoJaExisteException {
        this.repositorioUsuarios.inserir(usuario);
    }
    //alkalkajlajlkjalalajalkjalaalkjalakjalkjalka
  
    public void removerUsuario(ContaUsuario usuario) throws ElementoNaoExisteException{
        if(usuario instanceof ContaCliente) {
            this.repositorioUsuarios.remover(usuario);
        }
    }
    
    //public buscar usuario e exibir a id e compras
    // public alterar senha 
    
    
    
}
