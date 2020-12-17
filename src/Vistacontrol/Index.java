
package Vistacontrol;

import utils.Leer;
import Vistacontrol.MenuAutor;
import Vistacontrol.MenuLibro;
import Vistacontrol.MenuEditoriales;

public class Index {
    public static void Salir() {
        System.out.println("Bye bye");
    }
    public static void Error() {
        System.out.println("Error, intenta de nuevo...");
    }
    public static void Menu() {
        System.out.println("\n----------------MENU PRINCIPAL----------------");
        System.out.println("1. Datos Libros");
        System.out.println("2. Datos Autores");
        System.out.println("3. Datos Editoriales");
        System.out.println("4. Datos Pais");
        System.out.println("5. Datos Usuario");
        System.out.println("6. Listar Todo");
        System.out.println("7. Prestamo");
        System.out.println("8. Devolucion");
        System.out.println("9. Salir");
        System.out.print("Escoja opción [1-9]: ");
        
    }
    public static void Inicio() {
        int opcion;
        do {            
            Menu();
            opcion = Leer.entero();
            switch(opcion){
                case 1: 
                    MenuLibro.InicioL();
                    break;
                case 2:
                    MenuAutor.InicioA();
                    break;
                case 3:
                    MenuEditoriales.InicioE();
                    break;
                case 4:
                    MenuPaises.InicioPa();
                    break;
                    case 5:
                    MenuUsuario.usuario();
                    break;
                case 6:
                    MenuLibro.listarlibro();System.out.println("\n");
                    MenuEditoriales.ListarEditoriales();System.out.println("\n");
                    MenuAutor.listar2();System.out.println("\n");
                    MenuPaises.ListarPaises();System.out.println("\n");
                    MenuUsuario.listarusuario();
                    break;
                case 7:
                    MenuPrestamo.InicioPres();
                    break;
                case 8:
                    MenuDevolucion.InicioPres();
                    break;
                case 9:
                    Salir();
                    break; 
                default:
                    Error();
                    break;
            }
        } while (opcion!=9);
    }
    public static void main(String[] args) {
        Inicio();
    }
}
