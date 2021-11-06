


/*Usuario introduce frutas y cantidad, si son platanos, limones o naranjas
 * se incluye el producto al carrito hasta que usuario escriba fin,
 * finalmente se muestra el carrito de la compra.
 */

package fruteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class laFruteria {
	static Scanner sc=new Scanner(System.in);
	static HashMap listaCompra;
	static boolean encontrado=false;
	
	static int cantidadPlatanos=0;
	static int cantidadLimones=0;
	static int cantidadNaranjas=0;
	static int cantidadPlatanosTotal=0;
	static int cantidadLimonesTotal=0;
	static int cantidadNaranjasTotal=0;
	
	
	public static void ElijaFruta(HashMap listaCompra,ArrayList frutas) {
		
		String fruta="";
		System.out.println("Selecciona una fruta: ");
		System.out.println("Pulse fin si quiere finalizar la compra");
		while(!fruta.equals("fin")){
		
		
		fruta=sc.nextLine();
		if(frutas.contains(fruta)) {
			System.out.println("Producto agregado correctamente a su carrito");
			System.out.println("Selecciona una cantidad: ");
			
			if(fruta.equals(frutas.get(0))) {
				cantidadPlatanos=sc.nextInt();
				cantidadPlatanosTotal+=cantidadPlatanos;
				listaCompra.put(fruta, cantidadPlatanosTotal);
				
			}
			if(fruta.equals(frutas.get(1))) {
				cantidadLimones=sc.nextInt();
				cantidadLimonesTotal+=cantidadLimones;
				listaCompra.put(fruta, cantidadLimonesTotal);
			}
			if(fruta.equals(frutas.get(2))) {
				cantidadNaranjas=sc.nextInt();
				cantidadNaranjasTotal+=cantidadNaranjas;
				listaCompra.put(fruta, cantidadNaranjasTotal);
			}
			System.out.println("Selecciona una fruta: ");
			}
		
		}
		
	}
	
	public static void recorrerLista(HashMap listaCompra) {
		System.out.println("Esta es su compra: ");
		Set<String>clave=listaCompra.keySet();
		for(String claves:clave) {
			System.out.println("PRODUCTO: "+claves);
			System.out.println("CANTIDAD: "+listaCompra.get(claves));
		}
		System.out.println("Muchas gracias por su compra");
	}
	public static void main(String[] args) {

		System.out.println("FRUTERÍA DEL SIGLO XXI");
		System.out.println("Bienvenido a nuestra frutería del siglo XXI");
		System.out.println("Introduzca su nombre de cliente: ");
		String nombre=sc.nextLine();
		System.out.println("Bienvenido "+nombre);
		System.out.println("REALICE SU COMPRA "+nombre);
		ArrayList<String>frutas=new ArrayList();
		frutas.add("platanos");
		frutas.add("limones");
		frutas.add("naranjas");
		HashMap<String,String>listaCompra=new HashMap<>();
		
		ElijaFruta(listaCompra,frutas);
		recorrerLista(listaCompra);
	}

}
