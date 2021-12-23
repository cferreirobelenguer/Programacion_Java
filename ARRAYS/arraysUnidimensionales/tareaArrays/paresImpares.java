package tarea_arrays;
/*EJERCICIO 1:Rellenar array de longitud 10 y mostrar su suma*/
import java.util.Scanner;

public class paresImpares{
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
	public static void mostrarPares(int[]numeros) {
		//Mostramos números pares
		System.out.println("Números pares: ");
		for(int i=0;i<=numeros.length-1;i++) {
			if(numeros[i]%2==0) {
				System.out.println(numeros[i]);
			}
		}
		
	}
	public static void mostrarImpares(int[]numeros) {
		//Mostramos números impares
		System.out.println("Números impares: ");
		for(int i=0;i<=numeros.length-1;i++) {
			if(!(numeros[i]%2==0)) {
				System.out.println(numeros[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[]numeros=new int[10];
		paresImpares.anadir(numeros);
		paresImpares.mostrarPares(numeros);
		paresImpares.mostrarImpares(numeros);
	}

}
