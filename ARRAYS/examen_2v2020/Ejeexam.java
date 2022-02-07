
package ejercicio_tienda;

public class ejercicio1 {
	//Realizar un seguimiento e indicar cual es la salida del siguiente programa
	public static void main(String[] args) {
		int num1=10;
		int suma1=0;
		int suma2=0;
		
		for(int i=0;i<num1;i+=2) {
			int resto=i%3;
			switch(resto) {
			case 0: suma1++;
			case 1: suma2++;break;
			case 2: suma1++;break;
			default: suma1=0;
			}
			if(suma2==3)break;
		}
		
		System.out.println(suma1);
		System.out.println(suma2);
		//La salida es 3 en suma1 / 3 en suma 2
	}

}
