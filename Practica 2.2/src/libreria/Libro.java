package libreria;

public class Libro {
	
	private static double porcIVA = 10.0;
	private String autor;
	private String titulo;
	private double precioBase;
	
	public Libro(String autor, String titulo, double precioBase)
	{
		this.autor = autor;
		this.titulo = titulo;
		this.precioBase = precioBase;
	}
	
	public String getAutor()
	{
		return autor;
	}
	
	public String getTitulo()
	{
		return titulo;
	}
	
	public double getPrecioBase()
	{
		return precioBase;
	}
	
	protected double getBaseImponible()
	{
		return precioBase;
	}
	
	static public double getIVA()
	{
		return porcIVA;
	}
	
	
	static public void setIVA(double IVA)
	{
		porcIVA = IVA;
	}
	
	public double getPrecioFinal()
	{
		return getBaseImponible() + getBaseImponible()*(porcIVA/100);
	}
	
	public String toString()
	{
		return "(" + autor + "; " + titulo + "; " + precioBase + "; " + porcIVA + "%; " + getPrecioBase() + ")";
	}
}
