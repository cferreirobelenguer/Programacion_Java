

package ficheros;
/*
 * 
 *Crear con un editor el fichero de texto programa.txt con números entre espacios
 *y tabuladores, incluso en líneas distintas, tal como:
 *
 *2   3  45     73
 *123        4  21
 *
 *Implementar un programa que acceda a programas.txt con un objeto Scanner a través
 *de un flujo de entrada, lea los números y calcule su suma y media aritmética,
 *mostrando los resultados por pantalla.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class sumarVariosEspacios {
	static int suma=0;
	static int contador=0;
	static double media=0;
	public static void sumar(FileReader lista) {
		Scanner s=new Scanner(lista);
		//Mientras no se llegue al final se van sumando las ocurrencias de número que se van encontrando
		while(s.hasNext()) {
			int n=s.nextInt();
			contador++;
			suma+=n;
		}
		media=suma/contador;
		//System.out.println(contador);
		System.out.println("Suma: "+suma);
		System.out.println("Media: "+media);
	}
	public static void main(String[] args) throws IOException {
		//También puede ser: FileInputStream lista=new FileInputStream("C:/Users/Carol/Downloads/programa.txt");
		FileReader lista=new FileReader("C:/Users/Carol/Downloads/programa.txt");
		sumarVariosEspacios.sumar(lista);
	}

}
