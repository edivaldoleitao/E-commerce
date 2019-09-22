
package projeto2va.negocio;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import java.util.List;
import projeto2va.exceptions.ElementoJaExisteException;
import projeto2va.exceptions.ElementoNaoExisteException;
import projeto2va.exceptions.SenhaIncorretaException;
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
        if(usuario != null)
            this.repositorioUsuarios.inserir(usuario);
    }
  
    public void removerUsuario(ContaUsuario usuario) throws ElementoNaoExisteException{
        if(usuario != null){
            if(usuario instanceof ContaCliente ) {
                this.repositorioUsuarios.remover(usuario);
            }
        }
    }
    //metodo  login
    public ContaCliente LoginCliente(String nome,String senha) throws ElementoNaoExisteException, SenhaIncorretaException{
        
        List<ContaUsuario> lista = this.repositorioUsuarios.listar();
        if(nome!= null && senha!= null) {
            for(ContaUsuario conta : lista) {
                if(conta instanceof ContaCliente) {
                    if(conta.getNome().equals(nome) ) {
                        if( conta.getSenha().equals(senha)) {
                            return (ContaCliente) conta;
                        }
                        else {
                            throw new SenhaIncorretaException(conta);
                        }
                    }
                }
            }
        }
        throw new ElementoNaoExisteException(nome);
    }
    
    //metodo client
    public void alterarSenha(ContaUsuario conta ,String senha) {
        if(conta!= null && senha!= null) {
            conta.setSenha(senha);
        }
    } 
    // metodo do admin
    public void bloquearUsuario(ContaCliente conta) {
        List<ContaUsuario> lista = this.repositorioUsuarios.listar();
        if(conta!= null) {
            if(lista.contains(conta))
              conta.setBloqueio(true);
        }
    }
    // metodo do admin
    public void desbloquearUsuario(ContaCliente conta) {
        List<ContaUsuario> lista = this.repositorioUsuarios.listar();
        if(conta!= null) {
            if(lista.contains(conta))
              conta.setBloqueio(false);
        }
    }
    
}
