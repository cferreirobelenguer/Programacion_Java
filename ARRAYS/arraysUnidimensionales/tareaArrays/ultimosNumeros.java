package tarea_arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

/* EJERCICIO 8.	Almacenar en una tabla  de 5 elementos  los últimos 
 * 5 números leídos de una secuencia indeterminada de números, 
 * donde el número cero marca el fin de la secuencia.
Ej,- 31, 4, 5, 60, 4, 4, 6, 4, 54, 6, 3, 34, 24, 2, 14 ,7 ,18, 0 → 
Deberá mostrar 24, 2, 14,7, 18
*/
public class ultimosNumeros {
	static Scanner sc=new Scanner (System.in);
	public static void cogerDatos(int[]numeros) {
		// Se rellena un array con todos los números hasta 0
		int numero = 0;
		
			do {
			for(int i=0;i<numeros.length;i++) {
				numero=sc.nextInt();
				if(numero==0) {
					break;
				}else {
					numeros[i]=numero;
					}
				}
			}while(numero!=0);
		
		
	}
	public static void ultimos(int[]numeros,int[]ultimos) {
		int i=0;
		//Se rellena un nuevo array con sólo los últimos 5 números almacenados
		for(int j=numeros.length-5;j<numeros.length;j++) {
			ultimos[i]=numeros[j];
			i++;
			
		}
	}
	public static void recorrer(int[]ultimos) {
		//Se leen los resultados
		System.out.println("Los 5 últimos números son: ");
		for(int i=0;i<ultimos.length;i++) {
			System.out.println(ultimos[i]);
		}
	}

	public static void main(String[] args) {
		int[]numeros=new int[10];
		int[]ultimos=new int[5];
		
		ultimosNumeros.cogerDatos(numeros);
		ultimosNumeros.ultimos(numeros, ultimos);
		ultimosNumeros.recorrer(ultimos);
	}

}
