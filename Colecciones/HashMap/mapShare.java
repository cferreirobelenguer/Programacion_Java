/*Programa que a partir de una lista con clave valor 
 * en caso de que tenga a, la clave b adquiere el valor de a y c se elimina
 * ; en caso de que no tnega ninguna clave con a se mantiene el valor de b y no se
 * elimina c.
 */


package colecciones;

import java.util.HashMap;
import java.util.Set;

public class mapShare {
	static String valorA="";
	public static void modificarLista(HashMap lista) {
		Set<String>clave=lista.keySet();
		boolean cambios=false;
		for(String claves:clave) {
			if(claves.equals("a")) {
				valorA=(String) lista.get(claves);
				cambios=true;
				
			}
			
		}
		
		if(!cambios==false) {
			lista.remove("c",lista.get("c"));
			lista.replace("b", valorA);
		}
		System.out.println(lista);
	}

	public static void main(String[] args) {
		HashMap<String,String>lista=new HashMap<>();
		lista.put("a","aaa");
		lista.put("b", "bbb");
		lista.put("c", "ccc");
		
		modificarLista(lista);

	}

}
