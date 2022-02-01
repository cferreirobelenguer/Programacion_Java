
package examen_ord;
/* 
 * 
 * Queremos hacer un programa que lea de un fichero pasado como parámetro (args) y muestre
 * el contenido del fichero por pantalla ordenando las líneas por orden alfabético, salvo
 * aquellas que comiencen por el carácter #.
 * 
 * El programa debe detectar que ha recibido un parámetro con el nombre del fichero y que este
 * fichero existe y se puede leer.
 * 
 * Ejemplo de ejecución:
 * 
 * Debe introducir un nombre de fichero
 * 
 * prueba
 * 
 * El fichero prueba no existe o no se puede leer
 * 
 * En caso de que exista se muestran los datos menos los que contengan # y ordenados.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ficheroOrden {
static Scanner sc=new Scanner (System.in);

	public static void comprobar(String nombre,ArrayList listado) throws IOException{
		File fichero=new File("C:/Users/Carol/Downloads/"+nombre+".txt");
		BufferedReader br=null;
		
		if(fichero.exists()) {
			System.out.println("existe");
			br=new BufferedReader(new FileReader("C:/Users/Carol/Downloads/"+nombre+".txt"));
			//Leer la primera línea guardandolo en un String
			String texto=br.readLine();
			//Almaceno la primera línea en un arrayList
			//Se introducen en array las líneas que no contienen #
			if(!texto.contains("#")) {
				listado.add(texto);
			}
			//Repetir mientras no se llegue al final del fichero
			while(texto!=null) {
				//Almaceno el resto de líneas en el  arrayList
				//Se introducen en array las líneas que no contienen #
				if(!texto.contains("#")) {
					listado.add(texto);
				}
				//Leo la siguiente línea
				texto=br.readLine();
			}
			System.out.print("Contenidos de fichero sin ordenar: ");
			System.out.println(listado);
			//Ordenamos el fichero por orden alfabético
			Collections.sort(listado);
			System.out.print("Contenidos de fichero ordenados: ");
			System.out.println(listado);
			
			
		}else {
			System.out.println("El fichero "+fichero.getName()+" no se puede leer");
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		ArrayList<String>listado=new ArrayList<String>();
		System.out.println("Debe introducir un nombre de fichero");
		String nombre=sc.nextLine();
		ficheroOrden.comprobar(nombre,listado);
		
	}

}
