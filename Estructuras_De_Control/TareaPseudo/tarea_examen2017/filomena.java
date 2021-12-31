
package examen2017_;
import java.util.*;
/*6.  Realizar un programa en Java que lea las 31 
 * temperaturas medias de cada uno de los día de mes 
 * de enero.  El programa tiene que informar:
a) Cual ha sido la temperatura mínima y en que día del mes
b) Cual ha sido la temperatura máxima y en que día del mes
c) Cuantos días  la temperatura media ha sido inferior a cero
e) Indicar si se ha producido una  filomena, para ello se 
debe de haber producido por lo menos 5 días consecutivos 
con temperaturas medias inferiores a 0 grados.
 */
public class filomena {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce temperaturas durante el mes de enero");
		int ntemperaturas=31;
		int temperatura;
		int contador=0;
		int max=0;
		int min=0;
		int diamax=0;
		int diamin=0;
		int contadorBajo0=0;
		int contadorDiasSeguidos=0;
		boolean filomena=false;
		
		
		while(contador!=ntemperaturas) {
			temperatura=sc.nextInt();
			if(contador==1) {
				max=temperatura;
				min=temperatura;
				diamax=diamin=1;
			}else {
				if(temperatura>max) {
					diamax=contador;
					max=temperatura;
				}else if(temperatura<min) {
					diamin=contador;
					min=temperatura;
				}
			}
			if(temperatura<0) {
				contadorBajo0++;
				contadorDiasSeguidos++;
				if(contadorDiasSeguidos>5) {
					filomena=true;
				}
			}
			contador++;
		}
		if(filomena==true) {
			System.out.println("Se ha producido filomena");
		}
		System.out.println("Días bajo 0: "+contadorBajo0);
		System.out.println("Temperatura máxima: "+max+" el día "+diamax);
		System.out.println("Temperatura mínima: "+min+" el día "+diamin);
		
	}

}
