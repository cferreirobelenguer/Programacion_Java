

package ejercicio_empresa;
import java.util.*;
import java.sql.Date;

public class test {
	//Variables estáticas de fecha
	
	static int diferencia=0;
	static int year=2000;
	
	public static void calcularFecha() {
		//Función que calcula la diferencia de fecha
		int anio = 0;
		//Obtenemos el año actual
		
		Calendar cal=Calendar.getInstance();
		int actualYear=cal.get(Calendar.YEAR);
		//System.out.println(actualYear);
		//Se calcula la diferencia de años entre el año actual y el 2000
		diferencia=actualYear-year;
		
		}
	public static void main(String[] args) {
		//Función de calcular fecha
		test.calcularFecha();
		//Creación de objetos
		Bebidas producto1=new Bebidas("Coca-Cola Zero",1.5,20);
		Bebidas producto2=new Bebidas("Coca-Cola",1.5,18);
		productosHigiene producto3=new productosHigiene("Shampoo Sedal",500,19);
		Frutas producto4=new Frutas("Frutillas",64,1);
		//Mensaje de Bienvenida de la empresa
		System.out.println("La empresa Manolita es una experta en la venta y distribución de productos de\r\n"
				+ "alimentación.\r\n"
				+ "Fundada en el año "+year+" . Contigo desde hace: "+diferencia+" anios.");
		System.out.println("Productos: ");
		System.out.println("==========================================");
		System.out.println(producto1.toString());
		System.out.println(producto2.toString());
		System.out.println(producto3.toString());
		System.out.println(producto4.toString());
		System.out.println("==========================================");
		//Se calcula el producto con precio menor
		if((producto1.compareTo(producto2)==1)&&(producto1.compareTo(producto3)==1)&&(producto1.compareTo(producto4)==1)) {
			System.out.println("Producto más caro: "+producto1.getNombre());
		}else if((producto2.compareTo(producto1)==1)&&(producto2.compareTo(producto3)==1)&&(producto2.compareTo(producto4)==1)) {
			System.out.println("Producto más caro: "+producto2.getNombre());
		}else if((producto3.compareTo(producto1)==1)&&(producto3.compareTo(producto2)==1)&&(producto3.compareTo(producto4)==1)) {
			System.out.println("Producto más caro: "+producto3.getNombre());
		}else if((producto4.compareTo(producto1)==1)&&(producto4.compareTo(producto2)==1)&&(producto4.compareTo(producto3)==1)) {
			System.out.println("Producto más caro: "+producto4.getNombre());
		}
		//Se calcula el producto con precio menor
		if((producto1.compareTo(producto2)<0)&&(producto1.compareTo(producto3)<0)&&(producto1.compareTo(producto4)<0)) {
			System.out.println("Producto más barato: "+producto1.getNombre());
		}else if((producto2.compareTo(producto1)<0)&&(producto2.compareTo(producto3)<0)&&(producto2.compareTo(producto4)<0)) {
			System.out.println("Producto más barato: "+producto2.getNombre());
		}else if((producto3.compareTo(producto1)<0)&&(producto3.compareTo(producto2)<0)&&(producto3.compareTo(producto4)<0)) {
			System.out.println("Producto más barato: "+producto3.getNombre());
		}else if((producto4.compareTo(producto1)<0)&&(producto4.compareTo(producto2)<0)&&(producto4.compareTo(producto3)<0)) {
			System.out.println("Producto más barato: "+producto4.getNombre());
		}
		
	}

}
