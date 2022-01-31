
package ejercicio_metrica;

import java.util.Arrays;
import java.util.Calendar;

public class test {
	static int diferencia=0;
	static int year=2000;
	public void fijarFecha() {
		//Función que calcula la diferencia de fecha
		int anio=0;
		//Obtenemos el anio actual
		Calendar cal=Calendar.getInstance();
		int actualYear=cal.get(Calendar.YEAR);
		diferencia=actualYear-year;
	}
	public static void main(String[] args) {
		System.out.println("La empresa Manolita es una experta en la venta y distribución de productos de alimentación.");
		System.out.println("Fundada en el año "+year+". Contigo desde hace: "+diferencia+" anios.");
		
		//Creación de objetos
		productos[]listado=new productos [4];
		listado[0]=new bebidas("Cola-Cola Zero",1.5,20);
		listado[1]=new bebidas("Coca-Cola",1.5,18);
		listado[2]=new higiene("Shampoo Sedal",500,19);
		listado[3]=new frutas("Frutillas",64,"kilo");
		
		Arrays.sort(listado);
		System.out.println("===============================");
		for(productos o:listado) {
			System.out.println(o.toString());
		}
		System.out.println("===============================");
		System.out.println("Producto más caro: "+listado[listado.length-1].getNombre());
		System.out.println("Producto más barato: "+listado[0].getNombre());

	}

}
