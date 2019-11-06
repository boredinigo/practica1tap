

public class Vuelo {
	private int idVuelo = 0;
	private int nPasajeros;
	private String origen;
	private String destino;
	private int modeloAvion;
	
	

	public Vuelo(int nPasajeros, String origen, String destino, int modeloAvion) {
		idVuelo++;
		
		
	}
	
	public void AnadirPasajeros() {
		
		
	}
	
	// Getters Y Setters
	
	// No se puede modificar el IdVuelo, solo podemos consultarlo
	public int getIdVuelo() {
		return this.idVuelo;
	}
	
	
	


	public int getModeloAvion() {
		return modeloAvion;
	}
	
	public void setModeloAvion(int modeloAvion) {
		this.modeloAvion = modeloAvion;
	}
	
	
	public int getnPasajeros() {
		return nPasajeros;
	}
	public void setnPasajeros(int nPasajeros) {
		this.nPasajeros = nPasajeros;
	}
	
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
}
