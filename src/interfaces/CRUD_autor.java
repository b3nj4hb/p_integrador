package interfaces;

import modelos.Autor;
import java.util.List;

public interface CRUD_autor {

    public List listarautor(); // Listar

    public Autor buscarautor(int idautor); // Buscar

    public boolean agregarautor(Autor autor);

    public boolean editarautor(Autor autor);

    public boolean eliminarautor(int idautor);
}
