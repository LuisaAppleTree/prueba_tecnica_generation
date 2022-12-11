package tienda_Servicios_Informaticos_Pepe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factura factura = new Factura ("500", "MacBook Pro", 2, 20500.50);
		
		System.out.println("Número de la compra: " + factura.getNumero() + 
				" del producto llamado: " + factura.getDescripcion() + 
				" unidades vendidas: " + factura.getCantCompraArts() +
				"  costo por producto: " + factura.getPrecioArticulo());
		
	factura.getTotalFactura(20500.50);

	}
	
}
