
package pizzeria;

public class Pizza {
	
	//Variables privadas estáticas
	private static int numeroPizzasPedidas;
	private static int numeroPizzasServidas;
	
	//Atributos privados con clase especial enum
	private PizzaTamano tamano;
	private PizzaTipo tipo;
	private PizzaEstado estado;
	private int precio;
	
	public Pizza(PizzaTipo tipo,PizzaTamano tamano,int precio) {
		//Constructor con parámetros tipo y tamano
		this.tamano=tamano;
		this.tipo=tipo;
		//Por defecto se fila el estado como pedido
		this.estado=PizzaEstado.pedida;
		//Se incrementan las pizzas pedidas cuando se crea una pizza
		numeroPizzasPedidas++;
		this.precio=precio;
	}
	
	//Getter y Setter
	public PizzaTamano getTamano() {
		return tamano;
	}

	public void setTamano(PizzaTamano tamano) {
		this.tamano = tamano;
	}

	public PizzaTipo getTipo() {
		return tipo;
	}

	public void setTipo(PizzaTipo tipo) {
		this.tipo = tipo;
	}

	public PizzaEstado getEstado() {
		return estado;
	}

	public void setEstado(PizzaEstado estado) {
		this.estado = estado;
	}
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	//Métodos estáticos para poder ver las variables estáticas privadas numeroPizzasPedidas, numeroPizzasServidas
	public static int getTotalPedidas() {
		return numeroPizzasPedidas;
	}
	public static int getTotalServidas() {
		return numeroPizzasServidas;
	}

	@Override
	//toString()
	public String toString() {
		return "Pizza [Tamano=" + tamano + ", Tipo=" + tipo + ", Estado=" + estado + "Precio= "+precio+"€ ]";
	}
	
	//Método servir, se cambia el estado a servido y se incrementan las pizzas servidas
	public void sirve() {
		if(estado==PizzaEstado.pedida) {
		numeroPizzasServidas++;
		//Cambia el estado a servido
		this.estado=PizzaEstado.servida;
		}
	}
	//Función de la superclase que compara objetos en función del precio
		public int compareTo(Pizza o) {
			int resultado=0;
			if(this.precio<o.precio){
				resultado=-1;
			}else if(this.precio>o.precio){
				resultado=1;
			}
		return resultado;
		}
	
	
}
