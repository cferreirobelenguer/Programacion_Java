

package examen_2019;
/*
 * 
 * . Codificar una clase denominada Vehículo donde queremos almacenar los atributos privados:  matrícula (String) 
 * y  número de veces que se ha prestado, y si el estado actual del vehículo es  prestado o disponible. 
 * La clase tendrá además un constructor, que recibe como único parámetro la matricula, y los métodos públicos boolean alquilar(),
 *  void devolver() y String toString().  Si está prestado no se puede volver a prestar. El método toString devolverá la cadena con
 *   la matrícula, si esta prestado o no y el número de veces que se ha prestado. ¿Si queremos  almacenar esta clase en un HashMap 
 *   como deberíamos definir esta colección, pon un ejemplo de declaración? ¿Si queremos poder utilizar el método sort de la clase 
 *   Collections o Arrays que deberíamos incluir en la clase Vehículo?
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class testVehiculos {

	public static void main(String[] args) {
		//Se crean los objetos
		Vehiculo coche1=new Vehiculo("SEAT");
		Vehiculo coche2=new Vehiculo("CITROEN");
		Vehiculo coche4=new Vehiculo ("FIAT");
		Vehiculo coche5=new Vehiculo ("FORD");
		
		System.out.println("PRÉSTAMOS Y DEVOLUCIONES:");
		//Préstamos y devoluciones de los vehículos
		coche1.alquilar();
		//Debe dar error porque ya está alquilado
		coche1.alquilar();
		
		coche1.devolver();
		
		coche2.alquilar();
		coche2.devolver();
		
		coche4.alquilar();
		coche4.devolver();
		
		coche1.alquilar();
		coche1.devolver();
		
		coche5.alquilar();
		
		
		
		//Datos de los coches sin ordenar
		System.out.println("===================");
		System.out.println("DATOS DE LOS VEHÍCULOS: ");
		System.out.println(coche1.toString());
		System.out.println(coche2.toString());
		System.out.println(coche4.toString());
		System.out.println(coche5.toString());
		System.out.println("===================");
		
		//Se crea un HashMap donde se van a almacenar la matricula y el número de veces que se presta el vehículo
		HashMap<String,Vehiculo>listado=new HashMap<>();
		//Se introducen los datos de matriícula y veces prestado en HashMap
		listado.put(coche1.getMatricula(),coche1);
		listado.put(coche2.getMatricula(),coche2);
		listado.put(coche4.getMatricula(),coche4);
		listado.put(coche5.getMatricula(),coche5);
		
		//También se podía haber ordenado el map sin compareTo usando un TreeMap
		/*
		 * TreeMap<String,Vehiculo> ordenado=new TreeMap<>(listado);
		 * 
		 * Set<Entry<Integer,Vehiculo>> vervalores=ordenado.entrySet();
		 * 
		 * int i=0;
		 * for(Entry<String,Vehiculo> v:vervalores){
		 * 		System.out.println(v.getValue();
		 * }
		 */
		//Contenido del mapa
		System.out.println(listado);
		
		String[] valores=new String[listado.size()];
		//Se introducen las claves en un array de string
		valores=listado.keySet().toArray(valores);
		//Se ordena por matricula en ordena alfabético por la interfaz Comparable
		Arrays.sort(valores);
		//Se muestran los valores sin ordenar
		System.out.println(Arrays.toString(valores));
		//Se muestran los valores ya ordenador
		System.out.println(Arrays.toString(valores));
		
		

	}

}
