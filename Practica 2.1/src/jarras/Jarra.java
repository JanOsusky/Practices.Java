package jarras;

/**
 * La clase Jarra representa objetos que incluye información sobre la capacidad de jarra etc.
 * @author Jan Osuský
 *
 */
public class Jarra {
	
	/*
	 * Variable para representar la capacidad máxima adimitida por la jarra
	 */
	private final int capacidad;
	
	/*
	 * varialbe para representar el contenido en cada momento de la jarra
	 */
	private int contenido;
	
		
	 public Jarra(int capacidad)
	 {
		if(capacidad <= 0)
			throw new RuntimeException("La capacidad de una jarra debe ser mayor de 0!");
		this.capacidad = capacidad; 
		contenido = 0;
	 }
	 
	 public int capacidad() {
		 return capacidad;
	 }
	 
	 public String toString()
	 {
		 return "J(" + capacidad + ", " + contenido + ")";
	 }
	 
	 public int contenido()
	 {
		 return contenido;
	 }
	 
	 public void llena()
	 {
		 contenido = capacidad;
	 }
	 
	 public void vacia()
	 {
		 contenido = 0;
	 }
	 
	 public void llenaDesde(Jarra jarra)
	 {
		 if(jarra == this)
			 throw new RuntimeException("No se puede vertir jarra sobre si misma!");
		 
		 int cantMinima = Math.min(jarra.contenido, capacidad - contenido);
		 contenido = contenido + cantMinima;
		 jarra.contenido = jarra.contenido - cantMinima;
		 
		 
	 }
	 
}
