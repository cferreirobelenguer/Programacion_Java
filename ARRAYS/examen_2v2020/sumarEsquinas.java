

package ejercicio_tienda;

public class sumarEsquinas {
/*
 * Realizar un método que reciba una matriz de enteros y me calcule la suma de las esquinas.
 * Se supone que todas las filas son del mismo tamaño y que por lo menos tiene dos filas.
 * 
 * 3  4  6 10
 * 2  1  1 12
 * 1  2  4 6
 * 
 * Si matiz tiene el valor de la figura
 * El resultado a devolver sería 3+10+1+6=20
 * 
 * 
 */
	static int suma=0;
	
	public static int sumar(int[][]matriz) {
		suma=matriz[0][0]+matriz[0][matriz.length]+matriz[matriz.length-1][0]+matriz[matriz.length-1][matriz.length];
		return suma;
		
	}
	public static void main(String[] args) {
		
		int[][] matriz= {{3,4,6,10},{2,1,1,12},{1,2,4,6}};
		System.out.println(sumarEsquinas.sumar(matriz));
		
	}

}
