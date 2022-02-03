

package examen_2020;
/*
 * Elaborar un programa donde el usuario introduce por teclado el nombre
 * de un fichero de texto. El programa me tiene que mostrar el porcentaje
 * de líneas con comentarios. Se supone que una línea tiene un comentario si se encuentra en la línea 
 * dos barras consecutivas.
 * 
 * Introduce el nombre del fichero: programa.java
 * El fichero tiene un 10% de lineas con comentarios.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class contarComentarios {
static Scanner sc=new Scanner (System.in);
	static BufferedReader fichero=null;
	static int contador=0;
	static int total=0;
	public static void comprobar(String cadena) throws IOException {
	//Declaración de BufferedReader yintroduciendo un FileReader con su ruta
	fichero=new BufferedReader(new FileReader("C:/Users/Carol/Downloads/"+cadena));
	//Se lee la primera linea
	String texto=fichero.readLine();
	//Si la linea no es null se lee
	while(texto!=null) {
		if(texto.contains("//")) {
			//Si el texto contiene // se incrementa el contador de //
			contador++;
			System.out.println(texto);
			}
		//Se leen los archivos y se incrementa el contador del total de archivos
		total++;
		texto=fichero.readLine();
		}
	//Se calcula el porcentaje de //
	int porcentaje=contador*100/total;
	System.out.println(contador);
	System.out.println(total);
	System.out.println("El fichero tiene un "+porcentaje+"% de líneas con comentarios");
	}
	public static void main(String[] args) throws IOException {
		System.out.println("Introduce el nombre del fichero: ");
		String cadena=sc.nextLine();
		contarComentarios.comprobar(cadena);

	}

}
