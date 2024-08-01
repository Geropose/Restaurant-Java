
public class EspecialidadCaloriasMenor extends Especialidad {
	
	private int cantCalorias;
	
	public EspecialidadCaloriasMenor (int calorias) {
		this.cantCalorias = calorias;
	}

	@Override
	public boolean seCumple(Comida c1) {
		return (c1.getCalorias() < cantCalorias);
	}

}
