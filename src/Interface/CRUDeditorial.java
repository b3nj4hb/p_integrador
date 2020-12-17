package Interface;

import java.util.List;
import Modelo.Editorial;

public interface CRUDeditorial {
    public List listareditoriales(); // Listar
    public Editorial buscareditorial(int ideditorial); // Buscar
    public boolean agregareditorial(Editorial editorial);
    public boolean editareditorial(Editorial editorial);
    public boolean eliminareditorial(int ideditorial);
}
