
package tarea_arrays;
/*EJERCICIO 1:Rellenar array de longitud 10 y mostrar su suma*/
import java.util.Scanner;

public class sumarArray {
	static Scanner sc=new Scanner(System.in);
	//Anadimos datos al array
	public static void anadir(int[]numeros) {
		int contador=0;
		do {
			for(int i=0;i<numeros.length;i++) {
				numeros[i]=sc.nextInt();
				contador++;
			}
		}while(contador!=10);
	}
	public static int calcularSuma(int[]numeros) {
		//Calculamos la suma
		int suma=0;
		for(int i=0;i<=numeros.length-1;i++) {
			suma+=numeros[i];
		}
		return suma;
	}
	public static void main(String[] args) {
		int[]numeros=new int[10];
		sumarArray.anadir(numeros);
		System.out.println("Suma: ");
		System.out.println(sumarArray.calcularSuma(numeros));
	}

}
