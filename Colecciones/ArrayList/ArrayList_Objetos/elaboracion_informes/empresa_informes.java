package elaboracion_informes;
/*5) Un amigo funcionario nos pide que le hagamos 
 * un informe para sus informes. Debemos gestionar 
 * informes que están formados de un código numérico 
 * y una tarea que pueden ser ADMINISTRATIVO, EMPRESARIAL
 *  y PERSONAL. Debe comprobarse que la tarea es alguna de estas.
Nuestro amigo quiere que seamos capaz de agregar y eliminar
 informes en forma de pila (el último en entrar, es el primero
  en salir). Agrega 10 informes y muestra su contenido, elimina 
  todo el contenido y agrega de nuevo 5 informes. */
import java.util.ArrayList;
import java.util.Scanner;

public class empresa_informes {
	static Scanner sc=new Scanner(System.in);
	static String datos;
	static String codigo;
	//Variable global que lee el número total de informes que se van creando
	static int longitud;
	public static void elaborar(ArrayList informes_detallados,int veces) {
		int contador=0;
		//Se hacen los informes marcados por parámetro
		do {
		//datos aleatorios entre administrativo, empresarial y personal
		String[]palabras= {"ADMINISTRATIVO","EMPRESARIAL","PERSONAL"};
		int posicion_aleatoria=(int)Math.floor(Math.random()*palabras.length);
		datos=palabras[posicion_aleatoria];
		//Código formado por la primera letra de cada palabra en mayúscula
		//más número aleatorio de 10 a 50
		String msg="";
		msg+=String.valueOf(datos.charAt(0)).toUpperCase();
		codigo=msg+(int)Math.floor(Math.random()*(50-10)+10);
		
		//Se crea el objeto y se asignan las variables a los atributos
		informe ejemplar=new informe(codigo,datos);
		ejemplar.setCodigo(codigo);
		ejemplar.setDatos(datos);
		//Se añaden los datos al ArrayList
		informes_detallados.add(ejemplar);
		System.out.println("Informe elaborado correctamente");
		contador++;
		longitud++;
		}while(contador!=veces);
	}
	public static void borrar(ArrayList informes_detallados) {
		int contador1=0;
		//Se borran todos los informes
		int i=informes_detallados.size()-1;
		//Se borra todo
		while(contador1!=longitud) {
			informes_detallados.remove(i);
			i--;
			contador1++;
		};
		longitud=0;
		//Se elaboran 5 informes
		empresa_informes.elaborar(informes_detallados,5);
	}
	public static void recorrer(ArrayList informes_detallados) {
		int i=1;
		for(Object o:informes_detallados) {
			System.out.println("Informe número: "+i+"\n");
			i++;
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		//ArrayList de informes
		ArrayList<informe>informes_detallados=new ArrayList<>();
		System.out.println("Pulse 1 para elaborar 10 informes");
		System.out.println("Pulse 2 para eliminar todo el contenido y elaborar otros 5 informes");
		System.out.println("Pulse 3 para ver informes");
		int contador=0;
		int opcion=0;
		
		do {
			System.out.println("Elija una opción: ");
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Ha elegido la opción de elaborar 10 informes");
				empresa_informes.elaborar(informes_detallados,10);
				contador++;
			break;
			case 2:
				System.out.println("Ha elegido la opción de borrar todo contenido y elaborar 5 informes");
				empresa_informes.borrar(informes_detallados);
				contador++;
			break;
			case 3:
				System.out.println("Ha seleccionado ver informes");
				empresa_informes.recorrer(informes_detallados);
			break;
			default:
				System.err.println("La opción elegida no es válida");
			}
		}while(contador!=5);
	}

}
