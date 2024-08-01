
public class EspecialidadNOT extends Especialidad {
	
	private Especialidad e1;
	
	public EspecialidadNOT (Especialidad esp1) {
		this.e1 = esp1;
	}

	@Override
	public boolean seCumple(Comida c1) {
		return (!e1.seCumple(c1));
	}

}
