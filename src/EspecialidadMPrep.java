
public class EspecialidadMPrep extends Especialidad {
	
	private String modoPreparacion;
	
	public EspecialidadMPrep (String modoP) {
		this.modoPreparacion = modoP;
	}
	
	@Override
	public boolean seCumple(Comida c1) {
		return (c1.getModoPreparacion().contains(modoPreparacion));
	}
}
