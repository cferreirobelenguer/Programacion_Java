package ficheros;
/*
 * Copiar contenido de String en binario en un archivo 
 * a través de FileOutputStream y ObjectPutputStream
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class cadena_Binarios {
	
	public void imprimir(String cadena) throws FileNotFoundException, IOException {
		
		//Se declara el objeto ObjectOutputStream con el directorio del archivo
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("C:/Users/Carol/Downloads/programa.txt"));
		//Se imprime la cadena en el archivo del directorio anterior en binario
		o.writeObject(cadena);
		
	}
	public static void main(String[] args) {
		String cadena="hola caracola"+"\n"+"hola pepe"+"\n"+"hola luis"+"hola hola"+"\n";

	}

}
