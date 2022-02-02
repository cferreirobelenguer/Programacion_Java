package examen_Colecciones;

public class ErrorId extends Exception {
	public ErrorId(int num){
		super("El id debe estar comprendido entre 0 y 6");
	}
	
}
