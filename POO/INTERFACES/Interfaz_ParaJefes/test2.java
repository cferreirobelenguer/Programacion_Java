package cargoJefes;
 import java.util.Arrays;
import java.util.Date;
public class test2 {

	public static void main(String[] args) {
		// Creación de objetos en array de objetos
		Empleados losEmpleados[]=new Empleados[5];
		losEmpleados[0]=new Empleados("Juan",new Date(6556546),2500.0);
		losEmpleados[1]=new Empleados("Maria", new Date(6546546),1500.0);
		losEmpleados[2]=new Empleados ("Ana",new Date(6546546),3500.0);
		losEmpleados[3]=new Empleados("Sandra",new Date(6546546),6000.0);
		losEmpleados[4]=new Empleados("Antonio",new Date(6546546),2100);
		//Al implementar en la clase Empleados la interfaz Comparable y el método CompareTo que compara los sueldo
		//podemos ordenar el array de menor a mayor
		Arrays.sort(losEmpleados);
		//Se recorren los objetos que se encuentran dentro del array 
		for(Empleados e:losEmpleados) {
			System.out.println(e.getDescription());
		}
		//Se determina el mayor sueldo y el menor sueldo
		System.out.println("___________________");
		System.out.println("El mayor sueldo es: "+losEmpleados[losEmpleados.length-1].getSueldo()+" que corresponde al empleado "+losEmpleados[losEmpleados.length-1].getNombre());
		System.out.println("El menor sueldo es: "+losEmpleados[0].getSueldo()+" que corresponde al empleado "+losEmpleados[0].getNombre());
		System.out.println("___________________");
		
		//Se muestra el bonus de un empleado de la clase Jefes que tiene prima y un empleado de la clase Empleados que no tiene prima
		Jefes Manuel=new Jefes("Manuel",new Date(54654),5000,100);
		Empleados Sonia=new Empleados ("Sonia",new Date(654654),3000);
		System.out.println("El trabajador "+Manuel.getNombre()+" tiene un bonus de "+Manuel.setBonus(500));
		System.out.println("La trabajadora "+Sonia.getNombre()+ " tiene un bonus de "+Sonia.setBonus(100));
	}

}
