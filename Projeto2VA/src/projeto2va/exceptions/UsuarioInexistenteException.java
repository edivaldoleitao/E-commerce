
package projeto2va.exceptions;

import projeto2va.negocio.beans.ContaUsuario;


public class UsuarioInexistenteException extends Exception{

    private ContaUsuario conta;

    public UsuarioInexistenteException(ContaUsuario conta) {
        super("usuaario nao existe no repositorio");
        this.conta = conta;
    }

    public ContaUsuario getConta() {
        return conta;
    }

    public void setConta(ContaUsuario conta) {
        this.conta = conta;
    }
    
    
    
    
}
