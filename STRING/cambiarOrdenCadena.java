

package ejerciciosString;
/*
 * Implementar el juego del anagrama, que consiste en que un jugador escribe una palabra y la
 * aplicación muestra un anagrama (cambio del orden de los caracteres) generado al azar. A continuación, otro jugador tiene
 * que acertar cuál es el texto original. La aplicación no debe permitie que el texto introducido por el jugador 1 sea la 
 * cadena vacía. Por ejemplo, si el jugador 1 escribe teclado, la aplicación muestra como pista un anagrama al azar, como
 * por ejemplo etcloda.
 */

import java.util.Scanner;

public class cambiarOrdenCadena {
static Scanner sc=new Scanner(System.in);
	static String nueva="";
	public static void cambiarPosiciones(String cadena) {
		//Pasamos la cadena a array de char
		char[] caracteres=cadena.toCharArray();
		do {
		for(int i=0;i<caracteres.length;i++) {
			//Se crean posiciones aleatorias
			int k=(int)(Math.random()*caracteres.length);
			int j=(int)(Math.random()*caracteres.length);
			/*
			 * Se crean posiciones aleatorias
			 * 	System.out.println(k);
				System.out.println(j);
			 */
			
			//Se intercambian las posiciones con un char aux
			
			char aux=caracteres[k];
			caracteres[k]=caracteres[j];
			caracteres[j]=aux;
		}
		nueva=String.valueOf(caracteres);
		System.out.println(nueva);
		//Hacer este proceso mientras la palabra nueva sea igual que cadena, lo que queremos es que sea diferente
		}while(nueva.equals(cadena));
	}
	
	public static void main(String[] args) {
		System.out.println("Introduce cadena");
		String cadena=sc.nextLine();
		cambiarOrdenCadena.cambiarPosiciones(cadena);
		System.out.println("ADIVINA LA PALABRA: "+nueva);
		System.out.println("Introduce palabra");
		String adivina="";
		do {
			adivina=sc.nextLine();
			if(!adivina.equals(cadena)) {
				System.out.println("Lo sentimos, no acertaste :(");
			}
			
		}while(!adivina.equals(cadena));
		if(adivina.equals(cadena)) {
			System.out.println("¡Muy bien!, acertaste la palabra");
		}
	}

}
