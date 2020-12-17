package Interface;

import Modelo.Libro;
import java.util.List;

public interface Crud1 {

    public List listarlibro(); // Listar

    public Libro buscarlibro(int idlibro); // Buscar

    public boolean agregarlibro(Libro libro);

    public boolean editarlibro(Libro libro);

    public boolean eliminarlibro(int idlibro);

    public List stock(int idlibro); // Listar
}
