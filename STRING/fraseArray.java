package ejercicios_Arrays;

import java.util.Scanner;

public class fraseArray {
/* Pide una frase por consola, pasa el primer caracter de cara palabra en mayúscula
 * y almacena la frase en un array y sustituir los espacios por *, después muestra 
 * el resultado*/
 static Scanner sc=new Scanner(System.in);
 	static String palabra;
 	static char[]fraseArreglo;
 	public static void modificarFrase() {
 		//Se modifica la frase tal y como queremos agregarla en el arreglo
 		fraseArray.mayus();
 		fraseArray.spacios();
	}
 	public static void mayus() {
 		//Primero se ponen todas las primeras palabras en mayúscula
 		palabra=palabra.replace(String.valueOf(palabra.charAt(0)),String.valueOf(palabra.charAt(0)).toUpperCase());
		
 		for(int i=0;i<palabra.length();i++) {
			char caracter=palabra.charAt(i);
			if(caracter==' ') {
				
				palabra=palabra.replace(String.valueOf(palabra.charAt(i+1)),String.valueOf(palabra.charAt(i+1)).toUpperCase());
			}
		}
 	}
 	public static void spacios() {
 		//Segundo se sustituyen los espacios en blanco por asteriscos
		for(int j=0;j<palabra.length();j++) {
			char caracter=palabra.charAt(j);
			if(caracter==' ') {
				palabra=palabra.replace(String.valueOf(palabra.charAt(j)),"*");
				
			}
		}
 	}
 	public static void anadir() {
 		//Se convierte el String en array de caracteres
 		fraseArreglo=palabra.toCharArray();
 	}
 	public static void recorrer() {
 		//Se recorre el array de caracteres
 		for(int i=0;i<fraseArreglo.length;i++) {
 			System.out.print(fraseArreglo[i]);
 		}
 		System.out.println();
 	}
 	
	public static void main(String[] args) {
		
		System.out.println("Introduce una frase o palabra para modificar");
		palabra=sc.nextLine();
		char[]fraseArreglo=new char[palabra.length()];
		fraseArray.modificarFrase();
		System.out.println(palabra);
		fraseArray.anadir();
		fraseArray.recorrer();
		
	}

}
