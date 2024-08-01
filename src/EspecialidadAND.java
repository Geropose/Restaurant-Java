
public class EspecialidadAND extends EspecialidadComp {	
	
	public EspecialidadAND(Especialidad esp1, Especialidad esp2) {
		super(esp1, esp2);
	}
	

	@Override
	public boolean seCumple(Comida c1) {
		return (e1.seCumple(c1) && e2.seCumple(c1));
	}
}
