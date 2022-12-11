package proyecto1;

public class Automovil {
	public String modelo;
	public String color;
	public int año;
	public Marca marca;
	public String chasis;
	public Propietario propietario;
	public int velocidadMaxima;
	public int velocidadActual;
	public int numeroPuertas;
	public boolean techoSolar;
	public int numeroMarcha;
	public boolean transmisionAutomatica;
	
	
	public Automovil (String _modelo, int _velocidadActual, int _velocidadMaxima, Propietario _propietario, Marca _marca){
		modelo = _modelo;
		velocidadActual = _velocidadActual;
		velocidadMaxima = _velocidadMaxima;
		propietario = _propietario;
		marca = _marca;
	}
	
	public int aumentarVelocidad() {
		return velocidadActual = velocidadActual + 1;
	}
	
	public int frenarVelocidad() {
		return velocidadActual = velocidadActual = 0;
	}
	
	public int cambiarMarcha() {
		return numeroMarcha = numeroMarcha + 1;
	}
	
	public int disminuirMarcha() {
		if (velocidadActual == 0) {
			numeroMarcha = numeroMarcha - 1;
		}
		return numeroMarcha;
	}
	
	public void autonomia (int velocidadPromedio) {
		System.out.println("La autonomía del vehículo es: " + velocidadPromedio);
	}
	
	public void combustible (int volumenCombustible) {
		System.out.println("El volumen de combustible del vehículo es: " + volumenCombustible);
	}

}
