package interfaces;

import modelos.Prestamo;
import java.util.List;

public interface CRUD_reporte {

    public List listarusuarios(); // Listar

    public Prestamo buscarusuario(int idprestamo); // Buscar

    public boolean agregarusuario(Prestamo prestamo);

    public boolean editarusuario(Prestamo prestamo);

    public boolean eliminarusuario(int idprestamo);

    public boolean stock(int idlibro);
}
