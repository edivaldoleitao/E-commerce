
package projeto2va.negocio.beans;

import java.util.Random;

public class ContaCliente extends ContaUsuario{
    
    private String [] compras;
    private double id;
    
    public ContaCliente(String Nome, String senha) {
        super(Nome, senha);
        Random r = new Random();
        this.id = r.nextDouble();
    }

    public String[] getCompras() {
        return compras;
    }

    public void setCompras(String[] compras) {
        this.compras = compras;
    }

    public double getId() {
        return id;
    }
    
    
    

}
