

/*
 * Imaginemos un supermercado de barrio.
Crear un programa cuyo punto de entrada sea un main donde, al ejecutarse, se 
visualice la siguiente información por consola:
La empresa Manolita es una experta en la venta y distribución de productos de
alimentación.
Fundada en el año 2000. Contigo desde hace: 21 anios.
Productos:
=============================
Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20
Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18
Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19
Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
=============================
Producto más caro: Frutillas
Producto más barato: Coca-Cola


La solución debe cumplir con los siguientes requisitos:
• Se diseñará una solución orientada a objetos.
• Se usará paquetería para separar las diferentes clases creadas
• La salida será por consola y exactamente como se requiere.
• Usar las clases provistas por Java 8 o superior.
• Cargar la lista de productos en un único método. No hay ingreso de datos
por pantalla de ningún tipo.
• El algoritmo usado para la impresión no tiene que depender de la cantidad 
o tipo de productos.
• Para mostrar el mayor / menor, es muy recomendable usar la interfaz 
Comparable.
• Para imprimir por pantalla los productos, sobrescribir el método toString().
• Al imprimir: Contigo desde hace: 21 anios deberás usar alguna utilidad de 
fecha que calcule en tiempo real el número de años desde que se fundó 
la empresa (se fundó en el año 2000). Es decir, si se ejecutará el ejercicio 
en el año 2022 se debería imprimir: Contigo desde hace: 22 anios
Parece claro que se deberá usar herencia para los productos. Por ejemplo, 
habrá bebidas, frutas y productos de higiene y cada uno tiene sus propias 
características, aunque también hay algunas comunes como la propiedad 
nombre.
• Para el precio del producto usad el tipo int ó INT.
• Para los litros de la bebida usad el tipo double ó Double.
• Los valores $ y ml se pueden concatenar después en la parte de impresión
 */

package ejercicio_metrica;

//Clase abstracta que no puede implementarse
public class productos implements Comparable<productos> {
	private String nombre;
	private int precio;
	public productos(String nombre, int precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	
	//Getter y Setter 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio() {
		this.precio=precio;
	}
	//Función compareTo que permite ordenar el arreglo de objetos de la clase productos
	@Override
	public int compareTo(productos o) {
		//Se transforma el objeto o de tipo Object a la clase productos
		productos otrosProductos=(productos)o;
		if(this.precio>otrosProductos.precio) return 1;
		if(this.precio<otrosProductos.precio) return -1;
		return 0;
	}
	
}
