

package ejercicios_Arrays;

import java.util.Scanner;
/*
 * Escribir una aplicación que solicite al usuario cuántos números desea introducir.
 * A continuación, introducir por teclado esa cantidad de números enteros, y por 
 * último mostrar en orden inverso al introducido.
 */
public class numerosInversoTeclado {
static Scanner sc=new Scanner(System.in);
	
	public static void crear(int veces,int[]lista) {
		//Se introducen datos por teclado
		System.out.println("Introduce números para rellenar arreglo");
		for(int i=0;i<lista.length;i++) {
			lista[i]=sc.nextInt();
		}
	}
	//Se recorre a la inversa el arreglo
	public static void recorrer(int []lista) {
		for(int i=lista.length-1;i>=0;i--) {
			System.out.println(lista[i]);
		}
	}
	public static void main(String[] args) {
		//Se crea arreglo con longitud introducida por teclado
		System.out.println("Introduce el número de valores que quiere introducir en el arreglo");
		int veces=sc.nextInt();
		int[]lista=new int[veces];
		numerosInversoTeclado.crear(veces, lista);
		numerosInversoTeclado.recorrer(lista);
	}

}
