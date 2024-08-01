
public class Ingrediente extends Comida {

	
	private int calorias;
	private double precio;
	private int tiempoPreparacion;
	
	public Ingrediente(String nombreComida, String tipoComida, String modoPreparacion, int calorias, double precio, int tiempoPreparacion) {
		super(nombreComida, tipoComida, modoPreparacion);
		this.calorias = calorias;
		this.precio = precio;
		this.tiempoPreparacion = tiempoPreparacion;
	}

	@Override
	public int getCalorias() {
		return this.calorias;
	}

	@Override
	public int getTiempoPreparacion() {
		return this.tiempoPreparacion;
	}

	@Override
	public double getPrecio() {
		return this.precio;
	}
}
