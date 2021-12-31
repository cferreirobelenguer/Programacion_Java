
package examen2017_;
import java.util.*;
/*2.- Leer un número entero y mostrar cada una de su cifras en distintas líneas. Pista: Dividir entre 10
El usuario introduce: 2305  
Ej.-
El programa mostrará
5
0
3
2
 */
public class leerCifras {
	//VERSIÓN ARRAYS
	static Scanner sc=new Scanner(System.in);
	public static void anadir(String numero,String[]numeros) {
		for(int i=0;i<numero.length();i++) {
			numeros[i]=String.valueOf(numero.charAt(i));
			//System.out.println(numeros[i]);
		}
	}
	public static void leerInversa(String[]numeros) {
		//Se recorre el array a la inversa
		System.out.println("Cifras de número a la inversa: ");
		for(int i=numeros.length-1;i>=0;i--) {
			System.out.println(numeros[i]);
		}
	}
	public static void main(String[] args) {
		System.out.println("Introduzca un número");
		String numero=sc.next();
		String[]numeros=new String[numero.length()];
		leerCifras.anadir(numero, numeros);
		leerCifras.leerInversa(numeros);
	}

}
