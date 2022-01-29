
package cargoJefes;
//Interfaz Parajefes que define los métodos abstractos de modificar cargo y visualizar cargo
public interface Parajefes {
  //Métodos abstractos que se sobreescriben en la clase Jefes 
	public abstract void setCargo(String cargo);
	public abstract String getCargo();
}
