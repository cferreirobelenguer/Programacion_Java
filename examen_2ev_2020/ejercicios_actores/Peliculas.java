/*
*Dada las siguientes clases, realizar los cambios necesario, modificando o agregando métodos (...) pero 
sin cambiar el tipo de acceso de los atributos ( deben seguir siendo privados) para que el método 
mostrarReparto funcione correctamente mostrando los nombres de los actores que estás asignados a una
 película y el texto con el papel asignado sin que se produzcan errores de compilación o de ejecución.
*

public class Peliculas
{
    // Imprime los nombres de los actores que tienen asignada la pelicula pasada como parametro
    // y el mensaje del papel que tiene asignado
   public static void mostrarReparto(Actor lista[],String pelicula){
       for (int i = 0; i < lista.length; i++) {
         if (lista[i].getPelicula().equals(pelicula) ) {
             System.out.println(lista[i]); // Llama a toString    
             System.out.println(lista[i].decirAlgo());
        }
    }
  }
}
