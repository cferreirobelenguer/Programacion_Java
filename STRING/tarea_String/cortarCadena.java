package ejerciciosstring;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Función que genera una cadena a partir de la cadena
 * de origen, suprimiendo los caracteres que se encuentren entre la posición
 * posini y la posición posfin
 */
public class cortarCadena {
	static Scanner sc=new Scanner(System.in);
	static int posini;
	static int posfin;
	public static void cortar(String palabra) {
		String palabraNueva="";
		//Excepción en caso de que no se introduzca un caracter numérico
		//La aplicación sólo permite introducir números, en caso contrario sale la excepción
		try {
		System.out.println("Introduce una posición para inicio de corte");
		posini=sc.nextInt();
		System.out.println("Introduce una posición para fin de corte");
		posfin=sc.nextInt();
		}catch(InputMismatchException excepcion)
			{ System.out.println("Debe introducir un caracter numérico");
		}
	
		//Si la posición introducida es -1 o es mayor que la longitud de la palabra no se hace el corte
		if(((posini<-1)||(posfin<-1))||(posini>palabra.length())||(posfin>palabra.length())) {
			System.out.println("No se puede hacer el corte");
		}else {
			//En caso contrario se usa substring con ambos valores
			palabraNueva=palabra.substring(posini,posfin);
			
			System.out.println("Palabra cortada: "+palabraNueva);
		}
	}
	public static void main(String[] args) {
		String palabra="El examen no parece dificil";
		cortarCadena.cortar(palabra);
	}

}
