package ordenarAviones;
/*Crear un ArrayList de aviones y ordenarlos de menor a mayor
 * Un avión es mayor que otro cuando su velocidad es mayor. */
import java.util.ArrayList;
import java.util.Collections;

public class ordenamosAviones {
	public static void anadir(ArrayList listadoAviones) {
		//Agregamos los datos
		listadoAviones.add(new aviones("Boing 123",100,600));
		listadoAviones.add(new aviones("Boing 456",200,200));
		listadoAviones.add(new aviones("Boing 789",300,400));
		//Recorremos la lista sin ordenar
		for(Object o:listadoAviones) {
			System.out.println(o);
		}
	}
	public static void ordenar(ArrayList listadoAviones) {
		Collections.sort(listadoAviones);
		//Verificamos que se ha ordenado los aviones de menor a mayor velocidad
		for(Object o:listadoAviones) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		//ArrayList de aviones
		ArrayList<aviones>listadoAviones=new ArrayList<>();
		ordenamosAviones.anadir(listadoAviones);
		ordenamosAviones.ordenar(listadoAviones);
	}

}
