
public class EspecialidadTiempoMayor extends Especialidad {
	
	private int tiempoPreparacion;
	
	public EspecialidadTiempoMayor (int tiempo) {
		this.tiempoPreparacion = tiempo;
	}

	@Override
	public boolean seCumple(Comida c1) {
		return (c1.getTiempoPreparacion() >= tiempoPreparacion);
	}

}
