
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 * 
 * Crear una superclase (abstracta) persona y una subclase usuario que hereda de persona. Los atributos de la superclase son telefono y apellidos la cual se pasa por parámetro
 * en el constrctor, y de la subclase genero,  llamadasRealizadas y totalWhastapp la cual se pasa por parámetro en el constructor únicamente el atributo apellidos de la superclase.
 * Se crea un atributo genero que sea o femenino o masculino aleatoriamente dentro del constructor, y un atributo telefono que está o apagado o encendido.
 * 
 * Crear una interfaz para llamar a los métodos encender y apagar y así definir al atributo telefono. 
 * Crear una interfaz Comparable que ordene por apellidos.
 * 
 *Crear dos métodos de llamar o mandar whatsapp que dan valores a los atributos del registro de Whatsapp y de llamadas.
 * En el test introducir los objetos en ArrayList y ordenar los resultados.
 * 
 * Introducir toString en las clases.
 * 
 * Imprimir los resultados del ArrayList ordenado en un archivo creado por BufferedWritter
 * 
 */
public class test {
static Scanner sc=new Scanner (System.in);

	public static void introducirDatos(ArrayList lista) throws IOException {
		//Método estático de la clase para escribir los datos del ArrayList en un fichero
		BufferedWriter out=null;
		out=new BufferedWriter(new FileWriter("C:/Users/Carol/Downloads/programa.txt"));
		
		for(int i=0;i<lista.size();i++) {
			out.write(lista.get(i).toString());
			out.newLine();
		}
		out.close();
	}

	public static void main(String[] args) throws IOException {
		/*
		 AÑADIR DATOS SIN LIMITE DE OBJETOS, EL LÍMITE LO PONE EL USUARIO
		System.out.println("Introduce el número de elementos a introducir: ");
		int elementos=sc.nextInt();
		ArrayList<chica>lista=new ArrayList<chica>();
		for(int i=0;i<elementos;i++) {
			
			System.out.println("Introduce apellidos");
			String apellidos=sc.next();
			lista.add(new chica(apellidos));
			
		}
		
		* 
		 */
		
		ArrayList<usuario>lista=new ArrayList<usuario>();
		usuario usuario1=new usuario("sanchez");
		usuario usuario2=new usuario("perez");
		usuario usuario3=new usuario("fernandez");
		
		usuario1.encender();
		usuario1.llamar();
		usuario1.mandarWhatsapp();
		usuario1.llamar();
		
		usuario2.llamar();
		usuario2.encender();
		usuario2.apagar();
		
		usuario3.encender();
		usuario3.llamar();
		usuario3.apagar();
		
		lista.add(usuario1);
		lista.add(usuario2);
		lista.add(usuario3);
		
		Collections.sort(lista);
		
		System.out.println("TOTAL DE DATOS: ");
		System.out.println("=================");
		System.out.println(lista.get(0));
		System.out.println("=================");
		System.out.println(lista.get(1));
		System.out.println("=================");
		System.out.println(lista.get(2));
		
		test.introducirDatos(lista);
	}

}
