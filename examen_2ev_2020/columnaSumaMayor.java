

package examen_2ev;
/*
 *  static int columnaSumaMayor( int matriz[][])
Devuelve el número de columna donde la suma de valores de dicha columna sea más alta (suma máxima).
Se supone todas filas son del mismo tamaño.
 Ej.- 
2 3 5 8
3 10 2 3
5 2 5 -7
 columnaSumaMayor ({{ 2,3,5,8}, {3,10,2,3}, {5,2,5,-7}}) → 1
 columnaSumaMayor ({{ -27, 0 , 5}, {30 ,10 ,25}}) → 2
 */
public class columnaSumaMayor {
	public static void columnaSumaMayor(int matriz[][]) {
		int pos=0;
		int maximoSuma=0;
		
		//Primera columna es el máximo provisional
		//Primero se lee la primera columna y se toma como referencia como la suma máxima
		//filas
		for(int i=0;i<matriz.length;i++) {
			//Se leen todas las filas de la columna 0
			maximoSuma+=matriz[i][0];
		}
		//Después se suman el resto de columnas y sumaaux son el resto de sumas 
		//columnas
		for(int j=1;j<matriz[0].length;j++) {
			int sumaaux=0;
			//Se lee todo el resto de los arrays
			//filas
			for(int i=0;i<matriz.length;i++) {
				sumaaux+=matriz[i][j];
			}
			//Se compara la suma máxima con el resto de sumas y se coge la posición máxima
			if(sumaaux>maximoSuma) {
				maximoSuma=sumaaux;
				pos=j;
			}
		}
		System.out.println(pos);
	}
	public static void main(String[] args) {
		int[][]matriz={{ 2,3,5,8},{3,10,2,3},{5,2,5,-7}};
		columnaSumaMayor.columnaSumaMayor(matriz);

	}

}
