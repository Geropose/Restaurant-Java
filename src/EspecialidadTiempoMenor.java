
public class EspecialidadTiempoMenor extends Especialidad {
	
	private int tiempoPreparacion;
	
	public EspecialidadTiempoMenor (int tiempo) {
		this.tiempoPreparacion = tiempo;
	}

	@Override
	public boolean seCumple(Comida c1) {
		return (c1.getTiempoPreparacion() < tiempoPreparacion);
	}

}
