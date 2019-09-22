/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2va.negocio;
import dados.*;
import projeto2va.exceptions.*;
import projeto2va.negocio.beans.*;

public class ControladorProdutos {
    private static ControladorProdutos instance;
    private IRepositorioGenerico<Produto> repositorioProdutos;
    
    
    public ControladorProdutos() {
        this.repositorioProdutos = new RepositorioGenerico<>("Produtos.dat");
    }
   
    public static ControladorProdutos getInstance() {
        if(instance == null) {
            instance = new ControladorProdutos();
        }
        return instance;
    }
    
    public 
    
    
    
}
