package ficheros;
/*
 * Copiar un arreglo en un archivo utilizando los
 * flujos de salida binarios FileOutputStream y
 * los objetos OutputStream, se pasan los datos del
 * array en binario en el archivo de texto.
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BinariosTabla {
	public static void recorrer(int[]lista) throws IOException, IOException {
		//Se crea el objecto OutputStream
		ObjectOutputStream o=null;
		//Se crea el objecto OutputStream que recoje un FileOutputStream con una url de un archivo
		o=new ObjectOutputStream(new FileOutputStream("C:/Users/Carol/Downloads/programa.txt"));
		//Se recorre el arreglo y se añaden los datos en el archivo
		for(int i=0;i<lista.length;i++) {
			o.writeInt(lista[i]);
		}
		//Se cierra el flujo de salida
		o.close();
	}
	public static void main(String[] args) throws IOException {
		//Pasa los datos del array a binario en un documento de texto
		int[]lista= {3,4,67,54,78,987,23};
		BinariosTabla.recorrer(lista);
		

	}

}
