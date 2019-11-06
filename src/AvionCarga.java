
public class AvionCarga extends Avion{
	private int taraMaxima;
	private String modelo;
	
	public AvionCarga(int taraMaxima, String modelo) {
		this.taraMaxima = taraMaxima;
		this.modelo = modelo;
	}

	public int getTaraMaxima() {
		return taraMaxima;
	}
	
	public String getModelo() {
		return modelo;
	}
	
}
