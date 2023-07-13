package libreria;

public class LibroOferta extends Libro {
	
	private double porcDesc;
	
	public LibroOferta(String autor, String titulo, double precio, double porcDesc)
	{
		super(autor, titulo, precio);
		if(porcDesc < 0)
			throw new RuntimeException("¡No puede haber un descuento negativo!");
		this.porcDesc = porcDesc;
	}
	
	public double getDescuento()
	{
		return porcDesc;
	}
	
	public double getBaseImponible()
	{
		return super.getBaseImponible() - super.getBaseImponible() * porcDesc/100;
	}
}
