import java.util.*;

public class Estacion {
	
	private String nombreEstacion;
	private Especialidad especialidad;
	private List<Comida> listComidas;
	
	public Estacion (String estacion, Especialidad esp) {
		this.nombreEstacion = estacion;
		this.especialidad = esp;
		this.listComidas = new ArrayList<Comida>();
	}
	
	public List<Comida> comidasAceptadas(){
		List<Comida> listAux = new ArrayList<Comida>();
		listAux.addAll(listComidas);
		return listAux;
	}
	
	public void setEspecialidad (Especialidad e1){
		this.especialidad = e1;
	}
	
	public boolean aceptaComida(Comida c1) {
		if (especialidad.seCumple(c1)){
			listComidas.add(c1);
			return true;
		}
		return false;
	}
	
	public String getNombreEstacion () {
		return nombreEstacion;
	}

	@Override
	public String toString() {
		return "Estacion de Cocina: " + nombreEstacion;
	}
	
	
	
}
