

/*
 * Se pide realizar un programa en java que resuelva el siguiente problema:
 * Calcular las ventas totales al final del día, así como el porcentaje de ventas por bebidas
 * (códigos del 1 al 3), y por comidas (4-8). Se supone que a lo largo del día se introducen 
 * los códigos de consumiciones (a al 8) y que el valor cero indica que se cierra la caja y se
 * quiere obtener el cálculo. No hace falta mostrar un menú, solamente leer los valores de los
 * códigos (1-8) o el cero que implica mostrar los resultados.
 */

package ejercicios_ArrayList;
import java.util.*;

public class restaurante {
	static Scanner sc=new Scanner (System.in);
	//Variables estáticas de la clase válidas para cualquier función
	static double ventasBebidas = 0;
	static double ventasComidas=0;
	static double ventasTotales=0;
public static void introducirElementos(double [] lista,String[]descripcion,ArrayList totalPedido) {
	int pedido;
	int contador=0;
	
	
	
	//Si se introduce 0 quiere decir que se cierra la caja, con lo cual el número 0 entra como pedido en la lista
	//Se calcula el total de ventas de bebidas, comidas y totales a medida que se introducen datos
	
	do {
		System.out.println("Introduce código de pedido del 1 al 8");
		pedido=sc.nextInt();
		//Cuenta la cantidad de pedidos totales
		contador++;
		//Si el pedido es 0 no se incluye en la lista
		if((pedido>0)&&(pedido<=8)) {
			
			if((pedido>0)&&(pedido<=3)) {
				//Se descuenta una posición ya que las listas y arrays comienzan por la posición 0 no 1
				ventasBebidas+=lista[pedido-1];
				totalPedido.add(descripcion[pedido-1]);
				
			}else
			if((pedido>=4)&&(pedido<=8)) {
				//Se descuenta una posición ya que las listas y arrays comienzan por la posición 0 no 1
				ventasComidas+=lista[pedido-1];
				totalPedido.add(descripcion[pedido-1]);
				
			}
			//Se descuenta una posición ya que las listas y arrays comienzan por la posición 0 no 1
			ventasTotales+=lista[pedido-1];
		}
		//Cierre de caja
		if(pedido==0) {
			break;
		}
		
		
	}while(pedido!=0);
	
	//Total ventas
	System.out.println("Total de venta de Bebidas: "+ventasBebidas+"€");
	System.out.println("Total de venta de comidas: "+ventasComidas+"€");
	System.out.println("Total de venta: "+ventasTotales+"€");
	
}

public static void verTicket(ArrayList totalPedido) {
	//Se muestra la descripción de los productos en función del pedido realizado
	System.out.println("_______________________");
	System.out.println("TOTAL DE PEDIDOS DEL DÍA: ");
	
	for(int i=0;i<totalPedido.size();i++) {
		System.out.println(totalPedido.get(i));
	}
	System.out.println("_______________________");
	
	
}
public static void calcularPorcentajes() {
	//Se calculan los porcentajes de bebidas y comidas
	int porcentajeBebidas=0;
	int porcentajeComidas=0;
	porcentajeBebidas=(int) ((int)ventasBebidas*100/ventasTotales);
	porcentajeComidas=(int) ((int)ventasComidas*100/ventasTotales);
	
	//Porcentajes
	System.out.println("Porcentaje Bebidas: "+porcentajeBebidas+"%");
	System.out.println("Porcentaje comidas: "+porcentajeComidas+"%");
}
	

public static void main(String[] args) {
	//Se crea una lista donde se van a introducir la equivalencia de precios por código
	double[]lista= {2.00,1.50,1.75,2.00,2.75,2.00,2.60,3.00};
	
	//Array que contine la descripción de los alimentos y su posición+1 es el código del producto
	String[] descripcion= {"Refresco","Cerveza","Agua Mineral","Ensalada","Salchichas","Bocadillo","Sopa","Pastel"};
	//ArrayList que va a contener la descripción de los pedidos hechos en el día
	ArrayList<String>totalPedido=new ArrayList();
	restaurante.introducirElementos(lista,descripcion,totalPedido);
	restaurante.verTicket(totalPedido);
	restaurante.calcularPorcentajes();
	
	}
}
