package tienda_Servicios_Informaticos_Pepe;

public class Factura {
	private String numero;
	private String descripcion;
	private int cantCompraArts;
	private double precioArticulo;
	
	public Factura (String _numero, String _descripcion, int _cantCompraArts, double _precioArticulo) {
		numero = _numero;
		descripcion = _descripcion;
		cantCompraArts = _cantCompraArts;
		precioArticulo = _precioArticulo;
	}
	
	public String getNumero () {
		return numero;
	}
	
	public void setNumero (String _numero) {
		numero = _numero;
	}
	
	public String getDescripcion () {
		return descripcion;
	}
	
	public void setDescripcion (String _descripcion) {
		descripcion = _descripcion;
	}
	
	public int getCantCompraArts () {
		return cantCompraArts;
	}
	
	public void setCantCompraArts (int _cantCompraArts) {
		cantCompraArts = _cantCompraArts;
	}
	
	public double getPrecioArticulo () {
		return precioArticulo;
	}
	
	public void setPrecioArticulo (double  _precioArticulo) {
		 precioArticulo =  _precioArticulo;
	}
	
/* este método no tiene un propósito claro, debido a que
 * siempre devolverá 0 cómo lo dice en las instrucciones 
 * del punto 3 */ 
	
	public double getTotalFactura(double montoFactura) {
		 return montoFactura = precioArticulo * cantCompraArts;
		 if (montoFactura > 0) {
			 montoFactura = 0;
		 } else (montoFactura < 0) {
			montoFactura = 0.0;
		 }
		 return montoFactura;
	}
	
	

}
