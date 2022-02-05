


package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Leer fichero con números seguidos y separados por espacio
 *  5 6 7 4 5
 *  y calcular suma y media
 */
public class sumaMedia {
	static int contador=0;
	static int suma=0;
	static double media=0;
	public static void calcular(FileReader fichero) throws IOException {
		int letrai=fichero.read();
		while(letrai!=-1) {
			char letra=(char) letrai;
			
			if(letra!=' ') {
				//Para hacer un parseInt hay que pasar el char a String
				String texto=String.valueOf(letra);
				int num=Integer.parseInt(texto);
				System.out.println(num);
				suma+=num;
				//Total de caracteres que no son espacio
				contador++;
			}
			
			letrai=fichero.read();
		}
		
		media=suma/contador;
		//System.out.println(contador);
		System.out.println("Suma: "+suma);
		System.out.println("Media: "+media);
	}
	public static void main(String[] args) throws IOException {
		
		FileReader fichero=new FileReader("C:/Users/Carol/Downloads/programa.txt");
		sumaMedia.calcular(fichero);
	}

}
