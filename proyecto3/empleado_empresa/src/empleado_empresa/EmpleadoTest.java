package empleado_empresa;

import org.junit.jupiter.api.Test;

class EmpleadoTest {

	@Test
	void testEmpleado() {
		Empleado empleado = new Empleado ("Jeff ", "Bezos ", 20000.40);
		Empleado empleado1 = new Empleado ("Bill ", "Gates ", 15000.50);
		
		System.out.println("El empleado numero 1 se llama: " + empleado.getNombre() + 
				empleado.getApellido() + " su salario mensual es de: " + 
				empleado.getSalarioMensual() + " dolares.");
		
		System.out.println("El empleado numero 2 se llama: " + empleado1.getNombre() + 
				empleado1.getApellido() + " su salario mensual es de: " + 
				empleado1.getSalarioMensual() + " dolares.");
	}
	
	void testEmpleadoAumento() {
		Empleado empleado = new Empleado (20000.40);
		Empleado empleado1 = new Empleado (20000.40);
		
		System.out.println("El empleado numero 1 tenía un salario mensual de: " + 
				empleado.getSalarioMensual() + " dolares " + 
				"ahora su salario mensual es de: " + empleado.getTotalSalario() +
				" dolares.");
		
		System.out.println("El empleado numero 2 tenía un salario mensual de: " + 
				empleado1.getSalarioMensual() + " dolares " + 
				"ahora su salario mensual es de: " + empleado1.getTotalSalario() +
				" dolares.");
		
		
		
	}

}
