package empleado_empresa;

public class Empleado {
	private String nombre;
	private String apellido;
	private double salarioMensual;
	
	public Empleado (String _nombre, String _apellido, double _salarioMensual) {
		nombre = _nombre;
		apellido = _apellido;
		salarioMensual = _salarioMensual;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String _nombre) {
		nombre = _nombre;
	}
	
	public String getApellido () {
		return apellido;
	}
	
	public void setApellido (String _apellido) {
		apellido = _apellido;
	}
	
	public double getSalarioMensual () {
		return salarioMensual;
	}
	
	public void setSalarioMensual (double _salarioMensual) {
		salarioMensual = _salarioMensual;
	}
	
	
	public Empleado ( double _salarioMensual) {
		salarioMensual = _salarioMensual;
	}
	
	public double getTotalSalario() {
		 return salarioMensual * .10;
	}
	
	
}
