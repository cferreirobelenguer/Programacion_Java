package ejerciciosstring;

import java.util.Scanner;

/*El método que elimina el carácter letra de la cadena Palabra.
 * Dejando los caracteres sobrantes a espacios.
 * Ej.- Palabra="Hola Don José", letra='o' ->"Hla Dn Jsé" */
public class QuitarLetra {
	static Scanner sc=new Scanner(System.in);
	public static void quitar(String palabra,char caracter) {
		String caracter_=String.valueOf(caracter);
		palabra=palabra.replace(caracter_,"");
		System.out.println(palabra);
	}
	public static void main(String[] args) {
		System.out.println("Introduce palabra");
		String palabra=sc.nextLine();
		System.out.println("Introduce caracter a eliminar");
		char caracter=sc.next().charAt(0);
		QuitarLetra.quitar(palabra, caracter);

	}

}
