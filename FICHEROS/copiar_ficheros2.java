

package ficheros;
//COPIAR CONTENIDO DE UN ARCHIVO A OTRO CON FILEWRITER Y FILEREADER Y BUFFERED
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copiar_ficheros2 {
	static BufferedReader input=null;
	static BufferedWriter output=null;
	public static void recorrer(FileReader fichero, FileWriter fichero2) throws IOException {
		input=new BufferedReader(fichero);
		output=(new BufferedWriter(fichero2));
		int lectura=input.read();
		while(lectura!=-1) {
			output.write(lectura);
			lectura=input.read();
		}
		input.close();
		output.close();
		
	}
	public static void main(String[] args) throws IOException {
		FileReader fichero=new FileReader("C:/Users/Carol/Downloads/programa.txt");
		FileWriter fichero2=new FileWriter("C:/Users/Carol/Downloads/programa2.txt");
		copiar_ficheros2.recorrer(fichero, fichero2);
		
	}

}
