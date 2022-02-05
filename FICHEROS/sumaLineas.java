

package ficheros;
/*
 * Crear un archivo con números reales en cada línea. Abrirlo con un flujo de texto por lectura
 * y leerlo línea a línea. Convertir las cadenas leídas en números de tipo double por medio de
 * Scanner , y mostrar al final la suma de todos ellos.
 * 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class sumaLineas {
	static BufferedReader bf=null;
	static double suma;
	public static void sumar(FileReader fichero,ArrayList listado) throws IOException {
		bf=new BufferedReader(fichero);
		//Se lee la primera línea
		//Se calcula la suma, y se añade a ArrayList divisibles entre 2
		String texto=bf.readLine();
		double num=Double.valueOf(texto);
		suma+=num;
		if(num%2==0) {
			listado.add(num);
		}
		//Se lee el resto de lineas
		//Se calcula la suma, y se añade a ArrayList divisibles entre 2
		while(texto!=null) {
			texto=bf.readLine();
			if(texto!=null) {
				num=Double.valueOf(texto);
				System.out.println(texto);
				suma+=num;
				if(num%2==0) {
					listado.add(num);
				}
				
			
			}
			
			
		}
		System.out.println("Suma total números: "+suma);
		System.out.println("Números divisibles entre 2: "+listado);
	}
	
	
	public static void main(String[] args) throws IOException {
		FileReader fichero=new FileReader("C:/Users/Carol/Downloads/programa.txt");
		ArrayList<Integer>listado=new ArrayList<>();
		
		sumaLineas.sumar(fichero,listado);
	

	}

}
