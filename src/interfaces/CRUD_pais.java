package interfaces;

import java.util.List;
import modelos.Pais;

public interface CRUD_pais {

    public List listarpaises(); // Listar

    public Pais buscarpais(int idpais); // Buscar

    public boolean agregarpais(Pais pais);

    public boolean editarpais(Pais pais);

    public boolean eliminarpais(int idpais);
}
