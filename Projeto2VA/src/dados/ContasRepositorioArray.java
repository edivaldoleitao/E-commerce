
package dados;

import projeto2va.negocio.beans.*;
import java.util.ArrayList;
import projeto2va.exceptions.UsuarioExistenteException;
import projeto2va.exceptions.UsuarioInexistenteException;

public class ContasRepositorioArray {
    private ArrayList<ContaUsuario> repositorio;

    public ContasRepositorioArray() {
        this.repositorio = new ArrayList<>();
    }
    
    public void adicionaConta(ContaUsuario conta) throws UsuarioExistenteException {
        if(repositorio.contains(conta)) {
            throw new UsuarioExistenteException(conta);
        }
        else {
            repositorio.add(conta);
        }
    }
    
    public void removeConta(ContaUsuario conta) throws UsuarioInexistenteException{
        if(repositorio.contains(conta)) {
            repositorio.remove(conta);
        }
        else {
            throw new UsuarioInexistenteException(conta);
        }
    }
    
    public ContaUsuario buscarUsuario(String nome) throws UsuarioInexistenteException{
        ContaUsuario conta = null;
    
        
        for(ContaUsuario contas1 : repositorio) {
            if(contas1.getNome().equals(nome)) {
                conta = contas1;
                
            }
        }
        if(conta == null){
            throw new  UsuarioInexistenteException(conta);
        }
        return conta;
    }
    
    
    
    
    
    
}
