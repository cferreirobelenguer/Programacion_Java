

public class Actor extends Persona implements Actuacion
{
    private String pelicula;
    private String papel;
    public Actor ( String nombre, String pelicula, String papel){
        super(nombre);
        this.pelicula = pelicula;
        this.papel = papel;
    }     
    
    public String getPelicula (){
         return pelicula;    
    }
    
    public String decirAlgo(){
        return papel;
    }
}
