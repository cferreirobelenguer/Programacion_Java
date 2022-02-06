

//INVERTIR FICHERO POR CHAR

/*2.- Realizar un comando que muestre un fichero de texto con sus líneas invertidas.
Si el fichero contiene:
H
O
L
A

P
E
P
E
Debe mostrar:

E
P
E
P

A
L
O
H

 */

package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class InvertirFichero {

	public static void main(String[] args) throws FileNotFoundException {
		File fichero=new File("C:/Users/User/Desktop/hola1.txt");
		
		PrintWriter fw =new PrintWriter("C:/Users/User/Desktop/hola2.txt");
		
		Scanner sc=new Scanner(fichero);
		ArrayList <String>lista=new ArrayList();
		ArrayList <String>lista2=new ArrayList();
		
		
		while(sc.hasNext()) {
			
			lista.add(sc.nextLine());
		}
		System.out.print(lista);
		
		ListIterator li = lista.listIterator(lista.size());
		
		while(li.hasPrevious()) {
			
			lista2.add((String.valueOf(li.previous())));
			
		}
		System.out.println(lista2);
		
		for(String i:lista2) {
			fw.write(i);
		}
		fw.close();
		
	}
}
