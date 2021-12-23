
package tarea_arrays;
/*EJERCICIO 2:Rellenar array de longitud 10 y mostrar inverso*/
import java.util.Scanner;

public class inverso {
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
	public static void mostrarInverso(int[]numeros) {
		//Recorremos array a la inversa
		System.out.println("Los números a la inversa son:\n");
		for(int i=numeros.length-1;i>=0;i--) {
			System.out.println(numeros[i]);
		}
	}
	public static void main(String[] args) {
		int[]numeros=new int[10];
		inverso.anadir(numeros);
		inverso.mostrarInverso(numeros);
	}

}
