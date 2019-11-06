
public class Avion implements VehiculoAereo{
	protected String modelo;
	
	
	
	
	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		System.out.println("Avion en marcha...");
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Avion acelerando...");
	}

	@Override
	public void mantenerVelocidad() {
		// TODO Auto-generated method stub
		System.out.println("Velocidad constante...");
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("Avion frenando...");
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("Avion parado...");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Avion apagado...");
	}

	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		System.out.println("Avion despegando del suelo...");
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("Avion aterrizando en el suelo...");
	}

}
