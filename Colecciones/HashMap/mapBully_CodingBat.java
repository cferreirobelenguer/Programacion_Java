
/*Programa de CodingBat a través del cual se crea una lista 
 * basada en otra, la cual su primer valor debe estar vacío y el valor de la segunda clave
 * debe tener el valor de la primera.
 * Ejemplo a:kandy b:dirty
 * La solución de la nueva lista sería: a:"", b:kandy
 */


package colecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapBully {
	static String valorDeB="";
	public static void cambiarLista(HashMap<String, String> lista) {
		Set<Map.Entry<String, String>>claves=lista.entrySet();
		
		Iterator<Map.Entry<String,String>>listado=claves.iterator();
		
		while(listado.hasNext()) {
			
			Map.Entry<String,String>siguiente=listado.next();
			
			if(siguiente.getKey().equals("a")) {
				valorDeB=siguiente.getValue();
				String valor=siguiente.getValue();
				lista.replace(siguiente.getKey()," ");
				
			}
			if(siguiente.getKey().equals("b")) {
				String valor_=siguiente.getValue();
				lista.replace(siguiente.getKey(),valorDeB);
				
			}
		}
		System.out.println(lista);
	}
	public static void main(String[] args) {
		HashMap<String,String>lista=new HashMap<>();
		lista.put("a", "kandy");
		lista.put("b","dirty");
		cambiarLista(lista);
		
	}

}
