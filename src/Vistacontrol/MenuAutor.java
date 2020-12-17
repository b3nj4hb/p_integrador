package Vistacontrol;

import Modelo.Autor;
import ModeloDao.AutorDao;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import utils.Leer;

public class MenuAutor {

    public static String darformatog(String cadena) {
        if (cadena.length() == 1) {
            return cadena + "                              ";
        } else if (cadena.length() == 2) {
            return cadena + "                             ";
        } else if (cadena.length() == 3) {
            return cadena + "                            ";
        } else if (cadena.length() == 4) {
            return cadena + "                           ";
        } else if (cadena.length() == 5) {
            return cadena + "                          ";
        } else if (cadena.length() == 6) {
            return cadena + "                         ";
        } else if (cadena.length() == 7) {
            return cadena + "                        ";
        } else if (cadena.length() == 8) {
            return cadena + "                       ";
        } else if (cadena.length() == 9) {
            return cadena + "                      ";
        } else if (cadena.length() == 10) {
            return cadena + "                     ";
        } else if (cadena.length() == 11) {
            return cadena + "                    ";
        } else if (cadena.length() == 12) {
            return cadena + "                   ";
        } else if (cadena.length() == 13) {
            return cadena + "                  ";
        } else if (cadena.length() == 14) {
            return cadena + "                 ";
        } else if (cadena.length() == 15) {
            return cadena + "                ";
        } else if (cadena.length() == 16) {
            return cadena + "               ";
        } else if (cadena.length() == 17) {
            return cadena + "              ";
        } else if (cadena.length() == 18) {
            return cadena + "             ";
        } else if (cadena.length() == 19) {
            return cadena + "            ";
        } else if (cadena.length() == 20) {
            return cadena + "           ";
        } else if (cadena.length() == 21) {
            return cadena + "          ";
        } else if (cadena.length() == 22) {
            return cadena + "         ";
        } else if (cadena.length() == 23) {
            return cadena + "        ";
        } else if (cadena.length() == 24) {
            return cadena + "       ";
        } else if (cadena.length() == 25) {
            return cadena + "      ";
        } else if (cadena.length() == 26) {
            return cadena + "     ";
        } else if (cadena.length() == 27) {
            return cadena + "    ";
        } else if (cadena.length() == 28) {
            return cadena + "   ";
        } else if (cadena.length() == 29) {
            return cadena + "  ";
        } else if (cadena.length() == 30) {
            return cadena + " ";
        } else if (cadena.length() == 31) {
            return cadena + "";

        } else if (cadena.length() > 31) {
            return cadena.substring(0, 29) + "..";
        } else {
            return cadena;
        }

    }

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

    public static void exportarautores() {
        System.out.println("\n--------Archivo creado con éxito, volviendo al menú secundario.--------");
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("C:/Users/Alvaro Alva Chipana/Documents/F/ListaAutores.txt");
            AutorDao autorDao = new AutorDao();
            List<Autor> autores = autorDao.listarautor();
            salida.println("----------------------Listado de Autores--------------------");
            salida.println("ID\tNombreCompleto");
            for (Autor autor : autores) {
                salida.println(autor.getIdautor() + "\t"
                        + (autor.getNombreCompleto())
                );
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            salida.close();
        }
    }

    public static void listar2() {
        AutorDao autorDao = new AutorDao();
        List<Autor> autores = autorDao.listarautor();
        System.out.println("----------------------Listado de Autores--------------------");
        System.out.println("ID\t---NOMBRE COMPLETO---");
        for (Autor autor : autores) {
            System.out.println(autor.getIdautor() + "\t"
                    + (autor.getNombreCompleto())
            );
        }
    }

    public static void agregar2() {
        String nombre;
        String apellidos;

        System.out.println("Nombre:");
        nombre = Leer.cadena();
        while (nombre.length() > 50) {
            System.out.println("Limite de digitos superado(Limite=50), intente de nuevo.");
            System.out.print("Nombre: ");
            nombre = Leer.cadena();
        }
        System.out.println("Apellidos:");
        apellidos = Leer.cadena();
        while (apellidos.length() > 50) {
            System.out.println("Limite de digitos superado(Limite=50), intente de nuevo.");
            System.out.println("Apellidos:");
            apellidos = Leer.cadena();
        }
        Autor autor = new Autor(nombre, apellidos);
        AutorDao autorDao = new AutorDao();
        autorDao.agregarautor(autor);
    }

    public static void editar2() {
        listar2();
        System.out.println("Id del campo a editar");
        int id = Leer.entero();
        String nombre;
        String apellidos;

        System.out.println("Nombre:");
        nombre = Leer.cadena();
        while (nombre.length() > 50) {
            System.out.println("Limite de digitos superado(Limite=50), intente de nuevo.");
            System.out.print("Nombre: ");
            nombre = Leer.cadena();
        }
        System.out.println("Apellidos:");
        apellidos = Leer.cadena();
        while (apellidos.length() > 50) {
            System.out.println("Limite de digitos superado(Limite=50), intente de nuevo.");
            System.out.println("Apellidos:");
            apellidos = Leer.cadena();
        }
        Autor autor = new Autor(id, nombre, apellidos);
        AutorDao autorDao = new AutorDao();
        autorDao.editarautor(autor);
    }

    public static void elimnar2() {
        listar2();
        System.out.println("Id del campo a eliminar");
        int id = Leer.entero();
        AutorDao autorDao = new AutorDao();
        autorDao.eliminarautor(id);
    }

    public static void saliralmenuprincipal() {
        System.out.println("\n--------------Dirigiendo a Menu Principal--------------");
    }

    public static void ErrorError() {
        System.out.println("Vuelva a intentarlo, Error.");
    }

    public static void MenuAutoresS() {
        System.out.println("\n--------------MENU AUTORES--------------");
        System.out.println("1. Agregar");
        System.out.println("2. Editar");
        System.out.println("3. Eliminar");
        System.out.println("4. Listar");
        System.out.println("5. Exportar");
        System.out.println("6. Salir al menú principal");
        System.out.print("Escoja opción [1-6]: ");
    }

    public static void InicioA() {
        int opcion;
        do {
            MenuAutoresS();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregar2();
                    break;
                case 2:
                    editar2();
                    break;
                case 3:
                    elimnar2();
                    break;
                case 4:
                    listar2();
                    break;
                case 5:
                    exportarautores();
                    break;
                case 6:
                    saliralmenuprincipal();
                    break;
                default:
                    ErrorError();
                    break;
            }
        } while (opcion != 6);
    }
}
