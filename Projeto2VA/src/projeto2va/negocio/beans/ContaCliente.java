
package projeto2va.negocio.beans;

import java.util.ArrayList;
import java.util.Random;

public class ContaCliente extends ContaUsuario{
    
    private ArrayList<Produto> compras;
    private double id;
    private boolean bloqueio;
    
    public ContaCliente(String Nome, String senha) {
        super(Nome, senha);
        Random r = new Random();
        this.id = r.nextDouble();
        this.bloqueio = false;
    }

    public ArrayList<Produto> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Produto> compras) {
        this.compras = compras;
    }

    public double getId() {
        return this.id;
    }
    
    public double getTotalCompras() {
        double total = 0;
        for(Produto p : this.compras) {
            total += p.getPreco();
        }
        return total;
    }
    
    public boolean equals(ContaCliente c) {
        boolean b = false;
        if(c.getNome().equals(this.getNome()) && c.getId() == this.getId())
            b =true;
        return b;
    }

    public boolean getStatusBloqueio() {
        return this.bloqueio;
    }
    
    public void setBloqueio(boolean bloqueio) {
        this.bloqueio = bloqueio;
    }
}
