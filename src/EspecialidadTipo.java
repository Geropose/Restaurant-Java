
public class EspecialidadTipo extends Especialidad {
	
	private String tipoComida;
	
	public EspecialidadTipo (String tipoComida) {
		this.tipoComida = tipoComida;
	}
	
	@Override
	public boolean seCumple(Comida c1) {
		return (c1.getTipoComida().equals(tipoComida));
	}
}
