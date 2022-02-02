package examen_2019;

import java.util.Scanner;

public class quitarEspaciosRepes {
/*
 * Realizar un método que reciba como parámetro un String y me devuelva un nuevo String con 
 * donde se hayan eliminado los espacios sobrantes: cuando hay dos o más caracteres consecutivos
 * solo tiene que dejar uno.
 * 
 * Public static String quitarEspaciosRepetidos(String cadena){
 * 
 * Ejemplo;
 * 
 * quitarEspaciosRepetidos("  Hola  Manolo García  .")-> "Hola Manolo García";
 */

		public static  String quitarEspaciosRepetidos( String cadena){
			//Se crea un StringBuilder para poder usar la función append
	        StringBuilder sb = new StringBuilder();
	        //Se recorre la cadena
	        for (int i=0; i < cadena.length(); i++){
	            char letra = cadena.charAt(i);
	            //Si el caracter leido es distinto de espacio en blanco se añade al StringBuilder vacío
	            if ( letra != ' '){
	                sb.append(letra);
	            }
	            // Si el anterior es un espacio no lo pongo
	            else {
	            	//En caso de que sea espacio en blanco, si el anterior era espacio se salta porque ya estaría añadido
	            	if ( i>0 && cadena.charAt(i-1) == ' ') {
	                    // me lo salto
	                } else {
	                	//En caso contrario se añade
	                    sb.append(letra);
	                }
	            }
	        }
	        //Se retorna el StringBuilder a String
	        return sb.toString();
	    }
		public static void main (String[]args) {
		String cadena="  hola  manolo garcia";
		System.out.println(quitarEspaciosRepes.quitarEspaciosRepetidos(cadena));
		}
	}
