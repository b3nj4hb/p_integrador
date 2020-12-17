package Vistacontrol;

import java.util.List;
import Modelo.Pais;
import ModeloDao.PaisDAO;
import utils.Leer;
import static Vistacontrol.Index.Error;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class MenuPaises {
     public static String darformato(String cadena){
        if (cadena.length()==1) {
            return cadena+"                      ";
        }else
          if (cadena.length()==2) {
            return cadena+"                     ";
        }else
                  if (cadena.length()==3) {
            return cadena+"                    ";
        }else
              if (cadena.length()==4) {
            return cadena+"                   ";
        }else
                      if (cadena.length()==5) {
            return cadena+"                  ";
        }else
             if (cadena.length()==6) {
            return cadena+"                 ";
        }else
                     if (cadena.length()==7) {
            return cadena+"                ";
        }else
                   if (cadena.length()==8) {
            return cadena+"               ";
        }else
             if (cadena.length()==9) {
            return cadena+"              ";
        }else
                if (cadena.length()==10) {
            return cadena+"             ";
        }else  
          if (cadena.length()==11) {
            return cadena+"            ";
        }else  
               if (cadena.length()==12) {
            return cadena+"           ";
        }else  
             if (cadena.length()==13) {
            return cadena+"          ";
        }else  
              if (cadena.length()==14) {
            return cadena+"         ";
        }else   
                  if (cadena.length()==15) {
            return cadena+"        ";
        }else      
                      if (cadena.length()==16) {
            return cadena+"       ";
        }else      
                   if (cadena.length()==17) {
            return cadena+"      ";
        }else     
             if (cadena.length()==18) {
            return cadena+"     ";
        }else      
                   if (cadena.length()==19) {
            return cadena+"    ";
        }else     
                       if (cadena.length()==20) {
            return cadena+"   ";
        }else      
          if (cadena.length()==21) {
            return cadena+"  ";
        }else   
              if (cadena.length()==22) {
            return cadena+" ";
        }else      
                 if (cadena.length()==23) {
            return cadena+"";
        }else        
         if (cadena.length()>23) {
              return cadena.substring(0,21)+"..";
        }else
         return cadena;
            
        }
     public static void exportarpaises() {
	System.out.println("\n--------Archivo creado con éxito, volviendo al menú secundario.--------");       
	PrintWriter salida = null;
		
                    try {
                                    salida = new PrintWriter("C:/Users/Alvaro Alva Chipana/Documents/F/ListaPaises.txt");
                                    PaisDAO paisDAO = new PaisDAO();
                                    List<Pais> paises = paisDAO.listarpaises();
                                    salida.println("--------Listado de Paises--------");
                                    salida.println("ID\tNombre\t\t\tEstado");
                                    for (Pais pais : paises) {
                                                            salida.println(
                                                            pais.getIdpais()+ "\t" + 
                                                            darformato(pais.getNombre())+ "\t" +
                                                            pais.getEstado());
                                    
                                                            }

                                    salida.flush();
                                    } catch (FileNotFoundException e) {
                                    System.out.println(e.getMessage());                                                                   
                                    } finally {         
                                    salida.close();
                                    }
                            }
        public static void ListarPaises() {
        PaisDAO paisDAO = new PaisDAO();
        List<Pais> paises = paisDAO.listarpaises();
        System.out.println("--------Listado de Paises--------");
        System.out.println("ID\tNombre\t\t\tEstado");
        for (Pais pais : paises) {
            System.out.println(
                                    pais.getIdpais()+ "\t" + 
                                    darformato(pais.getNombre())+ "\t" +
                                    pais.getEstado());
                                    
        }
    }    
        public static void AgregarPaises(){
        String nombre;
        String estado;
        System.out.println("Agregar Pais");
        System.out.print("Nombre: ");
        nombre = Leer.cadena();
         while (nombre.length() > 50) {
                System.out.println("Limite de digitos superado(Limite=50), intente de nuevo.");
              System.out.println("Nombre:");
                nombre=Leer.cadena();
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
        public static void EditarPaises(){
        ListarPaises();
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
                nombre=Leer.cadena();
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
        public static void EliminarPaises() {
        ListarPaises();
        System.out.print("Ingrese la ID del Pais a eliminar: ");
        int id = Leer.entero();
        PaisDAO paisDAO = new PaisDAO();
        paisDAO.eliminarpais(id);
    }
        public static void SalirMenu() {
        System.out.println("\n--------------Dirigiendo a Menu Principal--------------");
        
        }
        public static void Menu() {
        System.out.println("\n--------------MENU PAIS--------------");
        System.out.println("1. Agregar");
        System.out.println("2. Editar");
        System.out.println("3. Eliminar");
        System.out.println("4. Listar");
        System.out.println("5. Exportar");
        System.out.println("6. Salir al menú principal");
        System.out.print("Escoja opción [1-6]: ");
    }
        public static void InicioPa() {
        int opcion;
        do {            
            Menu();
            opcion = Leer.entero();
            switch(opcion){
                case 1: 
                    AgregarPaises();
                    break;
                case 2:
                    EditarPaises();
                    break;
                case 3:
                    EliminarPaises();
                    break;
                case 4:
                    ListarPaises();
                    break;
                case 5:
                    exportarpaises();
                    break;
                case 6:
                    SalirMenu();
                    break;
                default:
                    Error();
                    break;
            }
        } while (opcion!=6);
    }
}
