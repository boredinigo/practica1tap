import java.util.ArrayList;

public class Vuelo {
	private int idVuelo = 0;// Contador del numero de vuelos, que asignamos como id
	private int nPasajeros = 0;// Numero pAsajeros actualmente en el vuelo
	private int capacidadVuelo;// Capacidad maxima del vuelo
	private String origen;
	private String destino;
	private int idAvion;
	ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>(); // Guardamos la info de todos los pasajeros del vuelo
	
	
	
	public Vuelo(int capacidadVuelo, String origen, String destino, int idAvion) {
		
		this.capacidadVuelo = capacidadVuelo;
		this.origen = origen;
		this.destino = destino;
		this.idAvion = idAvion;
		
		idVuelo++;
		
	}
	
	public void AnadirPasajeros(int nMaletas, String nombreYApellidos) {
		// Recibimos el nMaletas y nombreyap del pasajero, en el constructor el idVuelo será this.idVuelo
		// para asi evitar tener pasajeros creados asignados a vuelos con id diferentes
		
		if(this.capacidadVuelo < this.nPasajeros) { // Comprobamos que el nPasajeros no supera la capacidad
			pasajeros.add(new Pasajero(nMaletas, nombreYApellidos, this.idVuelo));
			System.out.println("Pasajero añadido...");
			
		}
		else {// Si el avion va lleno...
			System.out.println("Avion lleno...");
		}
		
		
	}
	
	
	
	
	// Getters Y Setters
	
	// No se puede modificar el IdVuelo, solo podemos consultarlo
	public int getIdVuelo() {
		return this.idVuelo;
	}
	
	
	


	public int getIdAvion() {
		return idAvion;
	}
	
	
	public int getnPasajeros() {
		return nPasajeros;
	}
	
	
	public String getOrigen() {
		return origen;
	}
	
	
	
	public String getDestino() {
		return destino;
	}
	
}
