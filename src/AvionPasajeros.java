
public class AvionPasajeros extends Avion{
	private int capacidad;
	
	
	public AvionPasajeros(String modelo, int capacidad) {
		this.modelo = modelo;
		this.capacidad = capacidad;
				
	}
	
	/*
	public void anadirPasajeros(int numero) {
		
	}
	*/
	
	public int getCapacidad() {
		return capacidad;
	}
	
	
	
}
