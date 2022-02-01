

import java.util.Arrays;

public class EjeMetodos {

	public static void main(String[] args) {
	
		int contenedor[] = { 10, 0,3,0,4,5,64,0,4,0,0,0 };
		int valores [] = { 48, 54, 15 };
		
		System.out.println("A) rellenarTabla 2 ");
		System.out.println(rellenarTabla2(contenedor, valores));
		System.out.println(Arrays.toString(contenedor));
		
		
		int tabla [] = { 10,34,3,5 };
		System.out.println(" B) añadir");
		añadir(tabla, 77);
		System.out.println(Arrays.toString(tabla));
		
		int matriz [][] = { { 10,20,32},{12,500,23},{2,34,5,10,53,5},{23,12} };
		
		System.out.println(" C) coordmax");
		int coord [] = coordmax(matriz);
		System.out.println("Posición max = "+Arrays.toString(coord));
		
		System.out.println(" D) enComun");
		int ta[] = {10,2,5,3,6};
		int tb[] = {3,5,10,7,14};
		System.out.println("Nº elementos en común :"+ enComun(ta, tb));
		
		System.out.println(" E) dameDivEntre5 ");
	    int tini[] = {10,3,15,25,7};
	    int solod5 [] = dameDivEntre5(tini);
	    System.out.println(Arrays.toString(solod5));
		
		
	}

	/**
	 * Completa la tabla contendor con la tabla de valores, colocando los valores en
	 * las posiciones con que contienen el valor 0.
	 * 
	 * @param contendor
	 * @param valores
	 * @return true si ha podido colocar todos o false en caso contrario.
	 */
	public static boolean rellenarTabla(int contendor[], int valores[]) {

		boolean situado = true;

		for (int i = 0; i < valores.length; i++) {
			situado = false;
			for (int j = 0; j < contendor.length; j++) {
				if (contendor[j] == 0) {
					contendor[j] = valores[i];
					situado = true;
					break;
				}
			}
			if (situado == false)
				break;
		}

		return situado;

	}

	public static boolean rellenarTabla2(int contendor[], int valores[]) {

		
        int colocados = 0;
		for (int i = 0; i < contendor.length; i++) {
				if (contendor[i] == 0) {
					contendor[i] = valores[colocados];
					colocados++;
				}
			if (colocados == valores.length) break;
			}
		return (colocados == valores.length);

	}
	
	/**
	 * Añade el valor al principio de la tabla, desplazando el resto. El último
	 * valor se pierde
	 * 
	 * @param tabla  { 10,34,3,5 };
	 * @param valor
	 */
	public static void añadir(int tabla[], int valor) {

		for (int i = tabla.length-2; i >=0; i--) {
			tabla[i + 1] = tabla[i];
		}
		tabla[0] = valor;
	}

	/**
	 * Obtiene la posición i,j donde se encuentra el valor máximo
	 * 
	 * @param matriz
	 * @return un array de dos posiciones la 1º indica la fila la 2º posición la
	 *         columna
	 */

	public static int[] coordmax(int matriz[][]) {
		int posmaxi = 0;
		int posmaxj = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > matriz[posmaxi][posmaxj]) {
					posmaxi = i;
					posmaxj = j;
				}
			}
		}
		int resu[] = { posmaxi, posmaxj };
		return resu;
	}

	/**
	 * Devuelve cuantos elementos tiene en comun
	 * 
	 * @param ta
	 * @param tb
	 * @return
	 */
	public static int enComun (int ta[], int tb[]) {
		int resu = 0;
		for (int i = 0; i < ta.length; i++) {
			for (int j = 0; j < tb.length; j++) {
				if (ta[i] == tb[j]) {
					resu++;
					break;
				}
			}
		}
		return resu;
	}
 /**
  * Obtiene los divisiores de 5 de la tabla valores, devolviendo una tabla resultado con divisiores
  * @param valores
  * @return
  */
	public static int[] dameDivEntre5(int valores[]) {
		int cont = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] % 5 == 0) {
				cont++;
			}
		}
		int resu[] = new int[cont];

		int k = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] % 5 == 0) {
				resu[k] = valores[i];
				k++;
			}
		}
		return resu;
	}

}
