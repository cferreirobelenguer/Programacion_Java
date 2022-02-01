

package examen_ord;

//BicicletaElectrica hereda de Bicicleta e implementa a la interfaz Motor
public class BicicletaElectrica extends Bicicleta implements Motor{
	//Boolean con dos valores true o false
	private boolean estadoMotor;
	private int autonomia;
	//Constructor
	public BicicletaElectrica(int cod_bici, float precio, String modelo, int autonomia) {
		super(cod_bici,precio,modelo);
		this.autonomia=autonomia;
		this.estadoMotor=false;
	}

	
	@Override
	public void encender() {
		//El motor se enciende y cambia el estado del booleano a true
		estadoMotor=true;
		
	}

	
	@Override
	public void apagar() {
		//El motor se apaga y cambia el estado del booleano a false
		estadoMotor=false;
	
	}

	public void pedalear(int velocidad_) {
		String estado="";
		if(estadoMotor==true) {
			estado="encendido";
		}else {
			estado="apagado";
		}
		System.out.println("Estado de motor de bicicleta eléctrica: "+estado);
		if(estadoMotor==true) {
			//Si el motor está encendido se duplica la velocidad
			super.setVelocidad(velocidad_*2);
		}else {
			//Si el motor está apagado se mantiene la misma velocidad
			int velocidad=getVelocidad();
			super.setVelocidad(velocidad_);
		}
	}
}
