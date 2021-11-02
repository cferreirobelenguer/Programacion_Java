/* Programa que simula un asistente de voz que te contesta una serie de palabras guardadas en una lista si 
el usuario escribe una serie de frases,con Adiós se cierra el programa*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class ProgramaEliza {
	static Scanner sc=new Scanner(System.in);
	

	public static void recorrerEliza() {
		
		String clave_;
		String valor="";
		String resultado="";
		boolean encontrado=false;
		boolean fin=false;
	
		
		String clave=sc.next();
		
		HashMap<String,String>Eliza=new HashMap<>();
		Eliza.put("Hola", "Hola,¿qué tal?");
		Eliza.put("Encantado", "Encantado de conocerte yo también");
		Eliza.put("Adiós", "Adiós,espero volverte a ver pronto");
		Eliza.put("Hora", "Lo siento, no llevo reloj");
		Eliza.put("Nombre", "Mi nombre es Eliza");
		Set<Map.Entry<String,String>>entries=Eliza.entrySet();
		Iterator<Map.Entry<String, String>>conver=entries.iterator();
		while(conver.hasNext()) {
			Map.Entry<String, String>next=conver.next();
			clave_=next.getKey();
			if(clave.equals(clave_)) {
				valor=next.getValue();
				System.out.println(valor);
				encontrado=true;
				  if ( clave.contentEquals("Adiós")){
	                    fin = true;
	                }
				  break;
			}
		
		}
		if(!encontrado) {
			
			System.out.println("Lo siento, no te entiendo");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		ProgramaEliza.recorrerEliza();
		
	}

}
