import java.util.*;

public class ComidaCompleja extends Comida {
	
	private List<Comida> comidaCompleja;
	
	public ComidaCompleja(String nombreComida, String tipoComida, String modoPreparacion) {
		super (nombreComida,tipoComida,modoPreparacion);
		comidaCompleja = new ArrayList<Comida>();
	}
	
	public void addComida (Comida c1) {
		comidaCompleja.add(c1);
	}
	
	@Override
	public int getCalorias() {
		int calorias = 0;
		for (Comida cc1: comidaCompleja)
			calorias += cc1.getCalorias();
		return calorias;
	}

	@Override
	public int getTiempoPreparacion() {
		int tiempo = 0;
		for (Comida cc1: comidaCompleja)
			tiempo += cc1.getTiempoPreparacion();
		return tiempo;
	}

	@Override
	public double getPrecio() {
		int precio = 0;
		for (Comida cc1: comidaCompleja)
			precio += cc1.getPrecio();
		return precio;
	}
	

}
