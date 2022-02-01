package examen_ord;
/*
Para elaborar un programa para una tienda de ciclismo tenemos que crear dos clases: Bicicleta y BicicletaElectrica que hereda de la clase anterior, ademas está clase implementa el interfaz Motor.
La clase Bicicleta tiene los siguientes atributos y métodos
Atributos:
    •   int codigo_bici;
    •   float precio;
    •   String modelo;
    •   int velocidad; Inicialmente la velocidad será 0 kilometros.
Métodos:
    •  Constructor  recibe como parámetros el codigo_bici, precio y modelo
    •  pedalear que recibe como parámetro la velocidad de pedaleo, este valor cambiará el valor de atributo velocidad.
    • toString  genera un String con la información de la bicicleta.

El interfaz Motor tiene la siguiente definición
public interface Motor {
  void encender();
  void apagar();
}

La clase BicicletaElectrica hereda de la clase anterior, implementa el interface Motor y tiene dos nuevos atributos, modificando el método constructor y pedalea
Nuevos Atributos:
    •  boolean estadoMotor (True- encendido / False – apagado)
    • int autonomia (kilometros que puede recorrer usando la batería)
Métodos que modifica de la clase Bicicleta
    • Constructor – fija además el estado de motor a apagado y un valor determinado de autonomía
    • Pedalear(velocidad de pedaleo) – fija  la velocidad de la bicicleta: el doble de la velocidad de pedaleo si el motor esta encendido, sino toma el valor que se le indique.

*/
public class PruebaBicis {

	public static void main(String[] args) {
		Bicicleta b1=new Bicicleta(1001,564,"Trek");
		Bicicleta b2=new Bicicleta(1002,253,"Decathlon");
		BicicletaElectrica be=new BicicletaElectrica(1003,720,"BH",100);
		
		b1.pedalear(10);
		b2.pedalear(10);
		be.pedalear(10);
		
		//Las tres bicis deben ir a la misma velocidad 10
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(be);
		System.out.println("___________________");
		be.encender(); //Activa el motor eléctrico
		
		b1.pedalear(10);
		b2.pedalear(10);
		be.pedalear(10);
		
		//La bici eléctirca irá a 20 y las otras dos a 10
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(be);
	}

}
