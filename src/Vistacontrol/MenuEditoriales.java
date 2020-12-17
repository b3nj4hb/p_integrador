package Vistacontrol;

import Modelo.Autor;
import java.util.List;
import Modelo.Editorial;
import ModeloDao.AutorDao;
import ModeloDao.EditorialDAO;
import static Vistacontrol.Index.Error;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import utils.Leer;

public class MenuEditoriales {

    public static String darformato(String cadena) {
        if (cadena.length() == 1) {
            return cadena + "                      ";
        } else if (cadena.length() == 2) {
            return cadena + "                     ";
        } else if (cadena.length() == 3) {
            return cadena + "                    ";
        } else if (cadena.length() == 4) {
            return cadena + "                   ";
        } else if (cadena.length() == 5) {
            return cadena + "                  ";
        } else if (cadena.length() == 6) {
            return cadena + "                 ";
        } else if (cadena.length() == 7) {
            return cadena + "                ";
        } else if (cadena.length() == 8) {
            return cadena + "               ";
        } else if (cadena.length() == 9) {
            return cadena + "              ";
        } else if (cadena.length() == 10) {
            return cadena + "             ";
        } else if (cadena.length() == 11) {
            return cadena + "            ";
        } else if (cadena.length() == 12) {
            return cadena + "           ";
        } else if (cadena.length() == 13) {
            return cadena + "          ";
        } else if (cadena.length() == 14) {
            return cadena + "         ";
        } else if (cadena.length() == 15) {
            return cadena + "        ";
        } else if (cadena.length() == 16) {
            return cadena + "       ";
        } else if (cadena.length() == 17) {
            return cadena + "      ";
        } else if (cadena.length() == 18) {
            return cadena + "     ";
        } else if (cadena.length() == 19) {
            return cadena + "    ";
        } else if (cadena.length() == 20) {
            return cadena + "   ";
        } else if (cadena.length() == 21) {
            return cadena + "  ";
        } else if (cadena.length() == 22) {
            return cadena + " ";
        } else if (cadena.length() == 23) {
            return cadena + "";
        } else if (cadena.length() > 23) {
            return cadena.substring(0, 21) + "..";
        } else {
            return cadena;
        }

    }

    public static String darformatog(String cadena) {
        if (cadena.length() == 1) {
            return cadena + "                                                       ";
        } else if (cadena.length() == 2) {
            return cadena + "                                                      ";
        } else if (cadena.length() == 3) {
            return cadena + "                                                     ";
        } else if (cadena.length() == 4) {
            return cadena + "                                                    ";
        } else if (cadena.length() == 5) {
            return cadena + "                                                   ";
        } else if (cadena.length() == 6) {
            return cadena + "                                                  ";
        } else if (cadena.length() == 7) {
            return cadena + "                                                 ";
        } else if (cadena.length() == 8) {
            return cadena + "                                                ";
        } else if (cadena.length() == 9) {
            return cadena + "                                               ";
        } else if (cadena.length() == 10) {
            return cadena + "                                              ";
        } else if (cadena.length() == 11) {
            return cadena + "                                             ";
        } else if (cadena.length() == 12) {
            return cadena + "                                            ";
        } else if (cadena.length() == 13) {
            return cadena + "                                           ";
        } else if (cadena.length() == 14) {
            return cadena + "                                          ";
        } else if (cadena.length() == 15) {
            return cadena + "                                         ";
        } else if (cadena.length() == 16) {
            return cadena + "                                        ";
        } else if (cadena.length() == 17) {
            return cadena + "                                       ";
        } else if (cadena.length() == 18) {
            return cadena + "                                      ";
        } else if (cadena.length() == 19) {
            return cadena + "                                     ";
        } else if (cadena.length() == 20) {
            return cadena + "                                    ";
        } else if (cadena.length() == 21) {
            return cadena + "                                   ";
        } else if (cadena.length() == 22) {
            return cadena + "                                  ";
        } else if (cadena.length() == 23) {
            return cadena + "                                 ";
        } else if (cadena.length() == 24) {
            return cadena + "                                ";
        } else if (cadena.length() == 25) {
            return cadena + "                               ";
        } else if (cadena.length() == 26) {
            return cadena + "                              ";
        } else if (cadena.length() == 27) {
            return cadena + "                             ";
        } else if (cadena.length() == 28) {
            return cadena + "                            ";
        } else if (cadena.length() == 29) {
            return cadena + "                           ";
        } else if (cadena.length() == 30) {
            return cadena + "                          ";
        } else if (cadena.length() == 31) {
            return cadena + "                         ";
        } else if (cadena.length() == 32) {
            return cadena + "                        ";
        } else if (cadena.length() == 33) {
            return cadena + "                       ";
        } else if (cadena.length() == 34) {
            return cadena + "                      ";
        } else if (cadena.length() == 35) {
            return cadena + "                     ";
        } else if (cadena.length() == 36) {
            return cadena + "                    ";
        } else if (cadena.length() == 37) {
            return cadena + "                   ";
        } else if (cadena.length() == 38) {
            return cadena + "                  ";
        } else if (cadena.length() == 39) {
            return cadena + "                 ";
        } else if (cadena.length() == 40) {
            return cadena + "                ";
        } else if (cadena.length() == 41) {
            return cadena + "               ";
        } else if (cadena.length() == 42) {
            return cadena + "              ";
        } else if (cadena.length() == 43) {
            return cadena + "             ";
        } else if (cadena.length() == 44) {
            return cadena + "            ";
        } else if (cadena.length() == 45) {
            return cadena + "           ";
        } else if (cadena.length() == 46) {
            return cadena + "          ";
        } else if (cadena.length() == 47) {
            return cadena + "         ";
        } else if (cadena.length() == 48) {
            return cadena + "        ";
        } else if (cadena.length() == 49) {
            return cadena + "       ";
        } else if (cadena.length() == 50) {
            return cadena + "      ";
        } else if (cadena.length() == 51) {
            return cadena + "     ";
        } else if (cadena.length() == 52) {
            return cadena + "    ";
        } else if (cadena.length() == 53) {
            return cadena + "   ";
        } else if (cadena.length() == 54) {
            return cadena + "  ";
        } else if (cadena.length() == 55) {
            return cadena + " ";
        } else if (cadena.length() == 56) {
            return cadena + "";

        } else if (cadena.length() > 56) {
            return cadena.substring(0, 54) + "..";
        } else {
            return cadena;
        }

    }

    public static void exportareditoriales() {
        System.out.println("\n--------Archivo creado con éxito, volviendo al menú secundario.--------");
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("C:/Users/Alvaro Alva Chipana/Documents/F/ListaEditoriales.txt");
            EditorialDAO editorialDAO = new EditorialDAO();
            List<Editorial> editoriales = editorialDAO.listareditoriales();
            salida.println("---------------------------------------------------------------------Listado de Editoriales------------------------------------------------------------------------------------------------------");
            salida.println("ID\tNombre\t\t\tCodigo\t\t\tDireccion\t\t\t\t\t\t\tURL\t\t\t\t\t\t\t\tEstado");
            for (Editorial editorial : editoriales) {
                salida.println(
                        editorial.getIdeditorial() + "\t"
                        + darformato(editorial.getNombre()).toUpperCase() + "\t"
                        + darformato(editorial.getCodigo()) + "\t"
                        + darformatog(editorial.getDireccion()) + "\t"
                        + darformatog(editorial.getURL()) + "\t"
                        + editorial.getEstado().toUpperCase());
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            salida.close();
        }
    }

    public static void ListarEditoriales() {
        EditorialDAO editorialDAO = new EditorialDAO();
        List<Editorial> editoriales = editorialDAO.listareditoriales();
        System.out.println("---------------------------------------------------------------------Listado de Editoriales------------------------------------------------------------------------------------------------------");
        System.out.println("ID\tNombre\t\t\tCodigo\t\t\tDireccion\t\t\t\t\t\t\tURL\t\t\t\t\t\t\t\tEstado");
        for (Editorial editorial : editoriales) {
            System.out.println(
                    editorial.getIdeditorial() + "\t"
                    + darformato(editorial.getNombre()).toUpperCase() + "\t"
                    + darformato(editorial.getCodigo()) + "\t"
                    + darformatog(editorial.getDireccion()) + "\t"
                    + darformatog(editorial.getURL()) + "\t"
                    + editorial.getEstado().toUpperCase());
        }
    }

    public static void AgregarEditorial() {
        String nombre;
        String codigo;
        String direccion;
        String URL;
        String estado;

        System.out.println("----Agregar Editorial----");
        System.out.println("Nombre: ");
        nombre = Leer.cadena();
        while (nombre.length() > 50) {
            System.out.println("Limite de digitos superado(Limite=50), intente de nuevo.");
            System.out.println("Nombre: ");
            nombre = Leer.cadena();
        }
        System.out.println("\nCódigo: ");
        codigo = Leer.cadena();
        while (codigo.length() > 10) {
            System.out.println("Limite de digitos superado(Limite=10), intente de nuevo.");
            System.out.println("\nCódigo: ");
            codigo = Leer.cadena();
        }
        System.out.println("\nDirección: ");
        direccion = Leer.cadena();
        while (direccion.length() > 80) {
            System.out.println("Limite de digitos superado(Limite=80), intente de nuevo.");
            System.out.println("\nDirección: ");
            direccion = Leer.cadena();
        }
        System.out.println("\nURL: ");
        URL = Leer.cadena();
        while (URL.length() > 100) {
            System.out.println("Limite de digitos superado(Limite=100), intente de nuevo.");
            System.out.println("\nURL: ");
            URL = Leer.cadena();
        }
        System.out.println("\nEstado: ");
        estado = Leer.cadena();
        while (estado.length() != 1) {
            System.out.println("Limite de digitos superado(Limite=1), intente de nuevo.");
            System.out.println("\nEstado: ");
            estado = Leer.cadena();
        }
        Editorial editorial = new Editorial(nombre, codigo, direccion, URL, estado);
        EditorialDAO editorialDAO = new EditorialDAO();
        editorialDAO.agregareditorial(editorial);
    }

    public static void EditarEditorial() {
        ListarEditoriales();
        System.out.println("Ingresar ID de Editorial a Editar");
        int id = Leer.entero();
        String nombre;
        String codigo;
        String direccion;
        String URL;
        String estado;

        System.out.println("----Editar Editorial----");
        System.out.println("Nombre: ");
        nombre = Leer.cadena();
        while (nombre.length() > 50) {
            System.out.println("Limite de digitos superado(Limite=50), intente de nuevo.");
            System.out.println("Nombre: ");
            nombre = Leer.cadena();
        }
        System.out.println("\nCódigo: ");
        codigo = Leer.cadena();
        while (codigo.length() > 10) {
            System.out.println("Limite de digitos superado(Limite=10), intente de nuevo.");
            System.out.println("\nCódigo: ");
            codigo = Leer.cadena();
        }
        System.out.println("\nDirección: ");
        direccion = Leer.cadena();
        while (direccion.length() > 80) {
            System.out.println("Limite de digitos superado(Limite=80), intente de nuevo.");
            System.out.println("\nDirección: ");
            direccion = Leer.cadena();
        }
        System.out.println("\nURL: ");
        URL = Leer.cadena();
        while (URL.length() > 100) {
            System.out.println("Limite de digitos superado(Limite=100), intente de nuevo.");
            System.out.println("\nURL: ");
            URL = Leer.cadena();
        }
        System.out.println("\nEstado: ");
        estado = Leer.cadena();
        while (estado.length() != 1) {
            System.out.println("Limite de digitos superado(Limite=1), intente de nuevo.");
            System.out.println("\nEstado: ");
            estado = Leer.cadena();
        }
        Editorial editorial = new Editorial(id, nombre, codigo, direccion, URL, estado);
        EditorialDAO editorialDAO = new EditorialDAO();
        editorialDAO.editareditorial(editorial);
    }

    public static void EliminarEditorial() {
        ListarEditoriales();
        System.out.println("Ingrese el ID de la Editorial a Eliminar");
        int id = Leer.entero();
        EditorialDAO epDAO = new EditorialDAO();
        epDAO.eliminareditorial(id);
    }

    public static void SalirMenu() {
        System.out.println("\n--------------Dirigiendo a Menu Principal--------------");

    }

    public static void Menu() {
        System.out.println("\n--------------MENU EDITORIALES--------------");
        System.out.println("1. Agregar");
        System.out.println("2. Eliminar");
        System.out.println("3. Editar");
        System.out.println("4. Listar");
        System.out.println("5. Exportar");
        System.out.println("6. Salir a Menu Principal");
        System.out.print("Escoja opción [1-6]: ");
    }

    public static void InicioE() {
        int opcion;
        do {
            Menu();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    AgregarEditorial();
                    break;
                case 2:
                    EliminarEditorial();
                    break;
                case 3:
                    EditarEditorial();
                    break;
                case 4:
                    ListarEditoriales();
                    break;
                case 5:
                    exportareditoriales();
                    break;
                case 6:
                    SalirMenu();
                    break;
                default:
                    Error();
                    break;
            }
        } while (opcion != 6);
    }
}
