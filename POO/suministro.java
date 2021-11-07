

/* Programa del Suministrador

Hay un suministrador de productos que abastece 10 tipos de productos diferentes a 3 supermercados.
Estos 3 supermercados van a solicitar un numero de productos (que tienen un precio por unidad) determinado al suministrador.

El modo de establecer las peticiones será el siguiente:
    • En pantalla saldrá el nombre de la tienda 1
    • A continuación saldrá “Qué producto se suministra (1-10)?
    • El supermercado solicita un número entre 1 y 10, indicando con este numero el producto del que va a suministrar unidades:
    • Una vez introducido el producto en pantalla saldrá el producto que corresponde ese número, por ejemplo “detergente” 
    y el programa pedirá el número de unidades solicitadas.
    • Una vez introducidas las unidades pondrá el precio total.
    • Este proceso se repetirá hasta que en la pregunta producto se introduzca -1. Entonces se pasará a la siguiente tienda.

Ejemplo:

Carrefour:
Qué producto se suministra (1-10)?: 
3
Bricks de leche, 1.5 euros
Número de unidades? 
60
Total: 90 euros

Qué producto se suministra (1-10)?: 
 8
Cerveza,, 0.8 euros
Número de unidades? 
 150
Total: 120 euros

Alcampo:
Qué producto se suministra (1-10)?: 


Una vez que las 3 tiendas hayan acabado de solicitar todos los productos, 
el suministrador tiene que mostrar el coste total.*/

package ejercicios_Objetos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class suministro {
	
	private String tienda;
	private int producto;
	private int cantidad;
	static String productoDefinitivo;
	static double precio;
	static double precioTotal;
	static double precioDefinitivo;

	
	public suministro(String tienda, int producto,int cantidad) {
		this.tienda=tienda;
		this.producto=producto;
		this.cantidad=cantidad;
		
		
	}
	
	public  void asignarProducto(ArrayList productos,ArrayList precios) {
		System.out.println(this.tienda+": ");
		
		switch(producto) {
		case 1:
			System.out.println("Usted ha elegido la opción 1 :");
			productoDefinitivo=(String) productos.get(0);
			precio=(double)precios.get(0);
			System.out.println(productoDefinitivo+" , "+precio+" €");
			precioTotal=this.cantidad*precio;
			System.out.println(precioTotal+" €");
			precioDefinitivo+=precioTotal;
			break;
		case 2:
			System.out.println("Usted ha elegido la opción 2 :");
			productoDefinitivo=(String)productos.get(1);
			precio=(double)precios.get(1);
			System.out.println(productoDefinitivo+" , "+precio+" €");
			precioTotal=this.cantidad*precio;
			System.out.println(precioTotal+" €");
			precioDefinitivo+=precioTotal;
			break;
		case 3:
			System.out.println("Usted ha elegido la opción 3 :");
			productoDefinitivo=(String)productos.get(2);
			precio=(double)precios.get(2);
			System.out.println(productoDefinitivo+" , "+precio+" €");
			precioTotal=this.cantidad*precio;
			System.out.println(precioTotal+" €");
			precioDefinitivo+=precioTotal;
			break;
		case 4:
			System.out.println("Usted ha elegido la opción 4 :");
			productoDefinitivo=(String)productos.get(3);
			precio=(double)precios.get(3);
			System.out.println(productoDefinitivo+" , "+precio+" €");
			precioTotal=this.cantidad*precio;
			System.out.println(precioTotal+" €");
			precioDefinitivo+=precioTotal;
			break;
		case 5:
			System.out.println("Usted ha elegido la opción 5 :");
			productoDefinitivo=(String)productos.get(4);
			precio=(double)precios.get(4);
			System.out.println(productoDefinitivo+" , "+precio+" €");
			precioTotal=this.cantidad*precio;
			System.out.println(precioTotal+" €");
			precioDefinitivo+=precioTotal;
			break;
		case 6:
			System.out.println("Usted ha elegido la opción 6 :");
			productoDefinitivo=(String)productos.get(5);
			precio=(double)precios.get(5);
			System.out.println(productoDefinitivo+" , "+precio+" €");
			precioTotal=this.cantidad*precio;
			System.out.println(precioTotal+" €");
			precioDefinitivo+=precioTotal;
			break;
		case 7:
			System.out.println("Usted ha elegido la opción 7 :");
			productoDefinitivo=(String)productos.get(6);
			precio=(double)precios.get(6);
			System.out.println(productoDefinitivo+" , "+precio+" €");
			precioTotal=this.cantidad*precio;
			System.out.println(precioTotal+" €");
			precioDefinitivo+=precioTotal;
			break;
		case 8:
			System.out.println("Usted ha elegido la opción 8 :");
			productoDefinitivo=(String)productos.get(7);
			precio=(double)precios.get(7);
			System.out.println(productoDefinitivo+" , "+precio+" €");
			precioTotal=this.cantidad*precio;
			System.out.println(precioTotal+" €");
			precioDefinitivo+=precioTotal;
			break;
		case 9:
			System.out.println("Usted ha elegido la opción 9 :");
			productoDefinitivo=(String)productos.get(8);
			precio=(double)precios.get(8);
			System.out.println(productoDefinitivo+" , "+precio+" €");
			precioTotal=this.cantidad*precio;
			System.out.println(precioTotal+" €");
			precioDefinitivo+=precioTotal;
			break;
		case 10:
			System.out.println("Usted ha elegido la opción 10 :");
			productoDefinitivo=(String)productos.get(9);
			precio=(double)precios.get(9);
			System.out.println(productoDefinitivo+" , "+precio+" €");
			precioTotal=this.cantidad*precio;
			System.out.println(precioTotal+" €");
			precioDefinitivo+=precioTotal;
			break;
		default:
			System.out.println("Opción no correcta");
		}
	}

	public static void main(String[] args) {
		ArrayList<String>productos=new ArrayList<>();
		productos.add("brick de leche");
		productos.add("tomate frito");
		productos.add("pan de molde");
		productos.add("cruasanes");
		productos.add("chicles");
		productos.add("mascarillas");
		productos.add("gel hidroalcolico");
		productos.add("gel de ducha");
		productos.add("champú");
		productos.add("mascarilla pelo");
		ArrayList<Double>precios=new ArrayList<>();
		precios.add(0.99);
		precios.add(1.49);
		precios.add(2.0);
		precios.add(1.25);
		precios.add(1.10);
		precios.add(3.0);
		precios.add(0.99);
		precios.add(2.99);
		precios.add(3.0);
		precios.add(4.0);
		
		suministro mercadona=new suministro("Mercadona",3,300);
		suministro alcampo=new suministro("Alcampo",4,55);
		suministro elcorteingles=new suministro("El Corte Inglés",7,60);
		mercadona.asignarProducto(productos, precios);
		alcampo.asignarProducto(productos, precios);
		elcorteingles.asignarProducto(productos, precios);
		
		System.out.println("Precio total de suministrador: "+precioDefinitivo);
		
	}

}
