package examen_2020;

import java.util.Scanner;
/*
 * Se pide realizar un programa en java que resuelva el siguiente problema:
 * Calcular las ventas total al final del día, así como el porcentaje de ventas
 * por bebidas (códigos 1 a 3) y por comidas (4-8). Se supone que a lo largo del día
 * se introducen los códigos de consumiciones (1a 8) y que el valor cero indica que se quiere
 * se cierra la caja y se quiere obtener el cálculo. No hace falta mostrar un menú, solamente
 * leer los valores de los códigos (1,8) o el cero que implica mostrar los resultados.
 * 
 * Introduzca los pedidos, pulse 0 para terminar:
 */
public class restaurante {
static Scanner sc=new Scanner(System.in);

static int contadorTotal = 0;
static double precioBebidas=0;
static double precioComidas=0;
static double total=0;
static double precio=0;

	public static void introducirCodigos() {
		
		int num;
		
		//Se introducen códigos del 1 al 8  y según el código se asigna una descripcion y un precio
		do{
			num=sc.nextInt();
			contadorTotal++;
			//El código introducido por el cliente debe ser entre 1 a 8
			if((num>=1)&&(num<=8)) {
				switch(num) {
				case 1:
					precio=2.00;
					calcularBebidas();
				break;
				case 2:
					precio=1.50;
					calcularBebidas();
				break;
				case 3:
					precio=1.75;
					calcularBebidas();
					
				break;
				case 4:
					precio=2.00;
					calcularComidas();
				break;
				case 5:
					precio=2.75;
					calcularComidas();
				break;
				case 6:
					precio=2.00;
					calcularComidas();
				break;
				case 7:
					precio=2.60;
					calcularComidas();
				break;
				case 8:
					precio=3.00;
					calcularComidas();
				break;
				}
			}
		}while(num!=0);
	}
	public static void calcularBebidas() {
		precioBebidas+=precio;
		total+=precio;
	}
	public static void calcularComidas() {
		precioComidas+=precio;
		total+=precio;
	}
	public static String datos() {
		//Calcula porcentajes y muestra el precio total
		int porcentajeBebidas=(int) (precioBebidas*100/total);
		int porcentajeComidas=(int) (precioComidas*100/total);
		return "Total de ventas: "+total+"Euros \n "+porcentajeBebidas+"% Bebidas \n "+porcentajeComidas+"% Comidas";
	}
	public static void main(String[] args) {
		System.out.println("Introduzca los pedidos y pulse 0 para terminar");
		restaurante.introducirCodigos();
		System.out.println(restaurante.datos());

	}

}
