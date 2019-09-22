
package projeto2va;
import projeto2va.exceptions.*;
import projeto2va.negocio.*;
import projeto2va.negocio.beans.ContaCliente;

public class Projeto2VA {
    
    
    public static void main(String[] args) {
       ControladorUsuario controlador = ControladorUsuario.getInstance();
       ContaCliente conta = null;
       try {
        controlador.inserirUsuario(new ContaCliente("asas", "xx"));
        conta = controlador.LoginCliente("asas", "a");
       }
       catch(ElementoJaExisteException | ElementoNaoExisteException  | SenhaIncorretaException ex){
           System.out.println(ex.getLocalizedMessage());
       }
        System.out.println(conta.getId());
                
    }  
    
}
