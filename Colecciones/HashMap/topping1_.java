package colecciones;
import java.util.*;
/*Dado un mapa de claves de alimentos y valores de cobertura, 
 * modifique y devuelva el mapa de la siguiente manera: 
 * si la clave "ice cream" está presente, establezca su valor en "cherry".
 *  En todos los casos, configure la tecla "bread" para que tenga el valor 
 *  "butter" 
 *  
	topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
	topping1({}) → {"bread": "butter"}
	topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}*/
public class topping1 {
	public static void anadir(HashMap alimentos) {
		//Añade bread como primera posición y luego lo sobreescribe en caso de que se repita
		alimentos.put("bread", "butter");
	}
	public static void modificar(HashMap alimentos) {
		Set<String>datos=alimentos.keySet();
		for(String i:datos) {
			//Sobreescribe bread para que siempre su valor sea butter y en primera posición
			if(i.equals("bread")) {
				alimentos.put("bread", "butter");
			}else
			if(i.equals("ice cream")){
				alimentos.put("ice cream", "cherry");
			}
		}
	}
	public static void recorrer(HashMap alimentos) {
		Set<String>datos=alimentos.keySet();
		for(String i:datos) {
			System.out.println("Clave: "+i);
			System.out.println("Valor: "+alimentos.get(i)+"\n_____________\n");
		}
	}
	public static void main(String[] args) {
		HashMap<String,String>alimentos=new HashMap<>();
		topping1.anadir(alimentos);
		alimentos.put("ice cream", "cornetto");
		alimentos.put("pancake", "chocolate");
		alimentos.put("fish", "salmon");
		alimentos.put("bread", "chocolate");
		topping1.modificar(alimentos);
		topping1.recorrer(alimentos);
	}

}
