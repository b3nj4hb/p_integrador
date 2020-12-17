package vista_control;

import modelos.Devolucion;

import modelo_DAO.DevolucionDao;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import utils.Leer;

public class MenuDevolucion {

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

    public static void exportardevolucion() {
        System.out.println("\n--------Archivo creado con éxito, volviendo al menú secundario.--------");
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("C:/Users/Alvaro Alva Chipana/Documents/F/ListaDevolucion.txt");
            DevolucionDao reporteDao = new DevolucionDao();
            List<Devolucion> reportes = reporteDao.listardevolucion();
            salida.println("-----------------------------------------------Listado de Devoluciones Dadas------------------------------------------------");
            salida.println("ID\tFecha_Prestamo\t\tFecha_Devolucion\tUsuario\t\t\t\t\tTitulo\t\t\tEstado");
            for (Devolucion reporte : reportes) {
                salida.println(
                        reporte.getIdprestamo() + "\t"
                        + reporte.getFecha_prestamo() + "\t" + "\t"
                        + reporte.getFecha_devolucion() + "\t" + "\t"
                        + darformatog(reporte.getNombreCompleto()) + "\t" + "\t"
                        + darformato(reporte.getLnombre()) + "\t"
                        + reporte.getEstado());
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            salida.close();
        }
    }

    public static void listardevo() {
        DevolucionDao reporteDao = new DevolucionDao();
        List<Devolucion> reportes = reporteDao.listardevolucion();
        System.out.println("-----------------------------------------------Listado de Devoluciones Dadas------------------------------------------------");
        System.out.println("ID\tFecha_Prestamo\t\tFecha_Devolucion\tUsuario\t\t\t\t\tTitulo\t\t\tEstado");
        for (Devolucion reporte : reportes) {
            System.out.println(
                    reporte.getIdprestamo() + "\t"
                    + reporte.getFecha_prestamo() + "\t" + "\t"
                    + reporte.getFecha_devolucion() + "\t" + "\t"
                    + darformatog(reporte.getNombreCompleto()) + "\t" + "\t"
                    + darformato(reporte.getLnombre()) + "\t"
                    + reporte.getEstado());
        }
    }

    public static void listarpres() {
        MenuUsuario.listarusuario();
        System.out.println("Elija el Dni del usuario:");
        String dni = Leer.cadena();
        while (dni.length() != 8) {
            System.out.println("El DNI solo debe ser de 8 Dígitos:");
            System.out.println("Elija el Dni del usuario:");
            dni = Leer.cadena();
        }

        DevolucionDao reporteDao = new DevolucionDao();
        DevolucionDao devolucionDao = new DevolucionDao();
        List<Devolucion> devoluciones = reporteDao.listarlibrosprestados(dni);
        System.out.println("----------------------------------------------------Listado de Prestamos pendientes de " + dni + "---------------------------------------------------");
        System.out.println("ID\tFecha_Prestamo\t\tFecha_Devolucion\tUsuario\t\t\t\t\tIdlibro\t\tTitulo\t\t\tEstado");
        for (Devolucion devolucion : devoluciones) {
            System.out.println(
                    devolucion.getIdprestamo() + "\t"
                    + devolucion.getFecha_prestamo() + "\t" + "\t"
                    + devolucion.getFecha_devolucion() + "\t" + "\t"
                    + darformatog(devolucion.getNombreCompleto()) + "\t" + "\t"
                    + devolucion.getIdlibro() + "\t\t"
                    + darformato(devolucion.getLnombre()) + "\t"
                    + devolucion.getEstado());
        }
        editardevolucion();

    }

    public static void editardevolucion() {
        String estado;
        System.out.println("Elija el id del prestamo a devolver:");
        int id = Leer.entero();
        System.out.println("ID del libro :");
        int idlibro = Leer.entero();
        System.out.println("Estado: -D-");
        estado = "D";
        Devolucion devolucion = new Devolucion(id, estado);
        DevolucionDao devolucionDao = new DevolucionDao();
        devolucionDao.lacosadelstock(idlibro);
        devolucionDao.editardevolucion(devolucion);

    }

    public static void ErrorError() {
        System.out.println("Vuelva a intentarlo, Error.");
    }

    public static void saliralmenuprincipal() {
        System.out.println("\n--------------Dirigiendo a Menu Principal--------------");

    }

    public static void MenuDev() {
        System.out.println("\n--------------MENU DEVOLUCIONES--------------");
        System.out.println("1. Devolución de Libros");
        System.out.println("2. Listar Devoluciones hechas");
        System.out.println("3. Exportar");
        System.out.println("4. Salir al menú principal");
        System.out.print("Escoja opción [1-4]: ");
    }

    public static void InicioPres() {
        int opcion;
        do {
            MenuDev();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    listarpres();
                    break;
                case 2:
                    listardevo();
                    break;
                case 3:
                    exportardevolucion();
                    break;
                case 4:
                    saliralmenuprincipal();
                    break;
                default:
                    ErrorError();
                    break;
            }
        } while (opcion != 4);
    }
}
