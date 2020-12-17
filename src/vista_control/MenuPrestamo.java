package vista_control;

import modelos.Prestamo;
import modelos.ReporteLibro;
import modelos.ReportePrestamo;
import modelo_DAO.LibroDao;
import modelo_DAO.ReporteDao;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import utils.Leer;

public class MenuPrestamo {

    public static void ErrorError() {
        System.out.println("Vuelva a intentarlo, Error.");
    }

    public static void saliralmenuprincipal() {
        System.out.println("\n--------------Dirigiendo a Menu Principal--------------");

    }

    public static void MenuLibrosS() {
        System.out.println("\n--------------MENU PRÉSTAMOS--------------");
        System.out.println("1. Agregar Prestamo");
        System.out.println("2. Listar Prestamos Pendientes");
        System.out.println("3. Exportar");
        System.out.println("4. Salir al menú principal");
        System.out.print("Escoja opción [1-4]: ");
    }

    public static void InicioPres() {
        int opcion;
        do {
            MenuLibrosS();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregarpres();
                    break;
                case 2:
                    listarpres();
                    break;
                case 3:
                    exportarprestamos();
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

    public static void exportarprestamos() {
        System.out.println("\n--------Archivo creado con éxito, volviendo al menú secundario.--------");
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("D:/Mis cosas/Jacob Estudios/F/ListaPréstamos.txt");
            ReporteDao reporteDao = new ReporteDao();
            List<ReportePrestamo> reportes = reporteDao.listarusuarios();
            salida.println("-----------------------------------------------Listado de Prestamos pendientes------------------------------------------------");
            salida.println("ID\tFecha_Prestamo\t\tFecha_Devolucion\tUsuario\t\t\t\t\tTitulo\t\t\tEstado");
            for (ReportePrestamo reporte : reportes) {
                salida.println(
                        reporte.getIdreporte() + "\t"
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

    public static void listarpres() {
        ReporteDao reporteDao = new ReporteDao();
        List<ReportePrestamo> reportes = reporteDao.listarusuarios();
        System.out.println("-----------------------------------------------Listado de Prestamos pendientes------------------------------------------------");
        System.out.println("ID\tFecha_Prestamo\t\tFecha_Devolucion\tUsuario\t\t\t\t\tTitulo\t\t\tEstado");
        for (ReportePrestamo reporte : reportes) {
            System.out.println(
                    reporte.getIdreporte() + "\t"
                    + reporte.getFecha_prestamo() + "\t" + "\t"
                    + reporte.getFecha_devolucion() + "\t" + "\t"
                    + darformatog(reporte.getNombreCompleto()) + "\t" + "\t"
                    + darformato(reporte.getLnombre()) + "\t"
                    + reporte.getEstado());
        }
    }

    public static void agregarpres() {

        String fecha_prestamo;
        String fecha_devolucion;
        String estado;
        int idusuario;
        int idlibro;
        MenuUsuario.listarusuario();
        System.out.print("Elija del usuario a prestar:");
        idusuario = Leer.entero();
        MenuLibro.listarlibro();
        System.out.print("Elija id del libro a prestar:");
        idlibro = Leer.entero();

        int a;
        LibroDao libroDao = new LibroDao();
        List<ReporteLibro> stocks = libroDao.stock(idlibro);

        for (ReporteLibro stock : stocks) {
            a = stock.getStock_disponibles();
            if (a == 0) {
                System.out.println("Lo sentimos no hay libros disponibles");
            } else {
                System.out.println("Fecha de Prestamo:Obtenida desde el Sistema");
                LocalDate fecha = LocalDate.now();
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                fecha_prestamo = sdf.format(date);
                System.out.print("Fechan de Deolucion:");
                fecha_devolucion = Leer.cadena();
                System.out.print("Estado:-P-");
                estado = "P";
                Prestamo prestamo = new Prestamo(fecha_prestamo, fecha_devolucion, estado, idusuario, idlibro);
                ReporteDao reporteDao = new ReporteDao();
                reporteDao.agregarusuario(prestamo);
                reporteDao.lacosadelstock(idlibro);
            }

        }

    }

}
