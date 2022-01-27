package ejercicios_Arrays;
/*
 * 1º Realizar un programa que realice las siguientes operaciones:
 a) Guarda en un array 30 números enteros que se generan de forma aleatoria con valores comprendidos entre 100 y 1000.
b)  Ordena el array
c) Solicita un valor al usuario e indica si el número se encuentra o no en la tabla.

 */
import java.util.*;
public class ordenarArreglo {
	static Scanner sc= new Scanner(System.in);
	public static void numerosAleatorios(int[]lista) {
		int contador=0;
		//Se van introduciendo los 30 números aleatorios en el arreglo
		do {
			//Números random entre 1000 y 100
			for(int i=0;i<lista.length;i++) {
				lista[i]=(int) Math.floor(Math.random()*(1000-100)+100);
			}
			contador++;
		}while(contador!=30);
	}
	public static void ordenar(int[]lista) {
		//Se ordena el arreglo y se muestra
		Arrays.sort(lista);
		System.out.println("Lista ordenada: ");
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
	}
	public static void buscar(int[]lista) {
		boolean encontrado=false;
		int posicion=0;
		//Se introduce un número y se busca en la tabla
		System.out.println("Introduce un número para buscar en tabla");
		int num=sc.nextInt();
		for(int i=0;i<lista.length;i++) {
			if(lista[i]==num) {
				//Booleano true que indica que el número está y se almacena la posición en una variable
				encontrado=true;
				posicion=i;
				break;
			}
		}
		if(encontrado==true) {
			System.out.println("Se ha encontrado el número solicitado : "+num+ " en la posición de la tabla "+posicion);
		}else {
			System.out.println("No se ha encontrado el número solicitado");
		}
	}
	public static void main(String[] args) {
		//Arreglo de longitud 30
		int[]lista=new int [30];
		System.out.println("______________");
		ejercicioArrays1.numerosAleatorios(lista);
		System.out.println("______________");
		ejercicioArrays1.ordenar(lista);
		System.out.println("______________");
		ejercicioArrays1.buscar(lista);

	}

}
