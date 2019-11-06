import java.util.ArrayList;



public class Aeropuerto {
	private String nombre;
	private String localizacion;
	ArrayList<Vehiculo> flota = new ArrayList<Vehiculo>();
	ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
	ArrayList<Pista> pistas = new ArrayList<Pista>();
	int contadorPasajeros = 0;
	
	
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
	public Aeropuerto (String nombre, String localizacion) {
		this.nombre = nombre;
		this.localizacion = localizacion;
		
	}
	
	
	
	// Metodos
	
	public void AnadirVehiculo(String Tipo) {
		switch (Tipo) {
			case "AvionPasajeros":
				System.out.print("Modelo: ");			
				String modelo = System.console().readLine();
				
				System.out.print("\nNumero de Pasajeros: ");
				int nPasaj = Integer.parseInt(System.console().readLine());
				flota.add(new AvionPasajeros(modelo, nPasaj));
				
				System.out.println("Avion de Pasajeros añadido...");
				break;
				
			case "AvionCarga":
				
				System.out.println("Avion de Carga añadido...");
				break;
				
			case "AutobusPasajeros":
				
				System.out.println("Autobus de Pasajeros añadido...");
				break;
				
			case "AutobusMaletas":
				
				System.out.println("Autobus de maletas añadido...");
				break;
			case "CamionRepostaje":
				System.out.println("Camion de repostaje añadido...");
				break;
			case "CocheAsistencia":
				
				System.out.println("Coche de asistencia añadido...");
				break;
		}
		System.out.println("Numero de Vehiculos: " + flota.size());
		
		
	}
	
	public void NuevoVuelo(String origen, String destino, int capacidadVuelo, int modeloAvion) {
		vuelos.add(new Vuelo(capacidadVuelo, origen, destino, modeloAvion));
	}
	
	public void NuevaPista() {
		pistas.add(new Pista());
	}
	
	
	public void AnadirPasajeroVuelo(int nMaletas, String nombreYApellidos, int idVuelo) {
		vuelos.get(idVuelo).AnadirPasajeros(nMaletas, nombreYApellidos);
	}
	
	
}
