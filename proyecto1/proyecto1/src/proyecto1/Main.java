package proyecto1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Direccion direccion = new Direccion ("Topacio", "Bonanza", "Guadalajara", 12245);
		Propietario propietario = new Propietario ("Juan", "f34342", "F345333636S00", direccion);
		Marca marca = new Marca ("Porsche Carrera", 207, 2010, "DF420");
		Automovil automovil = new Automovil ("Deportivo", 60, 220, propietario, marca);
		
		System.out.println(
				"El automovil es un " + marca.nombreMarca +
				" el propietario del auto es: " + propietario.nombre + " " +
				"su dirección es: " + direccion.calle + " " + direccion.ciudad + " "  + 
				direccion.colonia + " "  + direccion.codigoPostal + " " +
				"el modelo del automovil es: " + automovil.modelo);
	}

}
