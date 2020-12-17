package Vistacontrol;

import Modelo.Libro;
import Modelo.ReporteLibro;
import ModeloDao.LibroDao;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import utils.Leer;

public class MenuLibro {

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

    public static void exportarlibros() {
        System.out.println("\n--------Archivo creado con éxito, volviendo al menú secundario.--------");
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("C:/Users/Alvaro Alva Chipana/Documents/F/ListaLibros.txt");
            LibroDao libroDao = new LibroDao();
            List<ReporteLibro> reportes = libroDao.listarlibro();
            salida.println("---------------------------------------------------------------------------Listado de Libros-------------------------------------------------------------");
            salida.println("ID\tTitulo\t\t\tISBN\t\tPaginas\t\t\tAño\tStock\tAutor\t\t\t\tPais\t\t\tEditorial");
            for (ReporteLibro reporte : reportes) {
                salida.println(
                        reporte.getIdlibro() + "\t"
                        + darformato(reporte.getTitulo()) + "\t"
                        + reporte.getIsbn() + "\t"
                        + darformato(reporte.getPaginas()) + "\t"
                        + (reporte.getAño()) + "\t"
                        + reporte.getStock_disponibles() + "\t"
                        + darformatog(reporte.getNombreCompleto()) + "\t"
                        + darformato(reporte.getPnombre()) + "\t"
                        + darformato(reporte.getEnombre())
                );

            }

            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            salida.close();
        }
    }

    public static void listarlibro() {
        LibroDao libroDao = new LibroDao();
        List<ReporteLibro> reportes = libroDao.listarlibro();
        System.out.println("---------------------------------------------------------------------------------------------------------------Listado de Libros------------------------------------------------------------------------------------");
        System.out.println("ID\t\tTitulo\t\t\tISBN\t\tPaginas\t\t\tAño\tStock\tStock_Desponible\tAutor\t\t\t\t\tPais\t\t\tEditorial");
        for (ReporteLibro reporte : reportes) {
            System.out.println(
                    reporte.getIdlibro() + "\t"
                    + darformatog(reporte.getTitulo()) + "\t"
                    + reporte.getIsbn() + "\t"
                    + darformato(reporte.getPaginas()) + "\t"
                    + (reporte.getAño()) + "\t"
                    + reporte.getSotck() + "\t"
                    + reporte.getStock_disponibles() + "\t\t\t"
                    + darformatog(reporte.getNombreCompleto()) + "\t\t"
                    + darformato(reporte.getPnombre()) + "\t"
                    + darformato(reporte.getEnombre())
            );
        }
    }

    public static void agregarlibro() {

        String titulo;
        String isbn;
        String paginas;
        String año;
        int stock;
        int Stock_disponibles;
        int idautor;
        int idpais;
        int ideditorial;
        System.out.println("Titulo:");
        titulo = Leer.cadena();
        while (titulo.length() > 50) {
            System.out.println("Limite de digitos superado(Limite=50), intente de nuevo.");
            System.out.println("Titulo:");
            titulo = Leer.cadena();
        }
        System.out.println("ISBN: ");
        isbn = Leer.cadena();
        while (isbn.length() > 14) {
            System.out.println("Limite de digitos superado(Limite=14), intente de nuevo.");
            System.out.println("ISBN: ");
            isbn = Leer.cadena();
        }
        System.out.println("Paginas:");
        paginas = Leer.cadena();
        while (paginas.length() > 10) {
            System.out.println("Limite de digitos superado(Limite=10), intente de nuevo.");
            System.out.println("Paginas:");
            paginas = Leer.cadena();
        }
        System.out.println("Año:");
        año = Leer.cadena();
        while (año.length() > 4) {
            System.out.println("Limite de digitos superado(Limite=4), intente de nuevo.");
            System.out.println("Año:");
            año = Leer.cadena();
        }
        System.out.println("Stock:");
        stock = Leer.entero();

        System.out.println("Stocks disponibles:");
        Stock_disponibles = Leer.entero();
        MenuAutor.listar2();
        System.out.println("Idautor:");
        idautor = Leer.entero();
        MenuPaises.ListarPaises();
        System.out.println("Idpais:");
        idpais = Leer.entero();
        MenuEditoriales.ListarEditoriales();
        System.out.println("Ideditorial:");
        ideditorial = Leer.entero();
        Libro libro = new Libro(titulo, isbn, paginas, año, stock, Stock_disponibles, idautor, idpais, ideditorial);
        LibroDao libroDao = new LibroDao();
        libroDao.agregarlibro(libro);

    }

    public static void editarlibro() {
        listarlibro();
        System.out.println("Id del libro a editar:");
        int id = Leer.entero();

        String titulo;
        String isbn;
        String paginas;
        String año;
        int stock;
        int Stock_disponibles;
        int idautor;
        int idpais;
        int ideditorial;
        System.out.println("Titulo:");
        titulo = Leer.cadena();
        while (titulo.length() > 50) {
            System.out.println("Limite de digitos superado(Limite=50), intente de nuevo.");
            System.out.println("Titulo:");
            titulo = Leer.cadena();
        }
        System.out.println("ISBN: ");
        isbn = Leer.cadena();
        while (isbn.length() > 14) {
            System.out.println("Limite de digitos superado(Limite=14), intente de nuevo.");
            System.out.println("ISBN: ");
            isbn = Leer.cadena();
        }
        System.out.println("Paginas:");
        paginas = Leer.cadena();
        while (paginas.length() > 10) {
            System.out.println("Limite de digitos superado(Limite=10), intente de nuevo.");
            System.out.println("Paginas:");
            paginas = Leer.cadena();
        }
        System.out.println("Año:");
        año = Leer.cadena();
        while (año.length() > 4) {
            System.out.println("Limite de digitos superado(Limite=4), intente de nuevo.");
            System.out.println("Año:");
            año = Leer.cadena();
        }
        System.out.println("Stock:");
        stock = Leer.entero();

        System.out.println("Stocks disponibles:");
        Stock_disponibles = Leer.entero();
        MenuAutor.listar2();
        System.out.println("Idautor:");
        idautor = Leer.entero();
        MenuPaises.ListarPaises();
        System.out.println("Idpais:");
        idpais = Leer.entero();
        MenuEditoriales.ListarEditoriales();
        System.out.println("Ideditorial:");
        ideditorial = Leer.entero();
        Libro libro = new Libro(id, titulo, isbn, paginas, año, stock, Stock_disponibles, idautor, idpais, ideditorial);
        LibroDao libroDao = new LibroDao();
        libroDao.editarlibro(libro);
    }

    public static void eliminarlibro() {
        listarlibro();
        System.out.println("Id del libro a eliminar:");
        int id = Leer.entero();

        LibroDao libroDao = new LibroDao();
        libroDao.eliminarlibro(id);
    }

    public static void ErrorError() {
        System.out.println("Vuelva a intentarlo, Error.");
    }

    public static void saliralmenuprincipal() {
        System.out.println("\n--------------Dirigiendo a Menu Principal--------------");

    }

    public static void MenuLibrosS() {
        System.out.println("\n--------------MENU LIBROS--------------");
        System.out.println("1. Agregar");
        System.out.println("2. Editar");
        System.out.println("3. Eliminar");
        System.out.println("4. Listar");
        System.out.println("5. Exportar");
        System.out.println("6. Salir al menú principal");
        System.out.print("Escoja opción [1-6]: ");
    }

    public static void InicioL() {
        int opcion;
        do {
            MenuLibrosS();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregarlibro();
                    break;
                case 2:
                    editarlibro();
                    break;
                case 3:
                    eliminarlibro();
                    break;
                case 4:
                    listarlibro();
                    break;
                case 5:
                    exportarlibros();
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
