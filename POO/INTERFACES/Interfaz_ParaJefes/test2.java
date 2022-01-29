
package cargoJefes;
 import java.util.Arrays;
import java.util.Date;
public class test2 {
//En este test se usa la interfaz Comparable para ordenar por precio los objetos de la clase Empleados

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
	}

}
