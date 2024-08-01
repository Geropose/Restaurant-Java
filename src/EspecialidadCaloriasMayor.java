
public class EspecialidadCaloriasMayor extends Especialidad {
	
	private int cantCalorias;
	
	public EspecialidadCaloriasMayor (int calorias) {
		this.cantCalorias = calorias;
	}

	@Override
	public boolean seCumple(Comida c1) {
		return (c1.getCalorias() >= cantCalorias);
	}

}
