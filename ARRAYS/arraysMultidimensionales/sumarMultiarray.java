

package ejercicio_tienda;

import java.util.Scanner;

/*
 * Realizar un método que reciba una matriz de enteros y me calcule la suma de un valor introducido por consola.
 * Se supone que todas las filas son del mismo tamaño y que por lo menos tiene dos filas.
 * 
 * 3  4  6 10
 * 2  1  1 12
 * 1  2  4 6
 * 
 * Por ejemplo si se introduce 4, busca todos los 4 de todos los arrays y los suma, también indicar la cantidad
 * de números que hay con ese valor
 * 
 * 
 * 
 */
public class sumarMultiarray {
	static Scanner sc=new Scanner(System.in);
	static int contador=0;
	public static int calcular(int[][]matriz) {
		System.out.println("Introduce un valor");
		int valor=sc.nextInt();
		
		int suma=0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(matriz[i][j]==valor) {
					contador++;
					suma+=matriz[i][j];
				}
			}
		}
		return suma;
	}
	public static void main(String[] args) {
		int [][]matriz= {{3,4,6,10},{2,1,1,12},{1,2,4,6}};
		System.out.println(sumarMultiarray.calcular(matriz));
		System.out.println("Veces repetido: "+contador);
		
	}

}
