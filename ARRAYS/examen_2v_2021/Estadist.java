import java.util.Arrays;

public class Estadist {
	/*
	 * Elaborar un programa en java denominado Estadist.java  que almacene en un vector 10 número generados 
	 * aleatoriamente entre 10 y 100, ordene a continuación en vector, y muestre finalmente el valor máximo y el mínimo. 
	 */
	public static void generar(int[]numeros) {
		int contador=0;
		
		do {
			for(int i=0;i<numeros.length;i++) {
				numeros[i]=(int)Math.floor(Math.random()*(100-1)+1);
			}
			contador++;
		}while(contador!=10);
	}
	public static void calcular(int[]numeros) {
		int max=numeros[0];
		int min=numeros[0];
		for(int j=0;j<numeros.length;j++) {
			if(numeros[j]>max) {
				max=numeros[j];
			}else if(numeros[j]<min) {
				min=numeros[j];
				
			}
		}
		System.out.println(Arrays.toString(numeros));
		System.out.println("Máximo: "+max);
		System.out.println("Mínimo: "+min);
	}
	public static void main(String[] args) {
		
		int[]numeros=new int[10];
		Estadist.generar(numeros);
		Estadist.calcular(numeros);
		

	}

}
