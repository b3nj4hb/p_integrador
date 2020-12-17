package interfaces;

import modelos.Libro;
import java.util.List;

public interface CRUD_libro {

    public List listarlibro(); // Listar

    public Libro buscarlibro(int idlibro); // Buscar

    public boolean agregarlibro(Libro libro);

    public boolean editarlibro(Libro libro);

    public boolean eliminarlibro(int idlibro);

    public List stock(int idlibro); // Listar
}
