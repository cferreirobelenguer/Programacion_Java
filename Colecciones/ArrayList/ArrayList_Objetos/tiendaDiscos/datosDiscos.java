

package tiendaDiscos;
/* Realizar una colección de discos, cogiendo datos de 
 * título, autor, género y duración e insertarlos en una
 * lista. Permitir al programa agregar datos, mostrar datos,
 * modificar o eliminar.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class datosDiscos {
	static Scanner sc=new Scanner(System.in);
	static String titulo;
	static String autor;
	static String genero;
	static int duracion;
	
	public static void anadir(ArrayList album) {
		//Función para añadir datos
		//Cogemos los datos
		System.out.println("Introduce titulo");
		titulo=sc.next();
		System.out.println("Introduce autor");
		autor=sc.next();
		System.out.println("Introduce genero");
		genero=sc.next();
		System.out.println("Introduce duración");
		duracion=sc.nextInt();
		//Creamos objeto enlazado con la clase Disco
		Disco discos=new Disco(titulo,autor,genero,duracion);
		//Asignamos los datos introducidos con los atributos del objeto
		discos.setTitulo(titulo);
		discos.setGenero(genero);
		discos.setAutor(autor);
		discos.setDuracion(duracion);
		//Y los añadimos al arrayList
		album.add(discos);
		
	}
	public static void verDatos(ArrayList album) {
		//Recorremos los datos de album
		for(Object d:album) {
			System.out.println(d);
		}
		
	}
	public static void modificar(ArrayList album) {
		//Función para modificar datos
		//Recogemos los datos y la posición que queremos modificar
		System.out.println("Introduce la posición");
		int posicionmodifi=sc.nextInt();
		
		System.out.println("Introduce titulo");
		titulo=sc.next();
		System.out.println("Introduce autor");
		autor=sc.next();
		System.out.println("Introduce genero");
		genero=sc.next();
		System.out.println("Introduce duración");
		duracion=sc.nextInt();
		//Creamos objeto
		Disco discos=new Disco(titulo,autor,genero,duracion);
		//Asignamos datos a los atributos del objeto
		discos.setTitulo(titulo);
		discos.setGenero(genero);
		discos.setAutor(autor);
		discos.setDuracion(duracion);
		//Modificamos el ArrayList partiendo de la posición elegida
		album.set(posicionmodifi,discos);
		
		
	}
	public static void eliminar(ArrayList album) {
		//Función para eliminar datos
		//Se introduce la posición que se quiere eliminar
		System.out.println("Introduce la posición");
		int posicion=sc.nextInt();
		//Se elimina por la posición el elemento del ArrayList
		album.remove(posicion);
		
	}
	public static void main(String[] args) {
		int contador=0;
		//ArrayList discos
		ArrayList<Disco>album=new ArrayList<>();
		//Menú
		System.out.println("Binvenido a la tienda de discos:");
		System.out.println("Pulse 1 para añadir un disco");
		System.out.println("Pulse 2 para eliminar un disco");
		System.out.println("Pulse 3 para ver discos");
		System.out.println("Pulse 4 para modificar discos");
		System.out.println("Pulse 5 para salir del sistema");
		do {
		System.out.println("Elija una opción en la tienda de discos:");
		
		int opcion=sc.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Ha seleccionado añadir un disco");
			datosDiscos.anadir(album);
			contador++;
		break;
		case 2:
			System.out.println("Ha seleccionado eliminar un disco");
			datosDiscos.eliminar(album);
			contador++;
		break;
		case 3:
			System.out.println("Ha elegido ver discos");
			datosDiscos.verDatos(album);
			contador++;
			
		break;
		case 4:
			System.out.println("Ha elegido modificar discos");
			datosDiscos.modificar(album);
		break;
		case 5:
			System.out.println("Ha elegido salir del sistema");
			System.exit(0);
		break;
		default:
			System.out.println("La opción introducida no es válida");
			contador++;
			}
		}while(contador!=5);
	}

}
