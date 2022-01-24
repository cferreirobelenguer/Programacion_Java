

package ejercicio_empresa;

public class productosHigiene extends Productos {
	//Atributos de la clase productosHigiene
		
		private int contenido;
		
		public productosHigiene(String nombre,int contenido, int precio) {
			//Constructor con parámetros
			//Hereda el atributo nombre de Productos
			super(nombre,precio);
			
			this.contenido=contenido;
		}
		
		//Getters y Setters

		public int getContenido() {
			return contenido;
		}

		public void setContenido(int contenido) {
			this.contenido = contenido;
		}
		
		//toString
		@Override
		public String toString() {
			return " ///Nombre: "+getNombre()+" /// Precio: $" + getPrecio()+"/// Contenido: " + contenido + "";
		}
	
		
}
