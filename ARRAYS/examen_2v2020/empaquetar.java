
package ejercicio_tienda;

import java.util.Arrays;

/*
 * Realizar un método que procese una tabla y ponga todos los valores igual a 0
 * al final de la tabla, para que no existan valores intermedios con el valor 0
 * 
 * static void empaquetar(int tabla[])
 * 
 * Ej.
 * miTabla->{10,3,0,1,4,0,0,9,32,0};
 * miTabla->{10,3,32,1,4,9,0,0,0,0}
 * 
 * Da igual que los números queden desordenados. NO SE DEBE UTILIZAR UNA TABLA AUXILIAR
 */
public class empaquetar {
	public static void empaqueta(int[]miTabla) {
		boolean hay=false;
		do {
			hay=false;
		for(int i=0;i<miTabla.length-1;i++) {
			if((miTabla[i]==0)&&(miTabla[i+1]!=0)){
				miTabla[i]=miTabla[i+1];
				miTabla[i+1]=0;
				hay=true;
			}
		}
		}while(hay==true);
		System.out.println(Arrays.toString(miTabla));
	}
	public static void main(String[] args) {
		int[]miTabla={10,3,0,1,4,0,0,9,32,0};
		empaquetar.empaqueta(miTabla);
		

	}

}
