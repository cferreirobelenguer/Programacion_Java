package ejerciciosstring;
/* Me devuelve el número de vocales que tiene la cadena
 * pasada como parámetro*/

import java.util.Scanner;

public class cuentaVocaless {
static Scanner sc=new Scanner (System.in);
	static String vocales="aeiou";
	public static void contarVocales(String palabra) {
		int contador=0;
		//Recorremos el string con charAt
	for(int i=0;i<palabra.length();i++) {
		char caracter=palabra.charAt(i);
		//Se pasa el charAt a String para ver si vocales contiene el caracter
		if(vocales.contains(String.valueOf(caracter))) {
			contador++;
			}
		}
	System.out.println("La frase es "+palabra+", y el número de vocales que tiene es "+contador);
	}
	
	public static void main(String[] args) {
		String palabra="Me llamo Carolina";
		cuentaVocaless.contarVocales(palabra);
	}

}
