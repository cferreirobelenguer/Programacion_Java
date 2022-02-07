

package ejercicio_tienda;

/*
 * Hacer un método que reciba como parámetro una tabla de enteros y un número,
 * y ponga a cero todos los elementos que tengan el mismo valor que el número pasado como
 * parámetro. El método debe devolver la cantidad de elementos que han sido anulados.
 * 
 * static int anularValor(int tabla[],int valor)
 * Ej. Si tenemos la tala mitabla->{10,5,5,6,7,5};
 * anularValor(mitabla,5)
 * Devolvería un 3 y dejaría la tabla con el contenido ->{10,0,0,,7,0}
 */
import java.util.Arrays;
import java.util.Scanner;

public class anularValor {
	static Scanner sc=new Scanner(System.in);
	
	static int anular_Valor(int[]tabla, int valor) {
		int contador=0;
		for(int i=0;i<tabla.length;i++) {
			if(tabla[i]==valor) {
				contador++;
				tabla[i]=0;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		int[] tabla= {10,5,5,6,7,5};
		System.out.println("Introduce un valor");
		int valor=sc.nextInt();
		System.out.println(anularValor.anular_Valor(tabla,valor));
		System.out.println(Arrays.toString(tabla));
	}

}
