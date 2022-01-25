package principal;
import java.util.*;
import java.util.Map.Entry;

import tipos.*;

public class Manolita {

	public static void main (String [] args) {
		
		String [] nombre_prod = new String[4];
		
		//Se cacula el año mediante Calendar y getInstance
		Calendar inicio = new GregorianCalendar(2000, 0, 1);
		Calendar actual = Calendar.getInstance();
		
		long anyos = (actual.getTimeInMillis() - inicio.getTimeInMillis())/1000/60/60/24/365;
		
		//Se introducen las bebidas en un arreglo para luego mostrar los datos
		Bebida bebidas[] = new Bebida[2];
		
		//Creación de objetos
		bebidas[0] = new Bebida ("Coca-Cola Zero", 20, 1.5);
		bebidas[1] = new Bebida ("Coca-Cola", 18, 1.5);
		
		Higiene shampoo = new Higiene ("Shampoo Sedal", 19, 500);
		
		Fruta frutas = new Fruta ("Frutillas", 64, "kilo");
		
		//Encabezado del ejercicio
		System.out.println("La empresa Manolita es una experta en la venta y distribución de productos de alimentación.\n"
				+ "Fundada en el año 2000. Contigo desde hace: " + anyos + " anios.\n\n"
				+ "Productos:\n"
				+ "=============================");
		//Se recorren las bebidas para mostrar el resultado que se ha almacenado en un arreglo
		for (int i = 0; i < bebidas.length; i++) {
			
			System.out.println(bebidas[i]);
			
		}
		
		System.out.println(shampoo);
		System.out.println(frutas);
		//Se crea un map donde se van a almacenar el precio y nombre de cada objeto
		Map<Integer, String> mapa_productos = new HashMap<>();
		
		mapa_productos.put(bebidas[0].getPrecio(), bebidas[0].getNombre());
		mapa_productos.put(bebidas[1].getPrecio(), bebidas[1].getNombre());
		mapa_productos.put(shampoo.getPrecio(), shampoo.getNombre());
		mapa_productos.put(frutas.getPrecio(), frutas.getNombre());
		//Creamos un TreeMap que me va a ordenar los datos del HashMap
		TreeMap<Integer, String> ordenado = new TreeMap<>(mapa_productos);
		//Declaramos entrySet para poder ver el valor y almacenarlo en un arreglo para poder después manipularlo por posiciones
		Set<Entry<Integer, String>> prod_ord = ordenado.entrySet();
		
		int i = 0;
		//Almacenamos los valores ordenados del TreeMap en un arreglo nombre_prod
		for(Entry<Integer, String> p : prod_ord){
			nombre_prod[i] = p.getValue();
			i++;
		}
		//El más caro es la última posición del arreglo y el más barato es la primera posición
		System.out.println("=============================\n\n"
				+ "Producto más caro: " + nombre_prod[nombre_prod.length-1] + "\n"
				+ "Producto más barato: " + nombre_prod[0]);
	
	}
	
}
