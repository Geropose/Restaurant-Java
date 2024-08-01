import java.util.*;

public class Pedido {
	
	private List<Comida> listComidas;
	private int nroPedido;
	private String nombreMozo;
	
	public Pedido(int nroPedido, String nombreMozo) {
		this.nroPedido = nroPedido;
		this.nombreMozo = nombreMozo;
		this.listComidas = new ArrayList<Comida>();
	}
	
	public void addComida (Comida c){
		listComidas.add(c);
	}
	
	public List<Comida> getComidas (){
		List<Comida> listAux = new ArrayList<Comida>();
		listAux.addAll(listComidas);
		return listAux;
	}

	public int getPedido() {
		return nroPedido;
	}

	public void setNroMesa(int nroPedido) {
		this.nroPedido = nroPedido;
	}

	public String getNombreMozo() {
		return nombreMozo;
	}

	public void setNombreMozo(String nombreMozo) {
		this.nombreMozo = nombreMozo;
	}

}
