package libreria;

public class LibreriaOferta extends Libreria {
	
	private double porcDesc;
	private String[] autoresEnOferta;
	
	public LibreriaOferta(double d, String[] aut)
	{
		if(d < 0) throw new RuntimeException("El descuento no puede ser negativo")
		porcDesc = d;
		autoresEnOferta = aut;
	}
	
	public void addLibro(String[] a, String t, double p)
	{
		boolean autorEnOferta = 
	}
	
	protected boolean buscaObjeta(String a)
	{
		boolean encontrado = false;
		int i = 0;
		whle( i < )
	}
}
