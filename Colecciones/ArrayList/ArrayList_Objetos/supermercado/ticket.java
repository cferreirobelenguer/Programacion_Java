package supermercado;

import java.util.ArrayList;
import java.util.Scanner;

/*3) Un supermercado nos pide que hagamos una pequeña aplicación que almacene los productos pasados por el escaner.
La aplicación debe almacenar Productos (clase), cada producto al crearse contiene una cantidad, un precio (estos dos generados aleatoriamente). El nombre del producto será básico (producto1, producto2, producto3, etc.).

Te dejo la clase Producto, solo agrégala a tu proyecto. Pincha aquí para descargarlo.

El precio ya viene con los impuestos incluidos.

Calcular el precio total de una lista de entre 1 y 8 productos (aleatorio). Mostrar un ticket con todo lo vendido y el precio final como se hacen en los supermercados. Más o menos con este formato, lo importante son los datos, no el estilo:

***********Cantidad****Precio*****Total

Producto1           5                       3.5              17.5

Producto2             7                    2.5              17.5

Precio final                                                         35 */
public class ticket {
	static Scanner sc=new Scanner(System.in);
	static String producto;
	static int cantidad;
	static double precio;
	static double total;
	static double precioFinal;
	public static void anadir(ArrayList ticket_,ArrayList precio_) {
		System.out.println("Introduzca un producto");
		producto=sc.next();
		//Cantidad generada aleatoriamente
		cantidad=(int)Math.floor(Math.random()*(10-1)+1);
		//Precio generado aleatoriamente de 0 a 100
		precio=(double)Math.floor(Math.random()*100);
		total=cantidad*precio;
		//Creamos un objeto
		producto producto_=new producto(producto,cantidad,precio,total);
		producto_.setProducto(producto);
		producto_.setCantidad(cantidad);
		producto_.setPrecio(precio);
		producto_.setTotal(total);
		//Se añade el objeto al ArrayList
		ticket_.add(producto_);
		//Se añade el total al ArrayList
		precio_.add(total);
		
	}
	public static void recorrer(ArrayList ticket_,ArrayList precio_) {
		for(Object o:ticket_) {
			System.out.println(o);
		}
	}
	public static void calcularPrecioFinal(ArrayList precio_) {
		for(int i=0;i<precio_.size();i++) {
			precioFinal+=(double)precio_.get(i);
		}
		System.out.println("Precio final: "+precioFinal+"€");
	}
	public static void main(String[] args) {
		//Total de productos de 1 a 8
		int numeroAleatorio=(int)Math.floor(Math.random()*(8-1)+1);
		int contador=0;
		//Crear ArrayList de objeto de producto
		ArrayList<producto> ticket_=new ArrayList<>();
		//Crear ArrayList de precios
		ArrayList <Integer> precio_=new ArrayList<>();
		do {
			ticket.anadir(ticket_, precio_);
			contador++;
		}while(contador!=numeroAleatorio);
		
		ticket.recorrer(ticket_, precio_);
		ticket.calcularPrecioFinal(precio_);
	}

}
