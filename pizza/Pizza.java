
public class Pizza 
{
	private static int totalpizzaspedidas=0;
	private static int totalpizzasservidas=0;
	
	private TipoPizza tipo;
	private TamañoPizza tamaño;
	private EstadoPizza estado;
	
	public static int getTotalPedidas() 
	{
		return totalpizzaspedidas;
    }
	
	public static int getTotalServidas() 
	{
		return totalpizzasservidas;
    }
	
	
	public Pizza(TipoPizza t, TamañoPizza s) 
	{
		this.tipo = t;
		this.tamaño = s;
		this.estado = EstadoPizza.pedida;
		totalpizzaspedidas++;
	}
	
	public void sirve() 
	{
		if(estado == EstadoPizza.pedida) 
		{
		this.estado = EstadoPizza.servida;
		totalpizzasservidas++;
		}
	}

	@Override
	public String toString() 
	{
		return "Pizza [tipo=" + tipo + ", tamaño=" + tamaño + ", estado=" + estado + "]";
	}
	
	
}