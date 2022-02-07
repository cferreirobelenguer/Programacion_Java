

package ejerciciosString;

import java.util.Scanner;

public class juntarPalabra {
	static Scanner sc=new Scanner(System.in);
	/*
	 * Introducir por teclado una frase palabra a palabra y mostrar la frase completa
	 * separando las palabras introducidas con espacios en blanco. Terminar de leer la
	 * frase cuando alguna de las palabras introducidas sea la cadena fin escrita con cualquier
	 * combinación de mayúsculas y minúsculas. La cadena fin no aparecerá en la frase final.
	 * El primer caracter de la frase tiene que ir en mayúsculas.
	 * 
	 */
	
	public static void introducir() {
		System.out.println("Introduce palabra");
		String frase="";
		String msg="";
		String caracter="";
		do {
			frase=sc.nextLine();
			if((frase.equals("fin"))||(frase.equals("FIN"))){
				break;
			}else {
				msg+=frase+" ";
			}
		}while((!frase.equals("fin")||(!frase.equals("FIN"))));
		caracter=String.valueOf(msg.charAt(0));
		msg=msg.replaceAll(caracter, caracter.toUpperCase());
		System.out.println("Frase: "+msg);
	}
	
	public static void main(String[] args) {
		juntarPalabra.introducir();
	}

}
