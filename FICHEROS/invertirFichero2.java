

//INVERTIR FICHEROS POR LINEAS

/* 2.- Realizar un comando que muestre un fichero de texto con sus líneas invertidas.
Si el fichero contiene:
Hola
Pepe
Debe mostrar:
aloH
epeP
 */

package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class invertirFichero2 {

	public static void main(String[] args) throws IOException {
		File fichero=new File("C:/Users/User/Desktop/hola1.txt");
		ArrayList<String>listaArray=new ArrayList();
		PrintWriter fichero2=new PrintWriter("C:/Users/User/Desktop/hola2.txt");
		FileReader fichero4=new FileReader("C:/Users/User/Desktop/hola2.txt");
		
		
		Scanner sc=new Scanner(fichero);
		
		String linea;
		String linea2="";
		char linea1;
		
		System.out.println("Lectura del archivo original sin invertir:");
		
		while(sc.hasNext()) {
			linea=sc.nextLine();
			System.out.print(linea);
			for(int i=linea.length()-1;i>=0;i--) {
				linea1=linea.charAt(i);
				linea2=String.valueOf(linea1);
				listaArray.add(linea2);
			}
			System.out.println();
			
		}
		
		System.out.println("Lectura del array con el contenido del fichero invertido creado a través del fichero");
		
		System.out.println(listaArray);
		
		//Pasamos la información del array al fichero secundario
		
		for(String i:listaArray) {
			fichero2.write(i);
		}
		fichero2.close();
	
		System.out.println("Lectura del segundo archivo con el contenido invertido:");
		
		int letrai = 0;
		letrai=fichero4.read();
		
		while(letrai!=-1) {
			char letra=(char)letrai;
			System.out.print(letra);
			letrai=fichero4.read();
		}
		System.out.println();
	}

}
