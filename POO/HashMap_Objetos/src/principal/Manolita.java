package principal;
import java.util.*;
import java.util.Map.Entry;

import tipos.*;

public class Manolita {

	public static void main (String [] args) {
		
		String [] nombre_prod = new String[4];
		
		Calendar inicio = new GregorianCalendar(2000, 0, 1);
		Calendar actual = Calendar.getInstance();
		
		long anyos = (actual.getTimeInMillis() - inicio.getTimeInMillis())/1000/60/60/24/365;
		
		Bebida bebidas[] = new Bebida[2];
		
		bebidas[0] = new Bebida ("Coca-Cola Zero", 20, 1.5);
		bebidas[1] = new Bebida ("Coca-Cola", 18, 1.5);
		
		Higiene shampoo = new Higiene ("Shampoo Sedal", 19, 500);
		
		Fruta frutas = new Fruta ("Frutillas", 64, "kilo");
		
		System.out.println("La empresa Manolita es una experta en la venta y distribución de productos de alimentación.\n"
				+ "Fundada en el año 2000. Contigo desde hace: " + anyos + " anios.\n\n"
				+ "Productos:\n"
				+ "=============================");
		
		for (int i = 0; i < bebidas.length; i++) {
			
			System.out.println(bebidas[i]);
			
		}
		
		System.out.println(shampoo);
		System.out.println(frutas);
		
		Map<Integer, String> mapa_productos = new HashMap<>();
		
		mapa_productos.put(bebidas[0].getPrecio(), bebidas[0].getNombre());
		mapa_productos.put(bebidas[1].getPrecio(), bebidas[1].getNombre());
		mapa_productos.put(shampoo.getPrecio(), shampoo.getNombre());
		mapa_productos.put(frutas.getPrecio(), frutas.getNombre());
		
		TreeMap<Integer, String> ordenado = new TreeMap<>(mapa_productos);
		
		Set<Entry<Integer, String>> prod_ord = ordenado.entrySet();
		
		int i = 0;
		
		for(Entry<Integer, String> p : prod_ord){
			nombre_prod[i] = p.getValue();
			i++;
		}
		
		System.out.println("=============================\n\n"
				+ "Producto más caro: " + nombre_prod[nombre_prod.length-1] + "\n"
				+ "Producto más barato: " + nombre_prod[0]);
	
	}
	
}