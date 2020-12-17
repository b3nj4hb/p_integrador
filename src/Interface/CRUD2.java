/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Modelo.Autor;
import java.util.List;

/**
 *
 * @author Alvaro Alva Chipana
 */
public interface CRUD2 {
     public List listarautor(); // Listar
    public Autor buscarautor(int idautor); // Buscar
    public boolean agregarautor(Autor autor);
    public boolean editarautor(Autor autor);
    public boolean eliminarautor(int idautor);
}
