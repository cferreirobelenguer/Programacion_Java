/*
*Rellenar un arreglo con números aleatorios entre 100 y 1000 hasta llegar a 30 posiciones,
introducir un valor e indicar si está o no en el arreglo y su posición*/

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Eje02 {

	public static void main(String[] args) {
		
		// Defino la tabla
		int tabla [] = new int [30];
		
		// Rellenar la tabla
		rellenar(tabla);
		
		// Ordenar
		Arrays.sort(tabla);
		
		System.out.println(Arrays.toString(tabla));
		
		Scanner sc = new Scanner(System.in);
		int valor;
		System.out.print("Introduce un valor: "); valor = sc.nextInt();
		
		
		int pos = Arrays.binarySearch(tabla, valor);
		if ( pos >= 0) {
			System.out.println(" El elemento se encuentra en la posición "+ pos);
		} else {
			System.out.println( " No se encuentra el valor en la tabla ");
		}
		
	}
	
	public static void rellenar ( int tabla[]) {
		
		Random rd = new Random();
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = rd.nextInt(900) +101; // Entre 100 y 1000 (inclusive)			
		}
		
	}

}
