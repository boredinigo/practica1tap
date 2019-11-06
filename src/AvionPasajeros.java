import java.util.ArrayList;

public class AvionPasajeros extends Avion{
	private int capacidad;// Capacidad de pasajeros
	
	// QUITAR COMENTARIO
	// El array lo he creado en un intento de poder comprobar que el avion al que se sube el pasajero
	// es un avion comercial, pero no creo que este bien... aqui se queda por si acaso
	ArrayList<AvionPasajeros> avionesPasajeros = new ArrayList<AvionPasajeros>(); 
	
	
	public AvionPasajeros(String modelo, int capacidad) {
		this.modelo = modelo;
		this.capacidad = capacidad;
		
		// QUITAR COMENTARIO
		// Aqui es donde queria hacer lo de el pasajero y avion comercial,
		// leyendo desde otra clase el avionesPasajeros()
		// que ademas me habria servido para comprobar en la clase Vuelo (usando el idAvion) que el vuelo
		// no supera la capacidad de pasajeros del avion
		avionesPasajeros.add(this); 
		System.out.println("Id Avion = " + avionesPasajeros.size());
	}
	
	/*
	public void anadirPasajeros(int numero) {
		
	}
	*/
	
	public int getCapacidad() {
		return capacidad;
	}
	
	
	
}
