
package projeto2va.exceptions;

import projeto2va.negocio.beans.Produto;

public class ProdutoInexistenteException extends Exception {

    private Produto produto;

    public ProdutoInexistenteException(Produto produto) {
        super("Produto nao existe no repositorio !!!");
        this.produto = produto;
    }

    public Produto getConta() {
        return produto;
    }

    public void setConta(Produto produto) {
        this.produto = produto;
    }

    

    
}
