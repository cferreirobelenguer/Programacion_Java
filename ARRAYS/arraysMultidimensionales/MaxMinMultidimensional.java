

package ejercicios_Arrays;

import java.util.Arrays;

/*
 * C) Realizar un método que reciba como una Matriz y
 *  me devuelva un array de dos posiciones con las coordenadas 
 *  donde está el valor máximo (fila y columna). 
 *  La Matriz puede tener filas de distinto tamaño.
public static int []  coordMax ( int matriz[][]) {
Ejemplo:
matriz → { { 10,20,32},{12,500,23} {2,34,5,10,53,5} {23,12} };
coordMax(matriz) → { 1, 1}  // Segunda fila, segundo elemento i,j de 500
 */
public class MaxMinMultidimensional {
	static int[]lista2;
	public static void calcularMaxMin(int[][]lista) {
		int max=0;
		int fila=0;
		int columna=0;
		
		//Tabla que va a contener las posiciones de las filas y las columnas
		lista2=new int[2];
		//filas
		for(int i=0;i<=lista.length-1;i++) {
			//Columnas
				for(int j=0;j<lista[i].length;j++) {
				if(lista[i][j]>max) {
					//Se almacena el valor máximo
					max=lista[i][j];
					fila=i;
					columna=j;
					}
				//Debug del recorrido
				//System.out.println("Fila"+i);
				//System.out.println("Columna"+j);
				}
			}
		
		//Se añaden las filas y columnas al arreglo nuevo
		lista2[0]=fila;
		lista2[1]=columna;
		System.out.println("Máximo: "+max);
	}
	public static void main(String[] args) {
		int[][]lista={ 
						{10,20,32},
						{12,777,23}, 
						{2,34,5,10,53,5}, 
						{23,12,4,6,888,8} };
		
		MaxMinMultidimensional.calcularMaxMin(lista);
		System.out.println(Arrays.toString(lista2));
	}

}
