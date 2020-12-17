/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Modelo.Libro;
import java.util.List;

/**
 *
 * @author Alvaro Alva Chipana
 */
public interface Crud1 {
      public List listarlibro(); // Listar
    public Libro buscarlibro(int idlibro); // Buscar
    public boolean agregarlibro(Libro libro);
    public boolean editarlibro(Libro libro);
    public boolean eliminarlibro(int idlibro);
    public List stock(int idlibro); // Listar
}
