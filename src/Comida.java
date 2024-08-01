
public abstract class Comida {
	
	protected String nombreComida;
	protected String tipoComida;
	protected String modoPreparacion;

	public Comida (String nombreComida, String tipoComida, String modoPreparacion) {
		this.nombreComida = nombreComida;
		this.tipoComida = tipoComida;
		this.modoPreparacion = modoPreparacion;
	}

	public abstract int getCalorias ();
	
	public abstract int getTiempoPreparacion();
	
	public abstract double getPrecio();
		
	public String getNombreComida() {
		return nombreComida;
	}

	public void setNombreComida(String nombreComida) {
		this.nombreComida = nombreComida;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	public String getModoPreparacion() {
		return modoPreparacion;
	}

	public void setModoPreparacion(String modoPreparacion) {
		this.modoPreparacion = modoPreparacion;
	}
}
