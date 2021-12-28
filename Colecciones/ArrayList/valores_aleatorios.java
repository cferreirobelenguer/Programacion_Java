package ejercicios_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

/* Realizar un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego realice las siguientes operaciones: mostrar el 
 * contenido, calcular la suma, borrar aquellos números que serán pares y volver
 * a mostrar el contenido, reemplazar los números divisibles por 3 con el valor 0
 * y volver a mostrar el contenido, por último si aparece un valor divisible entre
 * cinco, insertar en la posición anterior el valor 555 y volver a mostrar 
 * el contenido. 
 * El tamaño de la lista también será aleatorio y podrá oscilar entre 10 y 20
 * elementos ambos inclusive.
 * 
 */
public class valores_aleatorios {
	static int tamano;
	public static void insertarNumeros(ArrayList lista) {
		//Tamaño de lista aleatorio de 10 a 20
		tamano=(int) (Math.random()*20)+10;
		System.out.println("Tamaño: "+tamano);
		int contador=0;
		do {
			//Se introducen 100 números aleatorios en la lista
			lista.add((int)Math.floor(Math.random()*100));
			contador++;
		}while(contador!=tamano);
		
	}
	public static void calcularSuma(ArrayList lista) {
		//calculamos la suma recorriendo la lista con un for
		int suma=0;
		String msg="";
		msg+="El contenido del ArrayList es:\n";
		for(int i=0;i<lista.size();i++) {
			int numero=(int)lista.get(i);
			suma+=numero;
			msg+=numero+" ";
		}
		System.out.print(msg);
		System.out.println("Suma: "+suma);
	}
	public static void borrarPares(ArrayList lista) {
		//Eliminamos los pares con iterator
		Iterator<Integer> iterator=lista.iterator();
		while(iterator.hasNext()) {
			if(iterator.next()%2==0) {
				iterator.remove();
			}
		}
		System.out.println("Eliminamos posiciones de divisibles entre dos: ");
		System.out.println(lista);
	}
	public static void cambiardivisibles3(ArrayList lista) {
		//Se cambian los divisibles de 3 a 0
		for(int i=0;i<lista.size();i++) {
			if((int)lista.get(i)%3==0) {
				lista.set(i, 0);
			}
		}
		System.out.println("Cambiamos divisibles de 3 por 0:");
		System.out.println(lista);
	}
	public static void divisible5(ArrayList lista) {
		for(int j=0;j<lista.size();j++) {
			if(((int)lista.get(j)%5==0)&&((int)lista.get(j)!=0)) {
				//Se hace el cambio a 555 en la posición anterior a la divisible de 5
				lista.set(j, 555);
				
			}
		}
		System.out.println("Cambiamos la posición de divisibles de 5 por 555:");
		System.out.println(lista);
	}
	public static void main(String[] args) {
		ArrayList<Integer>lista=new ArrayList<>();
		valores_aleatorios.insertarNumeros(lista);
		valores_aleatorios.calcularSuma(lista);
		valores_aleatorios.borrarPares(lista);
		valores_aleatorios.cambiardivisibles3(lista);
		valores_aleatorios.divisible5(lista);
	}

}
