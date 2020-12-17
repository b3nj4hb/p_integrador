/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Prestamo;
import java.util.List;

/**
 *
 * @author Alvaro Alva Chipana
 */
public interface CRUDreporte {
    public List listarusuarios(); // Listar
    public Prestamo buscarusuario(int idprestamo); // Buscar
    public boolean agregarusuario(Prestamo prestamo);
    public boolean editarusuario(Prestamo prestamo);
    public boolean eliminarusuario(int idprestamo);
    public boolean lacosadelstock(int idlibro);
}
