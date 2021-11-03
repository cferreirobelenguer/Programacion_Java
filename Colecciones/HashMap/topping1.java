
/*lista que tengo como valor fijo inicial bread butter, y si tiene como clave ice-cream muestre como valor cherry,
 * en caso de que no contenga ice-cream muestra el contenido del array.
 * 
 * ejemplo: ice-cream:peanuts, pancake:syrup
 * resultado: bread:butter, ice-cream:cherry, pancake:syrup
 */


package colecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class topping1 {
	
	public static void modificarLista(HashMap<String,String> topping1) {
		//Primero se declara set para mostrar las claves
		Set <String>clave=topping1.keySet();
		//Se añade bread butter como valor fijo
		topping1.put("bread", "butter");
		
		//Se recorre la lista con for a través de la clave se obtiene el valor
		for(String claves:clave) {
			//Se reemplaza ice-cream
			if(claves.equals("ice-cream")) {
			topping1.replace(claves,"cherry");
			
			
			}
		}
		
		System.out.println(topping1);
	}
	public static void main(String[] args) {
		HashMap<String,String> topping1=new HashMap();
		HashMap <String,String> topping2=new HashMap();
	
		topping1.put("ice-cream", "peanuts");
		topping1.put("pancake","syrup");
		modificarLista(topping1);
	}

}
