import java.util.ArrayList;

public class Vuelo {
	private int idVuelo = 0;
	private int nPasajeros;
	
	private String origen;
	private String destino;
	private int idAvion;
	ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();

	public Vuelo(int capacidadVuelo, String origen, String destino, int idAvion) {
		idVuelo++;
		
		
	}
	
	public void AnadirPasajeros(int nMaletas, String nombreYApellidos) {
		
		pasajeros.add(new Pasajero(nMaletas, nombreYApellidos, this.idVuelo));
		
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
