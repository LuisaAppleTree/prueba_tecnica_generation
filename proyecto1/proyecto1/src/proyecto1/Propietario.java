package proyecto1;

public class Propietario {
	public String nombre;
	public String rfc;
	public String curp;
	public String fechaDeNacimiento;
	public Direccion direccion;

	
	
	public Propietario(String _nombre, String _rfc, String _curp, Direccion _direccion){
		nombre = _nombre;
		rfc = _rfc;
		curp = _curp;
		direccion = _direccion;
	}

}


