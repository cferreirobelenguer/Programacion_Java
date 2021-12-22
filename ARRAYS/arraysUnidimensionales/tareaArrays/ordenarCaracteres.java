
package tarea_arrays;

import java.util.Arrays;
import java.util.Scanner;

/* EJERCICIO 17.- Rellenar una tabla con 20 caracteres, 
 * ordenar la tabla y mostrar el resultado.*/
public class ordenarCaracteres {
	static Scanner sc=new Scanner(System.in);
	
	public static void rellenar(String[]caracteres) {
		//Se introducen cadenas de caracteres hasta 20 y se almacenan en array
		int contador=0;
		while(contador!=20) {
				
			for(int i=0;i<caracteres.length;i++) {
					System.out.println("Introduza cadena nº: "+contador);
					caracteres[i]=sc.next();
					contador++;
				}
				
			}
		}
	public static void ordenar(String[]caracteres) {
		//Función para ordenar los caracteres del array
		Arrays.sort(caracteres);
	}
	public static String mostrar(String[]caracteres) {
		//Mostrar resultados
		String mensaje="";
		for(int i=0;i<caracteres.length;i++) {
			mensaje+=caracteres[i]+"\n";
		}
		return mensaje;
	}
	public static void main(String[] args) {
		String[]caracteres=new String[20];
		ordenarCaracteres.rellenar(caracteres);
		ordenarCaracteres.ordenar(caracteres);
		System.out.println("Caracteres ordenados: ");
		System.out.println(ordenarCaracteres.mostrar(caracteres));
		

	}

}
