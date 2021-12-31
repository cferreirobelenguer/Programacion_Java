package colecciones;
import java.util.*;
/*Modifique y devuelva el mapa dado de la siguiente manera: 
 * si las claves "a" y "b" están en el mapa y tienen valores
 *  iguales, elimínelas. 
 *  mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
	mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
	mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}*/
public class mapAB2 {
	public static void modificar(HashMap datos) {
		int contador=0;
		String claveA="";
		String valorA="";
		String claveB="";
		String valorB="";
		Set<String>lista=datos.keySet();
		for(String i:lista) {
			if(i.equals("a")) {
				claveA=i;
				valorA=(String) datos.get(i);
			}else if(i.equals("b")) {
				claveB=i;
				valorB=(String)datos.get(i);
			}
		}
		if(valorA.equals(valorB)) {
			datos.remove(claveA);
			datos.remove(claveB);
		}
	}
	public static void recorrer(HashMap datos) {
		Set<String>listado=datos.keySet();
		for(String i:listado) {
			System.out.println("Clave: "+i);
			System.out.println("Valor: "+datos.get(i)+"\n______\n");
		}
	}
	public static void main(String[] args) {
		HashMap<String,String>datos=new HashMap<>();
		datos.put("a", "hola");
		datos.put("b", "hola");
		datos.put("c", "mundo");
		datos.put("d", "java");
		mapAB2.modificar(datos);
		mapAB2.recorrer(datos);
	}

}
