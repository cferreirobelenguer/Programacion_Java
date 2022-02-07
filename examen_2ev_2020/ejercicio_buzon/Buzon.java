


/**
 * Write a description of class Buzon here.
 * 
 * @author Profesor DAW
 * @version 1.0
 */
public class Buzon
{
     private Mensaje listaMensajes[];
     private  int numMensajes;
     

    /**
     * Constructor for objects of class Buzon
     */
    public Buzon(int tamañoBuzon)
    {
       listaMensajes = new Mensaje[tamañoBuzon]; 
       numMensajes = 0;
    }

    public boolean ponMensaje( Mensaje msg){
        if ( !estaLlena()){
          for (int i=0; i< listaMensajes.length; i++){
            if (listaMensajes[i] == null){
                listaMensajes[i] = msg;
                numMensajes++;
                return true;
            }
          }
        }
        return false; 
    }
    
    // Si no hay huecos este metodo es mas rapido
    public boolean ponMensaje2( Mensaje msg){
        if (!estaLlena()){
           listaMensajes[numMensajes] = msg;
           numMensajes++;
           return true;
        }
      return false;
    }
    
    public boolean quitarMensaje ( int msgid ){
       if (! estaVacia()){
         for ( int i=0; i<numMensajes; i++){
             if ( listaMensajes[i].getId() == msgid){
                  listaMensajes[i] = null;
                 // Desplazo para quitar huecoes
                 for ( int j=i; j < numMensajes-1; j++){
                     listaMensajes[j] = listaMensajes[j+1];
                    }
                 numMensajes--;
                 return true;
             }
         }
       }
      return false;
    }  
    
    
    public void listarMensajes(){
       System.out.println("Lista de Mensajes ");
       if (! estaVacia()){
         for ( int i=0; i<numMensajes;i++){
                System.out.println(listaMensajes[i]);
            }    
        }
      
      System.out.println("==============================");
    }
    
    
    
    public boolean estaLlena (){
        return (numMensajes == listaMensajes.length);
    }    
    
    public boolean estaVacia (){
        return (numMensajes == 0);
    }
    
    public int numeroMensajes(){
        return numMensajes;
    }
    public boolean  hayMensajesConPrioridad(){
        boolean resultado = false;
        for (int i=0; i < numMensajes; i++){
            Mensaje msg = listaMensajes[i];
            
            // Tambien es correcto:
            // if ( msg.getClass() == MensajeConPrioridad.class ) {
            if ( msg instanceof MensajeConPrioridad ){
               resultado = true;
               break;
            }
        } 
        return resultado;
    }
     
    
    public Mensaje obtenerPrimerMensaje(){
        Mensaje max = null;
        MensajeConPrioridad max2 = null;
        
        if ( !estaVacia() ){
         for (Mensaje aux: listaMensajes){ 
             // Si el mensaje tiene prioridad
             if ( aux != null ) {
             if ( aux instanceof MensajeConPrioridad ){
                 MensajeConPrioridad aux2 = (MensajeConPrioridad) aux;
                 // Si hay algun maximo provisional con prioridad
                 if ( max2 != null ){
                     if ( aux2.getPrioridad() < max2.getPrioridad() || 
                          (aux2.getPrioridad() == max2.getPrioridad() && aux2.getId() < max2.getId() ) ){
                          max2 = aux2;
                        }
                 } 
                 else{
                 max2 = aux2;
                }
            } else{
            // Si hay alguno con prioridad no lo comparo
            if ( max2 == null){
                if ( max == null ){
                    max = aux;
                  }
                else if ( max.getId() > aux.getId() ){
                    max = aux;
                }
            }
                
         }
        }
      } // For
      }
      return (max2 != null )?max2: max; 
    }
      
}
