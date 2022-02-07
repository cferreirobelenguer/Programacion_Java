

package examen_2ev;

import java.util.Scanner;

/*
 * A) static String cambiarVocalesPorNumeros ( String mensaje )
Cambia todas las vocales por el carácter dígito correspondiente ( ‘a’ → 1, ‘e’ → 2, ‘i’ → ‘3’….). Suponer 
que solo existen vocales en minúscula y si acento.
Ej.- cambiarVocalesPorNumeros(“Hola pepe luis”) Devuelve “H4l1 p2p2 l53s”
 */
public class cambiarVocalesPorNumeros {
	 static Scanner sc=new Scanner(System.in);
	public static void cambiar(String mensaje) {
		for(int i=0;i<mensaje.length();i++) {
			char letra=mensaje.charAt(i);
			if(letra=='a') {
				String palabra=String.valueOf(letra);
				mensaje=mensaje.replaceAll(palabra, "1");
			}
			if(letra=='e') {
				String palabra=String.valueOf(letra);
				mensaje=mensaje.replaceAll(palabra, "2");
			}
			if(letra=='i') {
				String palabra=String.valueOf(letra);
				mensaje=mensaje.replaceAll(palabra, "3");
			}
			if(letra=='o') {
				String palabra=String.valueOf(letra);
				mensaje=mensaje.replaceAll(palabra, "4");
			}
			if(letra=='u') {
				String palabra=String.valueOf(letra);
				mensaje=mensaje.replaceAll(palabra, "5");
			}

		}
		
		System.out.println(mensaje);
	}
	public static void main(String[] args) {
		System.out.println("Introduce mensaje");
		String mensaje=sc.nextLine();
		cambiarVocalesPorNumeros.cambiar(mensaje);

	}

}
