package ejercicios_arrayList;
/*Escribe un programa que ordene 10 números enteros
 * introducidos por teclado y almacenados en un objeto 
 * de la clase ArrayList */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ordenarNumeros {
	static Scanner sc=new Scanner(System.in);
	static int tamano=10;
	public static void rellenar(ArrayList lista) {
		//Se rellena con 10 números introducidos por teclado
		int contador=0;
		System.out.println("Introduzca números: ");
		do {
			lista.add(sc.nextInt());
			contador++;
		}while(contador!=10);
		System.out.println("Números introducidos: "+lista);
	}
	public static void ordenar(ArrayList lista) {
		//Ordenamos ArrayList
		Collections.sort(lista);
		System.out.println("Resultado de ordenar lista: ");
		Iterator<Integer> iterator=lista.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> lista=new ArrayList<>();
		ordenarNumeros.rellenar(lista);
		ordenarNumeros.ordenar(lista);
	}

}
