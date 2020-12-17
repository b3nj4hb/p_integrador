package Interface;

import Modelo.Prestamo;
import java.util.List;

public interface CRUDreporte {

    public List listarusuarios(); // Listar

    public Prestamo buscarusuario(int idprestamo); // Buscar

    public boolean agregarusuario(Prestamo prestamo);

    public boolean editarusuario(Prestamo prestamo);

    public boolean eliminarusuario(int idprestamo);

    public boolean lacosadelstock(int idlibro);
}
