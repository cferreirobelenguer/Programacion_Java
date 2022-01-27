


package ejercicios_Arrays;
import java.util.*;
/*
 * A)  Realizar un método que recibe dos tablas ( contenedor y valores) y que tiene que almacenar en la tabla contenedor los números de la tabla de valores, colocando los números en las posiciones libres, que son aquellas que tienen un valor igual a 0. Devuelve true si ha podido colocar todo o false en caso contrario.

public static boolean rellenarTabla ( int contenedor[], int valores[])

Ejemplos
contenedor → { 10, 0,3,0,4,5,64,0,4,0 }
valores → { 48, 54, 15 }
El método devolvería true y la tabla contenedor quedaría { 10,48,3,54,4,5,64,15,4,0 }

contenedor → { 10, 0,3 }
valores → { 48, 54 }
El método devolvería false y la tabla contenedor quedaría { 10,48,3 }

 */

public class sustituirCeros {
	static Scanner sc=new Scanner (System.in);
	static int[]nuevo;
	static boolean esta=false;
	public static boolean rellenarTabla ( int contenedor[],int[]valores) {
		
		nuevo=new int[contenedor.length];
		int j=0;
		int contador=0;
		
		for(int k=0;k<=contenedor.length-1;k++) {
			if(contenedor[k]==0) {
				//Si el contador llega al length-1 se rompe el bucle
				if(j>=3) {
					break;
					
				}else {
					//Se cogen los valores de valores[] si contenedor tiene 0
					nuevo[k]=valores[j];
					contador++;
				j++;
				}
			}else {
				nuevo[k]=contenedor[k];
			}
		}
		//Contador hace un recuento de las veces que se recorre valores cuando se rellena
		//Si contador es mayor que es el booleano es true, se completa todo el arreglo valores, sino no
		if(contador>=3) {
			esta=true;
		}else {
			esta=false;
		}
		return esta;
	}
	
	//Se introducen los divisibles en el nuevo arreglo y 
	//se incrementa el contador del nuevo arreglo para avanzar de posición
	
	
	public static void main(String[] args) {
		int[]contenedor= { 10,0 };
		int []valores={ 48, 54, 15};
		boolean resultado=false;
		resultado=sustituirCeros.rellenarTabla(contenedor,valores);
		//Muestra mensaje de si se ha completado el arreglo valores o no
		if(esta==true) {
			System.out.println("Se ha completado todo el arreglo valores");
		}else{
			System.out.println("No se ha completado todo el arreglo valores");
		};
		
		System.out.println(Arrays.toString(nuevo));
	}

}
