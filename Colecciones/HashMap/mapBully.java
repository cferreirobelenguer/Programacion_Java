package colecciones;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*Modifique y devuelva el mapa dado de la siguiente manera: 
 * si la clave "a" tiene un valor, configure la clave "b" 
 * para que tenga ese valor y configure la clave "a" para que 
 * tenga el valor "". Básicamente, "b" es un matón, que toma 
 * el valor y lo reemplaza con la cadena vacía. 
 * 	mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
	mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
	mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}*/
public class mapBully {
	static Scanner sc=new Scanner(System.in);
	public static void anadir(HashMap lista) {
		//Cantidad de veces que se introducen valores en el mapa aleatorio del 1 al 10
		int numero=(int)Math.floor(Math.random()*(5-2)+2);
		int contador=0;
		do {
			System.out.println("Introduce una clave");
			String clave=sc.next();
			System.out.println("Introduce un valor");
			String valor=sc.next();
			lista.put(clave, valor);
		contador++;
		}while(contador!=numero);
		
	}
	public static void reemplazar(HashMap lista) {
		int contador=0;
		String claveAlmacenada="";
		Set<String> datos=lista.keySet();
		for(String i:datos) {
			contador++;
			//En la posición primera se pone el valor vacío
			if(contador==1) {
				claveAlmacenada=(String) lista.get(i);
				lista.put(i, " ");
			}else
			if(contador==2) { 
			//En la posición 2 se pone el valor de la primera posición
				lista.put(i,claveAlmacenada);
			}
			
		}
	}
	public static void recorrer(HashMap lista) {
		//Recorremos el mapa
		Set<String> datos=lista.keySet();
		for(String i:datos) {
			System.out.println("Clave: "+i);
			System.out.println("Valor: "+lista.get(i));
		}
	}
	public static void main(String[] args) {
		//Mapa de cadena de caracteres
		HashMap<String,String>lista=new HashMap<String,String>();
		mapBully.anadir(lista);
		mapBully.reemplazar(lista);
		mapBully.recorrer(lista);
	}

}
