
package projeto2va.negocio.beans;

import java.io.Serializable;
import java.util.Random;


public class Produto implements Serializable {

    private String nome;
    private float preco;
    String descricao;
    long id;
    
    public Produto(String nome, float preco,String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        Random rand = new Random();
        this.id = rand.nextLong();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public long getId() {
        return id;
    }

    public boolean equals(Produto p){
        boolean b = false;
        if(p.getNome().equals(this.nome) || p.getId() == this.id)
            b = true;
        return b;
    }
    
    
    
}
