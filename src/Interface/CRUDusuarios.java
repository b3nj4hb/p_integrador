/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Usuario;
import java.util.List;

/**
 *
 * @author Alvaro Alva Chipana
 */
public interface CRUDusuarios {
       public List listarusuarios(); // Listar
    public Usuario buscarusuario(int idusuario); // Buscar
    public boolean agregarusuario(Usuario usuario);
    public boolean editarusuario(Usuario usuario);
    public boolean eliminarusuario(int idusuario);
}
