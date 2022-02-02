

package examen_2019;
/*
 * Realizar un método que reciba como parámetro un ArrayList de cadenas y devuelva el total de vocales que almacenan, supones 
 * que todas las vocales son  minúsculas y sin acento.
 * 
 * static public int contarVocales(ArrayList <String>cadenas){
 * 
 * {
 * 
 * Ejemplo:
 * ArrayList<String>listaS=new ArrayList();
 * listaS.add("Hola");
 * listaS.add("Pepe");
 * contarVocales(listaS)->Devolverá el número 4
 */
import java.util.ArrayList;
import java.util.Scanner;

public class contarVocales {
	static Scanner sc=new Scanner(System.in);
	
	public static void contar(ArrayList lista) {
		//Variable que contiene las vocales
		String vocal="aeiou";
		int contador;
		for(int i=0;i<lista.size();i++) {
			contador=0;
			//Se recorre el arrayList y se cogen los datos con casting de String
			String palabra=(String) lista.get(i);
			System.out.println(palabra);
			//Se recorre la cadena y cada char se pasa a String
			for(int j=0;j<palabra.length();j++) {
				String caracter=String.valueOf(palabra.charAt(j));
				//Si vocal contiene el caracter se incrementa el contador
				if(vocal.indexOf(caracter)!=-1){
				contador++;
				
				}
			}
			System.out.println("Número de vocales: "+contador);
		}
		
		
	}
	public static void main(String[] args) {
		//Se crea ArrayList y se añaden datos
		ArrayList<String>lista=new ArrayList<String>();
		lista.add("holaa a a a");
		lista.add("hola mundo holita holaaaa");
		contarVocales.contar(lista);
	}

}
