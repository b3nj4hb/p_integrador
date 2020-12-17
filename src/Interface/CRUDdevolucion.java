/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Devolucion;
import java.util.List;

/**
 *
 * @author Alvaro Alva Chipana
 */
public interface CRUDdevolucion {
    public List listardevolucion(); // Listar
     public List listarlibrosprestados(String dni); // Listar
      public Devolucion buscardevolucion(int idprestamo); // Buscar
      public boolean editardevolucion(Devolucion devolucion);
       public boolean lacosadelstock(int idlibro);
}
