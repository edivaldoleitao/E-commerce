
package projeto2va.exceptions;

import projeto2va.negocio.beans.ContaUsuario;


public class UsuarioExistenteException extends Exception{
    
    private ContaUsuario conta;

    public UsuarioExistenteException(ContaUsuario conta) {
        super("conta ja existe no repositorio!!!!!!!!");
        this.conta = conta;
    }

    public ContaUsuario getConta() {
        return conta;
    }

    public void setConta(ContaUsuario conta) {
        this.conta = conta;
    }
    
    
    
    
    
    
}
