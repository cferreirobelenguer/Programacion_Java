package pizzeria;
import java.util.*;
public class test {

	public static void main(String[] args) {
		
		//Añado los objetos a un ArrayList
		ArrayList <Pizza> pedidos=new ArrayList<Pizza>();
		pedidos.add(new Pizza(PizzaTipo.margarita,PizzaTamano.mediana,15));
		pedidos.add(new Pizza(PizzaTipo.cuatroquesos,PizzaTamano.familiar,25));
		pedidos.add(new Pizza(PizzaTipo.barbacoa,PizzaTamano.pequeña,5));
		//Se cambia el estado de pedido a servido en el objeto p2
		pedidos.get(1).sirve();
		
		
		System.out.println("INFORMACIÓN SOBRE LAS PIZZAS: ");
		
		//Se muestra la información de los objetos
		System.out.println("_______________________");
		System.out.println(pedidos.get(0).toString());
		System.out.println("_______________________");
		System.out.println(pedidos.get(1).toString());
		System.out.println("_______________________");
		System.out.println(pedidos.get(2).toString());
		System.out.println("_______________________");
		
		pedidos.get(2).sirve();
		//Casting de las cadenas de precio
		int precio0=(int)pedidos.get(0).getPrecio();
		int precio1=(int)pedidos.get(1).getPrecio();
		int precio2=(int)pedidos.get(2).getPrecio();
		
		//Calcular el precio más caro de pizza
		if((precio0>precio1)&&(precio0>precio2)) {
			System.out.println("El precio más caro es el de la Pizza : "+pedidos.get(0).getTipo());
		}else if((precio1>precio0)&&(precio1>precio2)) {
			System.out.println("El precio más caro es el de la Pizza: "+pedidos.get(1).getTipo());
		}else if((precio2>precio0)&&(precio2>precio0)) {
			System.out.println("El precio más caro es el de la Pizza: "+pedidos.get(2).getTipo());
		}
		//Calcular el precio más barato de pizza
		if((precio0<precio1)&&(precio0<precio2)) {
			System.out.println("El precio más barato es el de la Pizza : "+pedidos.get(0).getTipo());
		}else if((precio1<precio0)&&(precio1<precio2)) {
			System.out.println("El precio más barato es el de la Pizza: "+pedidos.get(1).getTipo());
		}else if((precio2<precio0)&&(precio2<precio0)) {
			System.out.println("El precio más barato es el de la Pizza: "+pedidos.get(2).getTipo());
		}
		
		
		System.out.println("Total Pizzas pedidas; "+Pizza.getTotalPedidas());
		System.out.println("Total Pizzas servidas: "+Pizza.getTotalServidas());
		
	}

}
