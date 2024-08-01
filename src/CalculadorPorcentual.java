
public class CalculadorPorcentual extends Calculador {
	
	private int porcentaje;
	private String agregarDescripcion;

	public CalculadorPorcentual (int porcentaje, String agregarDescripcion) {
		this.porcentaje = porcentaje;
		this.agregarDescripcion = agregarDescripcion;
	}

	@Override
	public double devolverCosto(Comida c) {
		return ((porcentaje*c.getPrecio())/100);
	}
	
}