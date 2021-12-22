package tarea_arrays;

import java.util.Scanner;

/* EJERCICIO 5.	Leer 20 número, y calcular 
 * el porcentaje de valores que supera el valor de la media*/
public class porcentajeValores {
	static Scanner sc=new Scanner(System.in);
	static double suma=0;
	static double media;
	public static void anadir(int[]numeros) {
		//Función que añade los números a un array
		int contador=0;
		
		do {
			for(int i=0;i<numeros.length;i++) {
				numeros[i]=sc.nextInt();
				contador++;
			}
		}while(contador!=20);
		
	}
	public static double calcularMedia(int[]numeros) {
		//Función que calcula la media total
		for(int j=0;j<numeros.length;j++) {
			suma+=numeros[j];
		}
		media=suma/numeros.length;
		return media;
	}
	
	public static int comparar(int[]numeros) {
		//Función que compara cada número con la media y calcula el porcentaje que supera la media
		int contadorSuperiores=0;
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>media) {
				contadorSuperiores++;
			}
		}
		int porcentaje=(contadorSuperiores*100)/numeros.length;
		return porcentaje;
	}
	public static void main(String[] args) {
		int[] numeros=new int[20];
		porcentajeValores.anadir(numeros);
		System.out.println("La media es "+porcentajeValores.calcularMedia(numeros));
		System.out.println("El porcentaje que supera la media es "+porcentajeValores.comparar(numeros)+"%");
	}

}
