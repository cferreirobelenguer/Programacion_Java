import java.util.Arrays;
import java.util.Scanner;

public class anularValor {
	static Scanner sc=new Scanner(System.in);
	/*
	 * Hacer un método que reciba como parámetro una tabla de enteros y un número, 
	 * y ponga a cero todos los elementos que tengan el mismo valor que el número pasado 
	 * como parámetro. El método debe devolver la cantidad de elementos que han sido anulados.
	 * static int  anularValor ( int tabla[], int valor)
		Ej-
 		Si tenemos la tabla mitabla → { 10, 5, 5, 6, 7, 5}

		anularValor(mitabla, 5 )  
		Devolvería un 3 y dejaría la tabla con el contenido → { 10,0,0,6,7,0
	 */
	public static void cambiar(int valor,int[]lista) {
		int contador=0;
		for(int i=0;i<lista.length;i++) {
			if(lista[i]==valor) {
				lista[i]=0;
			}
		}
		System.out.println(Arrays.toString(lista));
	}
	public static void main(String[] args) {
		
		int[]lista= {10,5,5,6,7,5};
		int valor=0;
		try {
			System.out.println("Introduzca un valor");
			valor=sc.nextInt();
		}catch(Exception e) {
			System.err.println("Debe introducir un número");
		}
		anularValor.cambiar(valor, lista);
		
	}

}
