/**
 * Abstract class Persona - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Persona
{
    private String nombre;
    public Persona( String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return nombre;
    }
    @Override 
    public String toString(){
        return getNombre();
    }
}
