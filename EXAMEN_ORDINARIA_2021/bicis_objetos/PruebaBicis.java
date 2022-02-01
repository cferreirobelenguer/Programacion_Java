package examen_ord;

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
