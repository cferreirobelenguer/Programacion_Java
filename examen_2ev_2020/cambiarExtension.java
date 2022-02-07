

package examen_2ev;

import java.util.Scanner;

/*
 * ) static String cambiarExtensión ( String nombrefichero, String nuevaExtension)
Devuelve un nuevo string con el valor del nombre del fichero sustituyendo su extensión .algo por la nueva
extensión. ( Puede ocurrir que el nombre de fichero no tenga extensión previa, ) 
Ej.-
 cambiarExtensión ("programa.java","php") devuelve "programa.php" →
 cambiarExtensión ("mensaje.info.txt","html") devuelve "mensaje.info.html" →
 cambiarExtensión ("canción","mp3") devuelve "canción.mp3"
 */
public class cambiarExtension {
static Scanner sc=new Scanner(System.in);

	public static void cambiar(String mensaje,String archivo) {
		int posicion=0;
		
		//Primero se busca el punto recorriendo por atrás, ya que se tiene en cuenta el segundo punto, no el primero
		for(int i=archivo.length()-1;i>=0;i--) {
			//Si se encuentra el punto se coge la posición
			if(archivo.charAt(i)=='.') {
				posicion=i;
				break;
			}
		}
		//Se consigue el nombre cortando desde la posición 0 hasta el punto
		String nombre=archivo.substring(0,posicion);
		//Se concatena nombre +.+extension
		String nuevo=nombre+"."+mensaje;
		System.out.println(nuevo);
	}
	public static void main(String[] args) {
		String archivo="programa.html";
		System.out.println("Introduce una extension");
		String mensaje=sc.nextLine();
		cambiarExtension.cambiar(mensaje, archivo);

	}

}
