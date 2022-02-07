/*
*
*Para implementar un sistema de mensajería se han definido dos clases Mensaje y
MensajeConPrioridad que hereda de la anterior y una clase que almacena este tipo de objetos
denominada Buzón.
La clase Mensaje tiene dos atributos privados: identificador (int idmsg) y contenido ( string contenido). El
identificador es un número diferente para cada mensaje que es generado a partir de un atributo estático
(int numMensajeCreados) que cuenta el número de mensajes generados. El contenido es un String con el
texto del mensaje.
La clase MensajeConPrioridad extiende la anterior clase añadiendo un atributo privado con el valor de
prioridad que puede ser 1,2,3. Siendo el valor 1 valor tiene mayor prioridad.
La Clase Buzón almacena en una tabla mensajes normales o con prioridad definiendo los siguientes
métodos:
Contructor – Recibe como parámetro el número de mensajes máximo que puede almacenar
ponMensaje – Incluye un nuevo mensaje en el Buzón, devuelve true si éxito o false si esta lleno
quitaMensaje – Borra un mensaje a partir de su identificador, devuelve true si existe o false si no está
numeroMensajes – Devuelve el número mensajes almacenado
estaVacia - Devuelve un valor lógico que indica si el buzón está vacío
estaLleno - Devuelve un valor lógico que indica si el buzón está lleno.
hayMensajesConPrioridad() - Devuelve true si existen mensajes con Prioridad
listaMensajes() - Imprimir por consola la lista de mensajes, indicando si el mensaje es con Prioridad
cual es su valor.
Completar las clases Mensaje, MensajeConPrioridad y Buzón a partir del código siguiente sin alterar 
las definiciones de los métodos ni modificadores de acceso de los atributos. Podemos definir nuevos 
atributos o métodos si así lo consideramos
*/

/**
 * Clase Mensaje
 * 
 * @author Profesor DAW
 * @version 1.0
 */
public class Mensaje
{
    private static int  contMensajes =0;
    private String contenido;
    private int id;

    /**
     * Constructor de la clase Mensaje
     */
    public Mensaje(String msg)
    {
        this.contenido = msg;
        contMensajes ++;
        this.id = contMensajes;
    }

    public String getContenido()
    {
        return contenido;
    }
    
    public int getId(){
        return id;
    }
    public String toString(){
        return  id +":"+contenido;
    }
}

