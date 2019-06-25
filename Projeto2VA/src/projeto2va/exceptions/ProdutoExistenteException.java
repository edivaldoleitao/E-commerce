
package projeto2va.exceptions;

import projeto2va.negocio.beans.Produto;


public class ProdutoExistenteException extends Exception{

    private Produto produto;
    
    public ProdutoExistenteException(Produto produto) {
        super("produto ja existe no repositorio");
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
}
