
package colecciones;
import java.util.*;
/*Dado un mapa de claves de alimentos 
 * y sus valores de cobertura, modifique 
 * y devuelva el mapa de la siguiente manera:
 *  si la clave "ice-cream" tiene un valor, 
 *  configúrelo como el valor de la clave "yogurt"
 *   también. Si la clave "spinach" tiene un valor,
 *    cámbielo por "nuts". */
	public class topping2 {
		static String valorHelado="";
	public static void cambiar(HashMap alimentos) {
		
		boolean helado=false;
		Set<String>listado=alimentos.keySet();
		//Busca si está ice cream y almacena su valor
		for(String j:listado) {
			if(j.equals("ice cream")) {
				valorHelado=(String)alimentos.get(j);
				helado=true;
			}
		}
		//Cambia los valores de yogurt y spinach si existen
		for(String i:listado) {
			if((i.equals("yogurt"))&&(helado==true)) {
				alimentos.put("yogurt", valorHelado);
			}
			if(i.equals("spinach")) {
				alimentos.put("spinach", "nuts");
			}
		
		}
		
	}
	public static void recorrer(HashMap alimentos) {
		Set<String>listado_=alimentos.keySet();
		for(String j:listado_) {
			System.out.println("Clave: "+j);
			System.out.println("Valor: "+alimentos.get(j));
		}
	}
	public static void main(String[] args) {
		HashMap<String,String>alimentos=new HashMap<>();
		alimentos.put("ice cream", "cherry");
		alimentos.put("yogurt", "salt");
		alimentos.put("bread", "dirt");
		alimentos.put("spinach", "salt");
		//System.out.println(alimentos);
		topping2.cambiar(alimentos);
		topping2.recorrer(alimentos);
	}

}
