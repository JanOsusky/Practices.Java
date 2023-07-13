package libreria;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
	private List<Libro> libros;
	
	public Libreria()
	{
		libros = new ArrayList<>();
	}
	
	public void addLibro(String autor, String titulo, double precio)
	{
		Libro libro = new Libro(autor, titulo, precio);
		anyadirLibro(libro);
	}
	
	protected void anyadirLibro(Libro libro)
	{
		int pos = buscarLibro(libro.getAutor(), libro.getTitulo());
		if(pos>=0)
			libros.set(pos, libro);
		else
			libros.add(libro);
	}
	
	public void remLibro(String autor, String titulo)
	{
		int pos = buscarLibro(autor, titulo);
		if(pos>=0)
			libros.remove(pos);
		else
			throw new RuntimeException("Libor no encotrado ("+ autor  + ", " + titulo + ")");
	}
	
	public double getPrecioFinal(String autor, String titulo)
	{
		int pos = buscarLibro(autor, titulo);
		if(pos>=0) {
			Libro libro =libros.get(pos);
			System.out.println("(" + autor + ", " + titulo + "): " + libro.getPrecioFinal());
			return libro.getPrecioFinal();
		}
		else
			throw new RuntimeException("Libor no encotrado ("+ autor  + ", " + titulo + ")");
	}
	
	private int buscarLibro(String a, String t) 
	{
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i < libros.size())
		{
			Libro l = libros.get(i);
			encontrado = l.getAutor().equalsIgnoreCase(a) && l.getTitulo().equalsIgnoreCase(t);
			i++;
		}
		return encontrado ? i - 1 : - 1;
	}	
	
	public  String toString()
	{
		String finalString = "";
		finalString += "[";
		for(int i = 0; i < libros.size(); i++)
		{
			finalString += libros.get(i);
		}
		finalString += "]";
		return finalString;
	}
}
