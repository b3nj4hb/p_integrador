package vista_control;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import modelo_DAO.*;
import modelos.*;
import utils.*;

public class Index {

    public static int opcion;

    public static void salir() {
        System.out.println("Hasta la proxima...");
    }

    public static void error() {
        System.out.println("Error, solo opciones del menú...");
    }

    public static void Menu_principal() {
        System.out.println("\n\tMenu Principal");
        System.out.println("1. Datos Libros");
        System.out.println("2. Datos Autores");
        System.out.println("3. Datos Editoriales");
        System.out.println("4. Datos Pais");
        System.out.println("5. Datos Usuario");
        System.out.println("6. Prestamo");
        System.out.println("7. Devolucion");
        System.out.println("8. Salir");
        System.out.print("Escoja opción [1-9]: ");
    }

    public static void Menu_secundario() {
        System.out.println("1. Agregar");
        System.out.println("2. Editar");
        System.out.println("3. Eliminar");
        System.out.println("4. Listar");
        System.out.println("5. Exportar");
        System.out.println("6. Salir");
        System.out.print("Escoja opción [1-6]: ");
    }

    public static void menu_devolucion() {
        System.out.println("\n\tMenu Devolucion");
        System.out.println("1. Devolución de Libros");
        System.out.println("2. Listar Devoluciones");
        System.out.println("3. Exportar");
        System.out.println("4. Salir al menú principal");
        System.out.print("Escoja opción [1-4]: ");
    }

    public static void menu_prestamo() {
        System.out.println("\n\tMenu Prestamo");
        System.out.println("1. Agregar Prestamo");
        System.out.println("2. Listar Prestamos");
        System.out.println("3. Exportar");
        System.out.println("4. Salir al menú principal");
        System.out.print("Escoja opción [1-4]: ");
    }

    public static void Switches() {

        do {
            Menu_principal();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    switch_libro();
                    break;
                case 2:
                    switch_autor();
                    break;
                case 3:
                    switch_editorial();
                    break;
                case 4:
                    switch_pais();
                    break;
                case 5:
                    switch_usuario();
                    break;
                case 6:
                    switch_prestamo();
                    break;
                case 7:
                    switch_devolucion();
                    break;
                case 8:
                    salir();
                    break;
                default:
                    error();
                    break;
            }
        } while (opcion != 8);
    }

    public static void switch_autor() {
        int opcion;
        do {
            System.out.println("\n\tMenu Autor");
            Menu_secundario();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregar_autor();
                    break;
                case 2:
                    editar_autor();
                    break;
                case 3:
                    eliminar_autor();
                    break;
                case 4:
                    listar_autor();
                    break;
                case 5:
                    exportar_autores();
                    break;
                case 6:
                    salir();
                    break;
                default:
                    error();
                    break;
            }
        } while (opcion != 6);
    }

    public static void switch_devolucion() {
        int opcion;
        do {
            menu_devolucion();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    listar_prestamo();
                    break;
                case 2:
                    listar_devolucion();
                    break;
                case 3:
                    exportar_devolucion();
                    break;
                case 4:
                    salir();
                    break;
                default:
                    error();
                    break;
            }
        } while (opcion != 4);
    }

    public static void switch_editorial() {
        int opcion;
        do {
            System.out.println("\n\tMenu Editorial");
            Menu_secundario();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregar_editorial();
                    break;
                case 2:
                    eliminar_editorial();
                    break;
                case 3:
                    editar_editorial();
                    break;
                case 4:
                    listar_editorial();
                    break;
                case 5:
                    exportar_editorial();
                    break;
                case 6:
                    salir();
                    break;
                default:
                    error();
                    break;
            }
        } while (opcion != 6);
    }

    public static void switch_libro() {
        int opcion;
        do {
            System.out.println("\n\tMenu Libro");
            Menu_secundario();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregar_libro();
                    break;
                case 2:
                    editar_libro();
                    break;
                case 3:
                    eliminar_libro();
                    break;
                case 4:
                    listar_libro();
                    break;
                case 5:
                    exportar_libros();
                    break;
                case 6:
                    salir();
                    break;
                default:
                    error();
                    break;
            }
        } while (opcion != 6);
    }

    public static void switch_pais() {
        int opcion;
        do {
            System.out.println("\n\tMenu Pais");
            Menu_secundario();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregar_pais();
                    break;
                case 2:
                    editar_pais();
                    break;
                case 3:
                    eliminar_pais();
                    break;
                case 4:
                    listar_pais();
                    break;
                case 5:
                    exportar_paises();
                    break;
                case 6:
                    salir();
                    break;
                default:
                    error();
                    break;
            }
        } while (opcion != 6);
    }

    public static void switch_prestamo() {
        int opcion;
        do {
            menu_prestamo();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregar_prestamo();
                    break;
                case 2:
                    listar_prestamos();
                    break;
                case 3:
                    exportar_prestamo();
                    break;
                case 4:
                    salir();
                    break;
                default:
                    error();
                    break;
            }
        } while (opcion != 4);
    }

    public static void switch_usuario() {
        int opcion;
        do {
            System.out.println("\n\tMenu Usuario");
            Menu_secundario();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregar_usuario();
                    break;
                case 2:
                    editar_usuario();
                    break;
                case 3:
                    eliminar_usuario();
                    break;
                case 4:
                    listar_usuario();
                    break;
                case 5:
                    exportar_usuario();
                    break;
                case 6:
                    salir();
                    break;
                default:
                    error();
                    break;
            }
        } while (opcion != 6);
    }

    public static void exportar_autores() {
        System.out.println("\n\tArchivo creado");
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("C:/Users/benja/Escritorio/reportes/autores.txt");
            AutorDAO autorDao = new AutorDAO();
            List<Autor> autores = autorDao.listarautor();
            salida.println("\t ~~ Lista de Autores ~~");
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

    public static void exportar_devolucion() {
        System.out.println("\n\tArchivo creado");
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("C:/Users/benja/Escritorio/reportes/devolucion.txt");
            DevolucionDAO reporteDao = new DevolucionDAO();
            List<Devolucion> reportes = reporteDao.listardevolucion();
            salida.println("\t ~~ Lista de Devoluciones ~~");
            salida.println("ID\tFecha_Prestamo\t\tFecha_Devolucion\tUsuario\t\t\t\t\tTitulo\t\t\tEstado");
            for (Devolucion reporte : reportes) {
                salida.println(
                        reporte.getIdprestamo() + "\t"
                        + reporte.getFecha_prestamo() + "\t" + "\t"
                        + reporte.getFecha_devolucion() + "\t" + "\t"
                        + Dar.formatoo(reporte.getNombreCompleto()) + "\t" + "\t"
                        + Dar.Formatoo(reporte.getLnombre()) + "\t"
                        + reporte.getEstado());
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            salida.close();
        }
    }

    public static void exportar_editorial() {
        System.out.println("\n\tArchivo creado");
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("C:/Users/benja/Escritorio/reportes/editorial.txt");
            EditorialDAO editorialDAO = new EditorialDAO();
            List<Editorial> editoriales = editorialDAO.listareditoriales();
            salida.println("\t ~~ Lista de Editoriales ~~");
            salida.println("ID\tNombre\t\t\tCodigo\t\t\tDireccion\t\t\t\t\t\t\tURL\t\t\t\t\t\t\t\tEstado");
            for (Editorial editorial : editoriales) {
                salida.println(
                        editorial.getIdeditorial() + "\t"
                        + Dar.Formatoo(editorial.getNombre()).toUpperCase() + "\t"
                        + Dar.Formatoo(editorial.getCodigo()) + "\t"
                        + Dar.formatoos(editorial.getDireccion()) + "\t"
                        + Dar.formatoos(editorial.getURL()) + "\t"
                        + editorial.getEstado().toUpperCase());
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            salida.close();
        }
    }

    public static void exportar_libros() {
        System.out.println("\n\tArchivo creado");
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("C:/Users/benja/Escritorio/reportes/libro.txt");
            LibroDAO libroDao = new LibroDAO();
            List<ReporteLibro> reportes = libroDao.listarlibro();
            salida.println("\t ~~ Lista de Libros ~~");
            salida.println("ID\tTitulo\t\t\tISBN\t\tPaginas\t\t\tAño\tStock\tAutor\t\t\t\tPais\t\t\tEditorial");
            for (ReporteLibro reporte : reportes) {
                salida.println(reporte.getIdlibro() + "\t"
                        + Dar.Formatoo(reporte.getTitulo()) + "\t"
                        + reporte.getIsbn() + "\t"
                        + Dar.Formatoo(reporte.getPaginas()) + "\t"
                        + (reporte.getAño()) + "\t"
                        + reporte.getStock_disponibles() + "\t"
                        + Dar.formatoo(reporte.getNombreCompleto()) + "\t"
                        + Dar.Formatoo(reporte.getPnombre()) + "\t"
                        + Dar.Formatoo(reporte.getEnombre())
                );
            }

            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            salida.close();
        }
    }

    public static void exportar_paises() {
        System.out.println("\n\tArchivo creado");
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("C:/Users/benja/Escritorio/reportes/pais.txt");
            PaisDAO paisDAO = new PaisDAO();
            List<Pais> paises = paisDAO.listarpaises();
            salida.println("\t ~~ Lista de Paises ~~");
            salida.println("ID\tNombre\t\t\tEstado");
            for (Pais pais : paises) {
                salida.println(pais.getIdpais() + "\t"
                        + Dar.Formatoo(pais.getNombre()) + "\t"
                        + pais.getEstado());

            }

            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            salida.close();
        }
    }

    public static void exportar_prestamo() {
        System.out.println("\n\tArchivo creado");
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("C:/Users/benja/Escritorio/reportes/prestamo.txt");
            ReporteDAO reporteDao = new ReporteDAO();
            List<ReportePrestamo> reportes = reporteDao.listarusuarios();
            salida.println("\t ~~ Lista de Prestamos ~~");
            salida.println("ID\tFecha_Prestamo\t\tFecha_Devolucion\tUsuario\t\t\t\t\tTitulo\t\t\tEstado");
            for (ReportePrestamo reporte : reportes) {
                salida.println(reporte.getIdreporte() + "\t"
                        + reporte.getFecha_prestamo() + "\t" + "\t"
                        + reporte.getFecha_devolucion() + "\t" + "\t"
                        + Dar.formatoo(reporte.getNombreCompleto()) + "\t" + "\t"
                        + Dar.Formatoo(reporte.getLnombre()) + "\t"
                        + reporte.getEstado());
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            salida.close();
        }
    }

    public static void exportar_usuario() {
        System.out.println("\n\tArchivo creado");
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("C:/Users/benja/Escritorio/reportes/usuario.txt");
            UsuarioDAO usuarioDao = new UsuarioDAO();
            List<Usuario> usuarios = usuarioDao.listarusuarios();
            salida.println("\t ~~ Lista de Usuarios ~~");
            salida.println("ID\tNombreCompleto\t\t\t\tDni\t\tEstado");
            for (Usuario usuario : usuarios) {
                salida.println(
                        usuario.getIdusuario() + "\t"
                        + Dar.formatoo(usuario.getNombreCompleto()) + "\t" + "\t"
                        + usuario.getDni() + "\t"
                        + usuario.getEstado()
                );
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            salida.close();
        }
    }

    public static void listar_autor() {
        AutorDAO autorDao = new AutorDAO();
        List<Autor> autores = autorDao.listarautor();
        System.out.println("\t~~ Lista de Autores ~~");
        System.out.println("ID\tNOMBRE COMPLETO");
        for (Autor autor : autores) {
            System.out.println(autor.getIdautor() + "\t"
                    + (autor.getNombreCompleto())
            );
        }
    }

    public static void listar_devolucion() {
        DevolucionDAO reporteDao = new DevolucionDAO();
        List<Devolucion> reportes = reporteDao.listardevolucion();
        System.out.println("\t ~~ Lista de Devoluciones ~~");
        System.out.println("ID\tFecha_Prestamo\t\tFecha_Devolucion\tUsuario\t\t\t\t\tTitulo\t\t\tEstado");
        for (Devolucion reporte : reportes) {
            System.out.println(
                    reporte.getIdprestamo() + "\t"
                    + reporte.getFecha_prestamo() + "\t" + "\t"
                    + reporte.getFecha_devolucion() + "\t" + "\t"
                    + Dar.formatoo(reporte.getNombreCompleto()) + "\t" + "\t"
                    + Dar.Formatoo(reporte.getLnombre()) + "\t"
                    + reporte.getEstado());
        }
    }

    public static void listar_prestamo() {
        listar_usuario();
        System.out.print("Elija el Dni del usuario: ");
        String dni = Leer.cadena();
        while (dni.length() != 8) {
            System.out.println("El DNI solo debe ser de 8 Dígitos:");
            System.out.println("Elija el Dni del usuario:");
            dni = Leer.cadena();
        }

        DevolucionDAO reporteDao = new DevolucionDAO();
        DevolucionDAO devolucionDao = new DevolucionDAO();
        List<Devolucion> devoluciones = reporteDao.listarlibrosprestados(dni);
        System.out.println("\t~~ Prestamos ~~" + dni + "~~");
        System.out.println("ID\tFecha_Prestamo\t\tFecha_Devolucion\tUsuario\t\t\t\t\tIdlibro\t\tTitulo\t\t\tEstado");
        for (Devolucion devolucion : devoluciones) {
            System.out.println(
                    devolucion.getIdprestamo() + "\t"
                    + devolucion.getFecha_prestamo() + "\t" + "\t"
                    + devolucion.getFecha_devolucion() + "\t" + "\t"
                    + Dar.formatoo(devolucion.getNombreCompleto()) + "\t" + "\t"
                    + devolucion.getIdlibro() + "\t\t"
                    + Dar.Formatoo(devolucion.getLnombre()) + "\t"
                    + devolucion.getEstado());
        }
        editar_devolucion();

    }

    public static void listar_editorial() {
        EditorialDAO editorialDAO = new EditorialDAO();
        List<Editorial> editoriales = editorialDAO.listareditoriales();
        System.out.println("~~ Lista de Editoriales ~~");
        System.out.println("ID\tNombre\t\t\tCodigo\t\t\tDireccion\t\t\t\t\t\t\tURL\t\t\t\t\t\t\t\tEstado");
        for (Editorial editorial : editoriales) {
            System.out.println(
                    editorial.getIdeditorial() + "\t"
                    + Dar.Formatoo(editorial.getNombre()).toUpperCase() + "\t"
                    + Dar.Formatoo(editorial.getCodigo()) + "\t"
                    + Dar.formatoos(editorial.getDireccion()) + "\t"
                    + Dar.formatoos(editorial.getURL()) + "\t"
                    + editorial.getEstado().toUpperCase());
        }
    }

    public static void listar_libro() {
        LibroDAO libroDao = new LibroDAO();
        List<ReporteLibro> reportes = libroDao.listarlibro();
        System.out.println("~~ Lista de Libros ~~");
        System.out.println("ID\t\tTitulo\t\t\tISBN\t\tPaginas\t\t\tAño\tStock\tStock_Desponible\tAutor\t\t\t\t\tPais\t\t\tEditorial");
        for (ReporteLibro reporte : reportes) {
            System.out.println(reporte.getIdlibro() + "\t"
                    + Dar.formatoo(reporte.getTitulo()) + "\t"
                    + reporte.getIsbn() + "\t"
                    + Dar.Formatoo(reporte.getPaginas()) + "\t"
                    + (reporte.getAño()) + "\t"
                    + reporte.getSotck() + "\t"
                    + reporte.getStock_disponibles() + "\t\t\t"
                    + Dar.formatoo(reporte.getNombreCompleto()) + "\t\t"
                    + Dar.Formatoo(reporte.getPnombre()) + "\t"
                    + Dar.Formatoo(reporte.getEnombre())
            );
        }
    }

    public static void listar_pais() {
        PaisDAO paisDAO = new PaisDAO();
        List<Pais> paises = paisDAO.listarpaises();
        System.out.println("~~ Lista de Paises ~~");
        System.out.println("ID\tNombre\t\t\tEstado");
        for (Pais pais : paises) {
            System.out.println(pais.getIdpais() + "\t"
                    + Dar.Formatoo(pais.getNombre()) + "\t"
                    + pais.getEstado());

        }
    }

    public static void listar_prestamos() {
        ReporteDAO reporteDao = new ReporteDAO();
        List<ReportePrestamo> reportes = reporteDao.listarusuarios();
        System.out.println("~~ Lista de Prestamos ~~");
        System.out.println("ID\tFecha_Prestamo\t\tFecha_Devolucion\tUsuario\t\t\t\t\tTitulo\t\t\tEstado");
        for (ReportePrestamo reporte : reportes) {
            System.out.println(reporte.getIdreporte() + "\t"
                    + reporte.getFecha_prestamo() + "\t" + "\t"
                    + reporte.getFecha_devolucion() + "\t" + "\t"
                    + Dar.formatoo(reporte.getNombreCompleto()) + "\t" + "\t"
                    + Dar.Formatoo(reporte.getLnombre()) + "\t"
                    + reporte.getEstado());
        }
    }

    public static void listar_usuario() {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        List<Usuario> usuarios = usuarioDao.listarusuarios();
        System.out.println("~~ Lista de Usuarios ~~");
        System.out.println("ID\tNombreCompleto\t\t\t\tDni\t\tEstado");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getIdusuario() + "\t"
                    + Dar.formatoo(usuario.getNombreCompleto()) + "\t" + "\t"
                    + usuario.getDni() + "\t"
                    + usuario.getEstado()
            );
        }
    }

    public static void agregar_autor() {
        String nombre;
        String apellidos;
        System.out.println("\n\t~~ Agregar Autor ~~");
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
        AutorDAO autorDao = new AutorDAO();
        autorDao.agregarautor(autor);
    }

    public static void agregar_editorial() {
        String nombre;
        String codigo;
        String direccion;
        String URL;
        String estado;

        System.out.println("\n\t~~ Agregar Editorial ~~");
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

    public static void agregar_libro() {
        
        System.out.println("\n\t~~ Agregar Libro ~~");
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

        System.out.println("Stock disponible:");
        Stock_disponibles = Leer.entero();
        listar_autor();
        System.out.println("Idautor:");
        idautor = Leer.entero();
        listar_pais();
        System.out.println("Idpais:");
        idpais = Leer.entero();
        listar_editorial();
        System.out.println("Ideditorial:");
        ideditorial = Leer.entero();
        Libro libro = new Libro(titulo, isbn, paginas, año, stock, Stock_disponibles, idautor, idpais, ideditorial);
        LibroDAO libroDao = new LibroDAO();
        libroDao.agregarlibro(libro);

    }

    public static void agregar_pais() {
        String nombre;
        String estado;
        System.out.println("\n\t~~ Agregar Pais ~~");
        System.out.print("Nombre: ");
        nombre = Leer.cadena();
        while (nombre.length() > 50) {
            System.out.println("Limite de digitos superado(Limite=50), intente de nuevo.");
            System.out.println("Nombre:");
            nombre = Leer.cadena();
        }
        System.out.print("Estado: ");
        estado = Leer.cadena();
        while (estado.length() > 1) {
            System.out.println("Error: No se puede almacenar, muy extenso, volver a intentar");
            System.out.print("Estado: ");
            estado = Leer.cadena();

        }
        Pais pais = new Pais(nombre, estado);
        PaisDAO paisDAO = new PaisDAO();
        paisDAO.agregarpais(pais);
    }

    public static void agregar_usuario() {
        System.out.println("\n\t~~ Agregar Usuario ~~");
        String nombre;
        String apellidos;
        String dni;
        String estado;
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
        System.out.println("Dni:");
        dni = Leer.cadena();
        while (dni.length() != 8) {
            System.out.println("Limite de digitos superado(Limite=8), intente de nuevo.");
            System.out.println("Dni:");
            dni = Leer.cadena();
        }
        System.out.println("Estado:");
        estado = Leer.cadena();
        while (estado.length() != 1) {
            System.out.println("Limite de digitos superado(Limite=1), intente de nuevo.");
            System.out.println("Estado:");
            estado = Leer.cadena();
        }
        Usuario usuario = new Usuario(nombre, apellidos, dni, estado);
        UsuarioDAO usuarioDao = new UsuarioDAO();
        usuarioDao.agregarusuario(usuario);
    }

    public static void agregar_prestamo() {
        System.out.println("\n\t~~ Agregar Prestamo ~~");
        String fecha_prestamo;
        String fecha_devolucion;
        String estado;
        int idusuario;
        int idlibro;
        listar_usuario();
        System.out.print("Elija del usuario a prestar:");
        idusuario = Leer.entero();
        listar_libro();
        System.out.print("Elija id del libro a prestar:");
        idlibro = Leer.entero();

        int a;
        LibroDAO libroDao = new LibroDAO();
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
                ReporteDAO reporteDao = new ReporteDAO();
                reporteDao.agregarusuario(prestamo);
                reporteDao.stock(idlibro);
            }
        }
    }

    public static void editar_autor() {
        listar_autor();
        System.out.println("\n\t~~ Editar Autor ~~");
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
        AutorDAO autorDao = new AutorDAO();
        autorDao.editarautor(autor);
    }

    public static void editar_devolucion() {
        System.out.println("\n\t~~ Editar Devolucion ~~");
        String estado;
        System.out.println("Elija el id del prestamo a devolver:");
        int id = Leer.entero();
        System.out.println("ID del libro :");
        int idlibro = Leer.entero();
        System.out.println("Estado: -D-");
        estado = "D";
        Devolucion devolucion = new Devolucion(id, estado);
        DevolucionDAO devolucionDao = new DevolucionDAO();
        devolucionDao.stock(idlibro);
        devolucionDao.editardevolucion(devolucion);

    }

    public static void editar_editorial() {
        listar_editorial();
        System.out.println("\n\t~~ Editar Editorial ~~");
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

    public static void editar_libro() {
        listar_libro();
        System.out.println("\n\t~~ Editar Libro ~~");
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
        listar_autor();
        System.out.println("Idautor:");
        idautor = Leer.entero();
        listar_pais();
        System.out.println("Idpais:");
        idpais = Leer.entero();
        listar_editorial();
        System.out.println("Ideditorial:");
        ideditorial = Leer.entero();
        Libro libro = new Libro(id, titulo, isbn, paginas, año, stock, Stock_disponibles, idautor, idpais, ideditorial);
        LibroDAO libroDao = new LibroDAO();
        libroDao.editarlibro(libro);
    }

    public static void editar_pais() {
        listar_pais();
        System.out.println("\n\t~~ Editar Pais ~~");
        System.out.println("Ingrese el ID del Pais a editar: ");
        int id = Leer.entero();
        String nombre;
        String estado;
        System.out.println("Editar Pais");
        System.out.print("Nombre: ");
        nombre = Leer.cadena();
        while (nombre.length() > 50) {
            System.out.println("Limite de digitos superado(Limite=50), intente de nuevo.");
            System.out.println("Nombre:");
            nombre = Leer.cadena();
        }
        System.out.print("Estado: ");
        estado = Leer.cadena();
        while (estado.length() > 1) {
            System.out.println("Error: No se puede almacenar, muy extenso, volver a intentar");
            System.out.print("Estado: ");
            estado = Leer.cadena();

        }
        Pais pais = new Pais(id, nombre, estado);
        PaisDAO paisDAO = new PaisDAO();
        paisDAO.editarpais(pais);
    }

    public static void editar_usuario() {
        listar_usuario();
        System.out.println("\n\t~~ Editar Usuario ~~");
        System.out.println("Ingrese el id del usuario a editar");
        int id = Leer.entero();
        String nombre;
        String apellidos;
        String dni;
        String estado;
        System.out.println("Nombre:");
        nombre = Leer.cadena();
        System.out.println("Apellidos:");
        apellidos = Leer.cadena();
        System.out.println("Dni:");
        dni = Leer.cadena();
        System.out.println("Estado:");
        estado = Leer.cadena();
        Usuario usuario = new Usuario(id, nombre, apellidos, dni, estado);
        UsuarioDAO usuarioDao = new UsuarioDAO();
        usuarioDao.editarusuario(usuario);
    }

    public static void eliminar_autor() {
        listar_autor();
        System.out.println("\n\t~~ Eliminar Autor ~~");
        System.out.println("Id del campo a eliminar");
        int id = Leer.entero();
        AutorDAO autorDao = new AutorDAO();
        autorDao.eliminarautor(id);
    }

    public static void eliminar_editorial() {
        listar_editorial();
        System.out.println("\n\t~~ Eliminar Editorial ~~");
        System.out.println("Ingrese el ID de la Editorial a Eliminar");
        int id = Leer.entero();
        EditorialDAO epDAO = new EditorialDAO();
        epDAO.eliminareditorial(id);
    }

    public static void eliminar_libro() {
        listar_libro();
        System.out.println("\n\t~~ Eliminar Libro ~~");
        System.out.println("Id del libro a eliminar:");
        int id = Leer.entero();

        LibroDAO libroDao = new LibroDAO();
        libroDao.eliminarlibro(id);
    }

    public static void eliminar_pais() {
        listar_pais();
        System.out.println("\n\t~~ Eliminar Pais ~~");
        System.out.print("Ingrese la ID del Pais a eliminar: ");
        int id = Leer.entero();
        PaisDAO paisDAO = new PaisDAO();
        paisDAO.eliminarpais(id);
    }

    public static void eliminar_usuario() {
        listar_usuario();
        System.out.println("\n\t~~ Eliminar Usuario ~~");
        System.out.print("Ingrese la ID del Usuario a eliminar: ");
        int id = Leer.entero();
        UsuarioDAO usuarioDao = new UsuarioDAO();
        usuarioDao.eliminarusuario(id);
    }

    public static void main(String[] args) {
        Switches();
    }
}
