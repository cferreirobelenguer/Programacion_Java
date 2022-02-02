

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
		String vocal="aeiou";
		int contador;
		for(int i=0;i<lista.size();i++) {
			contador=0;
			String palabra=(String) lista.get(i);
			System.out.println(palabra);
			for(int j=0;j<palabra.length();j++) {
				String caracter=String.valueOf(palabra.charAt(j));
				if(vocal.indexOf(caracter)!=-1){
				int num=vocal.indexOf(palabra);
				//System.out.println(num);
				contador++;
				
				}
			}
			
			
			System.out.println("Número de vocales: "+contador);
		}
		
		
	}
	public static void main(String[] args) {
		
		ArrayList<String>lista=new ArrayList<String>();
		lista.add("holaa a a a");
		lista.add("hola mundo holita holaaaa");
		contarVocales.contar(lista);
	}

}
