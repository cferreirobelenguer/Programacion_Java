
public class Pizza 
{
	private static int totalpizzaspedidas=0;
	private static int totalpizzasservidas=0;
	
	private TipoPizza tipo;
	private Tama�oPizza tama�o;
	private EstadoPizza estado;
	
	public static int getTotalPedidas() 
	{
		return totalpizzaspedidas;
    }
	
	public static int getTotalServidas() 
	{
		return totalpizzasservidas;
    }
	
	
	public Pizza(TipoPizza t, Tama�oPizza s) 
	{
		this.tipo = t;
		this.tama�o = s;
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
		return "Pizza [tipo=" + tipo + ", tama�o=" + tama�o + ", estado=" + estado + "]";
	}
	
	
}