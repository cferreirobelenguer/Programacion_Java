/*
*Crear una clase llamada Estudiante con 3 campos (atributos). Estos serán nombre, edad y curso (donde el nombre
será un String, la edad un int y el curso un int con valores entr 1 y 5 que representan desde el primer curso
hasta el quinto).
En una clase con el main crea un Array de 5 estudiantes. Usando Comparable establece un orden basado en la edad.
Muestra por consola la lista ordenada.
*
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {

	public static void main(String[] args) {
		// Se crea un array de objetos
		Estudiante[]lista=new Estudiante[5];
		lista[0]=new Estudiante("Pablo",15,1);
		lista[1]=new Estudiante ("Veronica",20,4);
		lista[2]=new Estudiante ("Carla",16,3);
		lista[3]=new Estudiante ("Noa",13,1);
		lista[4]=new Estudiante ("Noemi",21,5);
		//Se muestra la lista desordenada
		   System.out.println(Arrays.toString(lista));
		//Se ordena la lista por edad de forma ascendente
		Arrays.sort(lista);
		System.out.println("______________");
		for(Estudiante i:lista) {
			System.out.println(i.getNombre()+": ");
			System.out.println(i.toString());
			System.out.println("______________");
		}
		//Muestra la mayor y menor edad
		System.out.println("El alumno con menor edad es "+lista[0].getNombre()+ "con la edad de "+lista[0].getEdad()+" años");
		System.out.println("El alumno con mayor edad es "+lista[lista.length-1].getNombre()+" con la edad de "+lista[lista.length-1].getEdad()+" años");
		//Se añaden profesores al ArrayList
		ArrayList <Profesores> lista2=new ArrayList<Profesores>();
		lista2.add(new Profesores("Vicente", 1));
		lista2.add(new Profesores("Manuela",4));
		lista2.add(new Profesores("Pepe",5));
		lista2.add(new Profesores("Antonia",1));
		lista2.add(new Profesores("Michele",2));
		lista2.add(new Profesores("Paco",5));
		
		//Se quiere ordenar el ArrayList de objetos por orden alfabético de nombre
		Collections.sort(lista2);
		System.out.println("___________");
		//Se muestran los resultados
		for(Profesores i:lista2) {
			System.out.println(i.toString());
			System.out.println("___________");
		}
	}

}
