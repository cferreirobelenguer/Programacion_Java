

package examen_ord;
/*
 * 
 *Realizar un método que reciba una matriz de enteros y me devuelva la suma de todos los
 *valores que no están en la diagonal (0,0),(1,1),(2,2). Se supone que la matriz es cuadrada,
 *tiene el mismo número de filas que de columnas.
 *
 */
public class sumaMatriz {
	static String cadena="";
	static public int calSumaSinDiagonal(int m[][]){
		cadena="";
		int suma=0;
		cadena+="NÚMEROS A SUMAR (";
		//filas
		for(int i=0;i<=m.length-1;i++) {
			//Columnas
				for(int j=0;j<m[i].length;j++) {
					//Si fila está en la posición 0 y columa en la posición 0 la variable suma no se incrementa
					if((i==0)&&(j==0)){
						suma=suma;
					//Si fila está en la posición 1 y columa en la posición 1 la variable suma no se incrementa
					}else
					if((i==1)&&(j==1)){
						suma=suma;
					//Si fila está en la posición 2 y columa en la posición 2 la variable suma no se incrementa
					}else
					if((i==2)&&(j==2)){
						suma=suma;
					//En caso contrario se produce la suma y la concatenación de los números a sumar de la matriz
					}else {
						cadena+=m[i][j]+",";
						suma+=m[i][j];
					}
				}
		}
		cadena+=") = ";
		return suma;
	}
	public static void main(String[] args) {
		int[][]m= {{2,3,1},{3,10,2},{0,2,5}};
		System.out.println(sumaMatriz.calSumaSinDiagonal(m));
		System.out.println(cadena);
		

	}

}
