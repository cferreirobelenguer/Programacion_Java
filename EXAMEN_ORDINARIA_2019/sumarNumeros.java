
package examen_2019;
/*
 * Realizar un método que reciba como parámetro un array de enteros
 * y me devuelva otro array de la mitad del tamaño donde cada elemento almacene la suma de dos elementos
 * consecutivos del array inicial. Se supone que el tamaño del array inicial va a ser par.
 * static public int[] sumarCadaDos(int tinicial[]){
 * }
 * 
 * sumaCadaDos({2,3,1,1,5,5})->Devolverá el array {5,2,10}
 */
import java.util.Arrays;

public class sumarNumeros {
	
	public static void sumar(int[]lista,int[]lista2) {
		int j=0;
		int suma=0;
		//Se salta una posición al recorrer
		for(int i=0;i<lista.length;i+=2) {
			//Si el contador de la lista nueva iguala o supera su longitud se rompe el bucle
			if(j>=lista2.length) {
				break;
			}
			//Se realiza la suma y se añade al arreglo
			suma=lista[i]+lista[i+1];
			lista2[j]=suma;
			//Se incrementa el contador del nuevo arreglo
			j++;
		}
		System.out.println(Arrays.toString(lista2));
	}
	public static void main(String[] args) {
		int[] lista= {1,3,1,1,5,5};
		//Arreglo nuevo con la mitad del tamaño del anterior según indica el enunciado
		int[]lista2=new int[lista.length/2];
		
		sumarNumeros.sumar(lista,lista2);
	}

}
