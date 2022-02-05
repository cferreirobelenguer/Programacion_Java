

package ficheros;
/*
 * Copiar un archivo en otro linea a linea
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class copiarFichero {
	static BufferedReader bf=null;
	static BufferedWriter out=null;
	public static void leer(FileReader fichero1, ArrayList listado) throws IOException {
		bf=new BufferedReader(fichero1);
		//Se lee la primea línea y se añade al ArrayList
		String texto = bf.readLine();
		listado.add(texto);
		//Se lee el resto y se añade al ArrayList
		while(texto!=null) {
			listado.add(texto);
			texto = bf.readLine();
		}
		bf.close();
		
	}
	public static void copiar(FileWriter fichero2,ArrayList listado) throws IOException {
		out=new BufferedWriter(fichero2);
		for(int i=0;i<listado.size();i++) {
			String cadena=(String)listado.get(i);
			System.out.println(cadena);
			//Se lee el array y se escribe en el archivo
			out.write(cadena);
			//Salto de línea
			out.newLine();
			
		}
		out.close();
		
	}
	public static void main(String[] args) throws IOException {
		//Fichero binario de lectura de datos
		FileReader fichero1=new FileReader ("C:/Users/Carol/Downloads/programa.txt");
		//Fichero binario de escritura de datos
		FileWriter fichero2=new FileWriter ("C:/Users/Carol/Downloads/programa2.txt");
		ArrayList <String>listado=new ArrayList<>();
		copiarFichero.leer(fichero1, listado);
		copiarFichero.copiar(fichero2, listado);

	}

}
