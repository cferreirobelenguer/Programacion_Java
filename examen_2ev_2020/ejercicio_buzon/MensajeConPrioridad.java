

/**
 * Write a description of class MensajeConPrioridad here.
 * 
 * @author Profesor DAW 
 * @version 1.0
 */
public class MensajeConPrioridad extends Mensaje
{
    // instance variables - replace the example below with your own
    private int prioridad;

    /**
     * Constructor for objects of class MensajeConPrioridad
     */
    public MensajeConPrioridad( String msg, int prioridad)
    {
        super(msg);
        this.prioridad = prioridad;
    }

    public int getPrioridad(){
        return prioridad;
    }
    
    public String toString (){
        return super.toString()+"["+prioridad+"]";
    }
    
        
}
