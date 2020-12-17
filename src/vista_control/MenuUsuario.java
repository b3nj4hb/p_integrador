package vista_control;

import modelos.Usuario;
import modelo_DAO.UsuarioDao;
import java.util.List;
import utils.Leer;
import static vista_control.Index.Error;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MenuUsuario {

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

    public static void exportarusuarios() {
        System.out.println("\n--------Archivo creado con éxito, volviendo al menú secundario.--------");
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("C:/Users/Alvaro Alva Chipana/Documents/F/ListaUsuarios.txt");
            UsuarioDao usuarioDao = new UsuarioDao();
            List<Usuario> usuarios = usuarioDao.listarusuarios();
            salida.println("-----------------------------------Listado de Usuarios--------------------------------");
            salida.println("ID\tNombreCompleto\t\t\t\tDni\t\tEstado");
            for (Usuario usuario : usuarios) {
                salida.println(
                        usuario.getIdusuario() + "\t"
                        + darformatog(usuario.getNombreCompleto()) + "\t" + "\t"
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

    public static void Menuusuarios() {
        System.out.println("\n--------------MENU USUARIOS--------------");
        System.out.println("1. Agregar");
        System.out.println("2. Editar");
        System.out.println("3. Eliminar");
        System.out.println("4. Listar");
        System.out.println("5. Exportar");
        System.out.println("6. Salir al menú principal");
        System.out.print("Escoja opción [1-6]: ");
    }

    public static void usuario() {
        int opcion;
        do {
            Menuusuarios();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregarusuario();
                    break;
                case 2:
                    editarusuario();
                    break;
                case 3:
                    eliminarusuario();
                    break;
                case 4:
                    listarusuario();
                    break;
                case 5:
                    exportarusuarios();
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

    public static void SalirMenu() {
        System.out.println("\n--------------Dirigiendo a Menu Principal--------------");

    }

    public static void listarusuario() {
        UsuarioDao usuarioDao = new UsuarioDao();
        List<Usuario> usuarios = usuarioDao.listarusuarios();
        System.out.println("-----------------------------------Listado de Usuarios--------------------------------");
        System.out.println("ID\tNombreCompleto\t\t\t\tDni\t\tEstado");
        for (Usuario usuario : usuarios) {
            System.out.println(
                    usuario.getIdusuario() + "\t"
                    + darformatog(usuario.getNombreCompleto()) + "\t" + "\t"
                    + usuario.getDni() + "\t"
                    + usuario.getEstado()
            );
        }
    }

    public static void agregarusuario() {
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
        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.agregarusuario(usuario);
    }

    public static void editarusuario() {
        listarusuario();
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
        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.editarusuario(usuario);
    }

    public static void eliminarusuario() {
        listarusuario();
        System.out.print("Ingrese la ID del Usuario a eliminar: ");
        int id = Leer.entero();
        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.eliminarusuario(id);
    }
}
