

package ficheros;
/*Leer el archivo de texto programa.txt , contar caracteres y lineas y mostrarlo
 * por pantalla*/
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejemplo1 {
	static Scanner sc=new Scanner(System.in);
	static int contadorChar=0;
	static int contadorLineas=0;
	
	//Lee y cuenta las líneas del archivo
	public static void contarLineas(FileReader fichero) throws IOException {
		BufferedReader bf=null;
		bf=new BufferedReader(new FileReader("C:/Users/Carol/Downloads/programa.txt"));
		String texto=bf.readLine();
		System.out.println(texto);
		while(texto!=null) {
			texto=bf.readLine();
			System.out.println(texto);
			contadorLineas++;
		}
		
	}
	//Lee y cuenta los caracteres del archivo
	public static void contarChar(FileReader fichero) throws IOException {
		int letrai=fichero.read();
		while(letrai!=-1){
			char letra=(char) letrai;
			System.out.print(letra);
			contadorChar++;
			letrai=fichero.read();
			
			
		}
		
	}

	public static void main(String[] args) throws IOException {
		FileReader fichero=new FileReader("C:/Users/Carol/Downloads/programa.txt");
		ejemplo1.contarChar(fichero);
		System.out.println();
		ejemplo1.contarLineas(fichero);
		System.out.println("Total de caracteres: "+contadorChar);
		System.out.println("Total de líneas: "+contadorLineas);
	}

}
