
package dados;

import java.util.List;

import projeto2va.exceptions.ElementoJaExisteException;
import projeto2va.exceptions.ElementoNaoExisteException;

public interface IRepositorioGenerico<T> {
    
    void inserir(T obj) throws ElementoJaExisteException;
    
    List<T> listar();
    
    void remover(T obj) throws ElementoNaoExisteException;

    void atualizar(T newObj) throws ElementoNaoExisteException;

}
