
package dados;
import projeto2va.negocio.beans.Produto;
import java.util.ArrayList;

public class ProdutosRepositorioArray {
    private ArrayList<Produto> repositorio = new ArrayList<>();
    
    public void adicionaProduto(Produto produto) {
         repositorio.add(produto);
    }
    
    public void removeProduto(Produto produto) {
        if(repositorio.contains(produto)) {
            repositorio.remove(produto);
        }
    }
    
    public Produto buscarProduto(String nome) {
        Produto produto = null;
        for(Produto produto1 : repositorio) {
            if(produto1.getNome().equals(nome)) {
                produto = produto1;
            }
        }
        return produto;
    }
    
}
