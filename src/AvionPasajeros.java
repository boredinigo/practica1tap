import java.util.ArrayList;

public class AvionPasajeros extends Avion{
	private int capacidad;
	public static ArrayList<AvionPasajeros> avionesPasajeros = new ArrayList<AvionPasajeros>();
	
	
	public AvionPasajeros(String modelo, int capacidad) {
		this.modelo = modelo;
		this.capacidad = capacidad;
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
