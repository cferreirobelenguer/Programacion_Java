package empresa;
/*Nos piden hacer un programa que gestione empleados.
 * Los empleados se definen por tener:
 * . Nombre
 * .Edad
 * .Salario
 * 
 * También tendremos una constante llamada plus, que tendrá un valor de 300€
 * Tenemos dos tipos de empleados: repartidor y comercial.
 * El comercial, aparte de los atributos anteriores, tiene uno más llamado comisión double.
 * El repartidor, aparte de los atributos de empleado, tiene otro llamado zona String.
 * Crea sus constructores getters y setters y toString (piensa como aprovechar la herencia).
 * No se podrán crear objetos del tipo empleado (la clase padre) pero sí de sus hijas.
 * Las clases tendrán un método llamado plus, que según en cada clase tendrá una implementación
 * distinta. Este plus básicamente aumenta el salario del empleado.
 * 
 * .En comercial, si tiene más de 30 años y cobra una comisión de más de 200 euros, se aplicará
 * el plus.
 * . En repartidor, si tiene menos de 25 y reparte en la zona 3, este recibirá el plus.
 * 
 * Puedes hacer que devuelva un booleano o que no devuelva nada, lo dejo a tu elección.
 * Ccrea una clase ejecutable donde crees distintos empleados y le apliques el plus para comprobar
 * que funciona.
 * 
 */
public abstract class empleados {


	private String nombre;
	private int edad;
	private double salario;
	//Constante de plus
	public final int plus=300;
	//Constructor
	public empleados(String nombre,int edad, double salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public double getSalario() {
		return salario;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	//Método plus
	public abstract boolean metodoPlus();
	//toString
	@Override
	public String toString() {
		return "Ficha de empleados:  [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", plus=" + plus + "]";
	}

	
}
