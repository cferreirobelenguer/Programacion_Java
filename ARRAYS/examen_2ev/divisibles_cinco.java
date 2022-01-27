

package ejercicios_Arrays;

import java.util.Arrays;

/*
 * 
 *E) Realizar un método que recibe una tabla de enteros y
 * devuelva una nueva tabla donde solo se almacenen  los 
 * números divisibles entre 5.

public static int[] dameDivEntre5(int valores[])

Ejemplos:

dameDivEntre5({10,3,15,25,7}) → {10,15,25}

Copiar la solución:

 */
public class divisibles_cinco {
	
	static int[]nuevo;
	public static int[] dameDivEntre5(int valores[]) {
		int contador = 0;
		//Calculamos la longitud, buscando los divisibles entre 5
		for(int i=0;i<=valores.length-1;i++) {
		
			if(valores[i]%5==0) {
				contador++;
			}
				
		}
		//Se crea el nuevo array con la longitud del contador
		int[]nuevo=new int[contador];
		System.out.println(nuevo.length);
		//Se crea un contador para el nuevo array
		int j=0;
		//Se introducen los divisibles en el nuevo arreglo y 
		//se incrementa el contador del nuevo arreglo para avanzar de posición
		for(int k=0;k<valores.length;k++) {
			if(valores[k]%5==0) {
				
				nuevo[j]=valores[k];
				j++;
				
			}
		}
		
		return nuevo;
	}
	public static void main(String[] args) {
		int[]valores={10,3,15,25,7};
		System.out.println(Arrays.toString(divisibles_cinco.dameDivEntre5(valores)));

	}

}
