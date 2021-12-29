import java.util.Scanner;
/* 
 * EJERCICIO EXAMEN 2020 FEBRERO
 * El menú de un restaurante rápido es:
	       
Códigos	Descripción y precios
1	Refresco ........................2.00
2	Cerveza...........................1.50
3	Agua Mineral.................1.75
4	Ensalada..........................2.00
5	Salchichas.......................2.75
6	Bocadillo .........................2.00
7	Sopa .................................2.60
8	Pastel................................3.00 .

Se pide realizar un programa en java que resuelva el siguiente problema: Calcular  las ventas totales al final del día, así como el porcentaje de ventas por bebidas (códigos 1 a 3) y por comidas (4-8). Se supone que a lo largo del día se introducen los códigos de consumiciones (1 a 8) y que el valor cero indica que se quiere se cierra la caja y se quiere obtener el cálculo. No hace falta mostrar un menú, solamente leer los valores de los códigos (1-8) o el cero que implicar mostrar los resultados.

Introduzca los pedidos, pulse 0 para terminar:
1 4 5  4 2 4 6 7 5 1 1 1 1 3 4 6 7….. 8  7 0
Total de ventas :   1234.33  Euros
53.2 % Bebidas         46.8 % Comidas


*/
public class restaurante {
	static Scanner sc=new Scanner(System.in);
	static double precioTotal = 0;
	static int contadorTotal=0;
	static int contadorBebidas=0;
	static int contadorComidas=0;
	public static void anadir() {
		double precio = 0;
		
		int codigo;
		do {
			codigo=sc.nextInt();
			switch(codigo) {
			case 1:
				precio=2.00;
				contadorBebidas++;
				contadorTotal++;
			break;
			case 2:
				precio=1.50;
				contadorBebidas++;
				contadorTotal++;
			break;
			case 3:
				precio=1.75;
				contadorBebidas++;
				contadorTotal++;
			break;
			case 4:
				precio=2.00;
				contadorComidas++;
				contadorTotal++;
			break;
			case 5:
				precio=2.75;
				contadorComidas++;
				contadorTotal++;
			break;
			case 6:
				precio=2.00;
				contadorComidas++;
				contadorTotal++;
			break;
			case 7:
				precio=2.60;
				contadorComidas++;
				contadorTotal++;
			break;
			case 8:
				precio=3.00;
				contadorComidas++;
				contadorTotal++;
			break;
			}
			precioTotal+=precio;
			
			
			if(codigo==0) {
				break;
			}
		}while(codigo!=0);
	}
	public static void calcularPorcentajeBebidas() {
		//System.out.println(contadorBebidas);
		double porBebidas=contadorBebidas*100/contadorTotal;
		System.out.println(porBebidas+"% Bebidas");
	}
	public static void calcularPorcentajeComidas() {
		//System.out.println(contadorComidas);
		double porComidas=contadorComidas*100/contadorTotal;
		System.out.println(porComidas+"% Comidas");
	}
	public static void main(String[] args) {
		System.out.println("Menú de restaurante de comida rápida");
		System.out.println("1. Refresco 2.00 €");
		System.out.println("2. Cerveza 1.50 €");
		System.out.println("3. Agua Mineral 1.75 €");
		System.out.println("4. Ensalada 2.00 €");
		System.out.println("5. Salchichas 2.75 €");
		System.out.println("6. Bocadillo 2.00");
		System.out.println("7. Sopa 2.60 €");
		System.out.println("8. Pastel 3.00 €");
		restaurante.anadir();
		System.out.println("Total de ventas: "+precioTotal+"€");
		restaurante.calcularPorcentajeBebidas();
		restaurante.calcularPorcentajeComidas();
		System.out.println(contadorTotal);
		
		
	}

}
