package interfaces;

import modelos.Usuario;
import java.util.List;

public interface CRUDusuarios {

    public List listarusuarios(); // Listar

    public Usuario buscarusuario(int idusuario); // Buscar

    public boolean agregarusuario(Usuario usuario);

    public boolean editarusuario(Usuario usuario);

    public boolean eliminarusuario(int idusuario);
}
