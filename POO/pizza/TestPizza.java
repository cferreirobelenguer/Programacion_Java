
public class TestPizza
{
    public static void main ( String argv[])
    {
        
    Pizza p1 = new Pizza(TipoPizza.MARGARITA,   Tama�oPizza.MEDIANA);
    Pizza p2 = new Pizza(TipoPizza.CUATROQUESOS,Tama�oPizza.FAMILIAR);
    p2.sirve();
    Pizza p3 = new Pizza(TipoPizza.BARBACOA,Tama�oPizza.NORMAL);
    System.out.println("INFORMACION SOBRE LAS PIZZAS");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    p1.sirve();
    System.out.println(" Total Pizza pedidas: "  + Pizza.getTotalPedidas());
    System.out.println(" Total Pizza servidas: " + Pizza.getTotalServidas());
    
    }
}
