package interfaces;

import modelos.Devolucion;
import java.util.List;

public interface CRUD_devolucion {

    public List listardevolucion(); // Listar

    public List listarlibrosprestados(String dni); // Listar

    public Devolucion buscardevolucion(int idprestamo); // Buscar

    public boolean editardevolucion(Devolucion devolucion);

    public boolean stock(int idlibro);
}
