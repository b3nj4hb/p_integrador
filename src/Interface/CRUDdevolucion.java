package Interface;

import Modelo.Devolucion;
import java.util.List;

public interface CRUDdevolucion {

    public List listardevolucion(); // Listar

    public List listarlibrosprestados(String dni); // Listar

    public Devolucion buscardevolucion(int idprestamo); // Buscar

    public boolean editardevolucion(Devolucion devolucion);

    public boolean lacosadelstock(int idlibro);
}
