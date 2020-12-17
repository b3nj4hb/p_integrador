/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Alvaro Alva Chipana
 */
import java.util.Scanner;

/**
 *
 * @author Alvaro Alva Chipana
 */
public class Leer {
    	private static Scanner teclado=new Scanner(System.in);
		public static String cadena() {
			return teclado.nextLine();
		}
		public static int entero() {
			return Integer.valueOf(cadena());
		}
		public static double decimal() {
			return Double.valueOf(cadena());
		}
		public static char letra() {
			return cadena().charAt(0);
}
}