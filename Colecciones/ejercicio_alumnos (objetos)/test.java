

package alumnos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test {
	static Scanner sc=new Scanner(System.in);
	static String nombre="";
	static String nacionalidad="";
	public static void addAlumno(ArrayList lista) {
		System.out.println("Introduce nombre");
		nombre=sc.next();
		System.out.println("Introduce nacionalidad");
		nacionalidad=sc.next();
		lista.add(new Alumno(nombre,nacionalidad));
	}
	
	public static void mostrarLongitud(ArrayList lista) {
		System.out.println("Número de alumnos: "+lista.size());
	}
	public static void showAll(ArrayList lista) {
		for(Object i:lista) {
			System.out.println(i);
		}
	}
	public static void ordenar(ArrayList lista) {
		//Se ordena el array por nacionalidades
		Collections.sort(lista);
	}
	
	public static void main(String[] args) {
		ArrayList <Alumno> lista=new ArrayList<Alumno>();
		System.out.println("Introduce el número de elementos a introducir");
		int contador=0;
		int veces=sc.nextInt();
		do {
			test.addAlumno(lista);
			contador++;
			
		}while(contador!=veces);
		
		test.mostrarLongitud(lista);
		test.ordenar(lista);
		test.showAll(lista);
		
		
		
		//Eliminar nacionalidad
		System.out.println("Introduce nacionalidad a eliminar");
		nacionalidad=sc.next();
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).nacionalidad.equals(nacionalidad)) {
				System.out.println(lista.get(i).nacionalidad);
				lista.remove(i);
			}
		}
		test.showAll(lista);
	}

}
