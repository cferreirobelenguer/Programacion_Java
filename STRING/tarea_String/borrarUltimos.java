package ejerciciosstring;

import java.util.InputMismatchException;
import java.util.Scanner;

/*El procedimiento sustituye los num últimos caracteres 
 * de una palabra por espacios en blanco
 * Ej.- Palabra="Monja", num=2  ;
 * Resultado= "Mon" */
public class borrarUltimos {
	static Scanner sc=new Scanner(System.in);
	public static void borrar(String palabra, int num) {
		StringBuilder borrado=new StringBuilder(palabra);
		if((num<0)||(num>palabra.length())) {
			System.out.println("No se puede borrar");
		}else {
			borrado.delete(num, palabra.length());
			palabra=borrado.toString();
			System.out.println(palabra);
		}
		
	}
	public static void main(String[] args) {
		int num = 0;
		System.out.println("Introduce una palabra");
		String palabra=sc.nextLine();
		try {
		System.out.println("Introduce un número de caracteres a borrar desde el final del string");
		num=sc.nextInt();
		}catch(InputMismatchException excepcion) {
			System.out.println("Error, debe introducir dígito");
		}
		borrarUltimos.borrar(palabra, num);
		
	}

}
