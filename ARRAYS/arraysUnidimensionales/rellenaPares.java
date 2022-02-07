package ejercicios_Arrays;
import java.util.Arrays;
/* 
 * Escribir la función int[]rellenarPares(int longitud,int fin), que crea y devuelve
 * una tabla ordenada de la longitud especificada que se encuentra rellena con números
 * pares aleatorios comprendidos en el rango desde 2 hasta fin (inclusive).
 * Al final tiene que quedar una tabla de la longitud indicada rellena toda con números
 * aleatorios comprendidos entre 2 y variable fin y que sean pares. Ordenar el arreglo
 * 
 */
import java.util.Scanner;

public class rellenaPares {
static Scanner sc=new Scanner(System.in);
	
	public static void rellenarPares(int[]lista,int fin) {
		int j=0;
		do {
			//Números comprendidos entre 2 y fin
			int num=(int)Math.floor(Math.random()*(fin-2)+2);
			if(num%2==0) {
				lista[j]=num;
				j++;
			}
			
		}while(j<lista.length);
		Arrays.sort(lista);
			
		for(int i:lista) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		System.out.println("Introduce longitud de arreglo");
		int longitud=0;
		int fin=0;
		//Excepción para que los dígitos que se introducen sean numéricos
		try {
			longitud=sc.nextInt();
			System.out.println("Introduce un final de la secuencia del arreglo");
			fin=sc.nextInt();
		}catch(Exception e) {
			System.err.println("Debe introducir un dígito numérico");
		}
		int[]lista=new int[longitud];
		rellenaPares.rellenarPares(lista, fin);

	}

}
