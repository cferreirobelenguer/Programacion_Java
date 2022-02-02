
/*EXAMEN PARCIAL COLECCIONES 3 EV 2021
 * 
 * Crear una clase que defina el tipo objeto que indique el profesor. Disco.java, Pelicula.java, Empleado.java. Esta clase
 * debe contener 4 atributos como mínimo: un atributo de tipo integer que sirva para identificar el objeto y otros 3 atributos con el nombre
 * y tipo que se elija nombre, precio, año, edad, etc.
 * Crear una clase Principal.java que incluya el método main que realice las siguientes operaciones:
 * 	1. Almacene en un ArrayList un total de 6 objetos de la primera clase
 * 	2. Mostrar el primero y el último objeto introducido accediendo al ArrayList
 * 	3.Eliminar los objetos que cumplen una determinada condición de alguno de sus atributos: precio<0, aó>200,nombre.charAr(0)=='A'
 * 	4.Ordenar los objetos por identificador y mostrar todos los valores del ArrayList
 * 	5.Crear un HashMap y almacenar los valores del ArrayList en el HashMap fijando como clave el identificador del objeto
 * 	6. Solicitar al usuario el identificador de un objeto y buscar el HashMap el identificador, mostrando la información del objeto
 * 	o un mensaje de error en el caso de que no se encuentre.
 */

package examen_Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Principal {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ErrorId {
		
		ArrayList <Pelicula> lista=new ArrayList<>();
		lista.add(new Pelicula(1,"Mar adentro",2001,critica.BUENA));
		lista.add(new Pelicula(2,"Los otros",2001,critica.BUENA));
		lista.add(new Pelicula(3,"Abre los ojos",1997,critica.REGULAR));
		lista.add(new Pelicula(4,"Tesis",1994,critica.MALA));
		lista.add(new Pelicula(5,"Agora",2009,critica.REGULAR));
		lista.add(new Pelicula(6,"Spanish Movie",2009,critica.MALA));
		
		//Se muestra el primer y el último objeto introducido
		System.out.println("================================================");
		System.out.println("Primer y último dato introducido en el ArrayList: ");
		System.out.println("================================================");
		System.out.println("Primer dato introducido: "+lista.get(0).toString());
		System.out.println("Último dato introducido: "+lista.get(lista.size()-1).toString());
		System.out.println("================================================");
		
		//Eliminar las películas del año 1994
		
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getAnio()==1994) {
				lista.remove(i);
			}
		}
		
		//Se ordena el ArrayList por id y se muestran los resultados
		Collections.sort(lista);
		System.out.println("================================================");
		for(Pelicula p: lista) {
			System.out.println(p.toString());
		}
		System.out.println("================================================");
		
		//Se crea un hashMap cuya clave es el id de la pelicula y el valor es el objeto
		HashMap<Integer,Pelicula>listado=new HashMap<>();
		//Se añaden los datos del ArrayList en hashMap
		for(int k=0;k<lista.size();k++) {
			listado.put(lista.get(k).getId(),lista.get(k));
		}
		
		//System.out.println(listado);
		
		//Se pide un id, en caso de que no esté comprendido entre 0 y la longitud del arreglo se genera una excepción
		//Si es correcto se muestra el valor de esa clave
		System.out.println("Introduce un id");
		int num=sc.nextInt();
		if((num<0)||(num>lista.size())){
			throw new ErrorId(num);
		}
		boolean noEncontrado=false;
		Set<Integer>indice=listado.keySet();
		for(Integer j:indice) {
			//System.out.println(j);
			if(num==j) {
				noEncontrado=true;
				System.out.println(listado.get(j));
			}
		}
		
		if(noEncontrado==true) {
			System.out.println("Id encontrado");
		}
	}

}
