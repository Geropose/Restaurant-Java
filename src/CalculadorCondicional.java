
public class CalculadorCondicional extends Calculador {
	
	
	private Especialidad e1;
	private double precioCumple;
	private double precioNoCumple;
	
	public CalculadorCondicional (Especialidad esp, double precioCumple, double precioNoCumple) {
		this.precioCumple = precioCumple;
		this.precioNoCumple = precioNoCumple;
		this.e1 = esp;
	}	

	@Override
	public double devolverCosto(Comida c) {
		if (e1.seCumple(c))
			return precioCumple;
		return precioNoCumple;
	}

}
