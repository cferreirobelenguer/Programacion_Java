package tarea_arrays;

import java.util.Scanner;

/* EJERCICIO 4.	Almacenar en una tabla de 100 elementos números aleatorios 
 * entre 1 y 500. mostrar el máximo, el mínimo y la media. 
 *  Realizar otra versión donde no puedan almacenarse números repetidos.*/
public class maxMin {
	static Scanner sc=new Scanner(System.in);
	public static void rellenar(int[]numeros) {
		//Se añaden los datos no repes
		int contador=0;
		int numero=0;
		boolean repe;
		for(int i=0;i<numeros.length;i++) {
			do{
				repe=false;
				//Números aleatorios del 1 al 500
				numero=(int) (Math.random()*(500-1)+1);
				//Se lee lo que se lleva relleno de arreglo y se compara con el número
				for(int j=0;j<i;j++) {
					if(numero==numeros[j]) {
						repe=true;
					}
				}
				if(repe==true) {
					System.out.println("Numero repe");
				}
			}while(repe==true);
			numeros[i]=numero;
		}
		
	}
	public static void recorrer(int[]numeros) {
		//Se recorre el arreglo
		System.out.println("Total de números:");
		for(int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
	}
	public static void calcular(int[]numeros) {
		//Se calcula máximo,mínimo y media del arreglo
		int max=numeros[0];
		int min=numeros[0];
		int suma=0;
		double media=0;
		int longitud=numeros.length;
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>max) {
				max=numeros[i];
			}
			if(numeros[i]<min) {
				min=numeros[i];
			}
			suma+=numeros[i];
		}
		media=suma/longitud;
		System.out.println("Maximo: "+max);
		System.out.println("Mínimo: "+min);
		System.out.println("Media: "+media);
	}
	public static void main(String[] args) {
		int[]numeros=new int[100];
		maxMin.rellenar(numeros);
		maxMin.recorrer(numeros);
		maxMin.calcular(numeros);
	}

}
