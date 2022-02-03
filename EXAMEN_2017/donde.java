package examen_2020;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * realizar una función Java dondeEsta (char c,String s) que reciba como parámetro
 * un String y un carácter e indique en qué posición se encuentra o devuelva -1 en
 * el caso que la letra no aparezca.
 * 
 * dondeEsta ('a',"Hola")->Devuelve 3
 * dondeEsta ('x',"Hola")->Devuelve -1
 */
public class donde {
static Scanner sc=new Scanner (System.in);
	
	public static void dondeEsta(String cadena, char caracter,ArrayList lista) {
		String msg="";
		String caracter_=String.valueOf(caracter);
		int posicion=cadena.indexOf(caracter_);
		
		
		while(posicion!=-1) {
			lista.add(posicion);
			posicion=cadena.indexOf(caracter_,posicion+1);
			
		}
		for(int j=0;j<lista.size();j++) {
			if((int)lista.get(j)==-1) {
				System.out.print(-1);
			}else {
				System.out.print(lista.get(j)+" ");
			}
			
		}
		if(lista.size()==0) {
			System.out.println(-1);
		}
		
	}
	public static void main(String[] args) {
		ArrayList <Integer>lista=new ArrayList<>();
		System.out.println("Introduce una cadena");
		String cadena=sc.nextLine();
		System.out.println("Introduce un caracter");
		char caracter=sc.next().charAt(0);
		donde.dondeEsta(cadena, caracter,lista);
	}

}
