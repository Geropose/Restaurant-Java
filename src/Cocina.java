import java.util.*;

public class Cocina {

	private List<Estacion> listEstaciones;
	private List<Pedido> listPedido;
	private String nombreCocina;
	
	public Cocina (String nombreCocina) {
		this.nombreCocina = nombreCocina;
		this.listEstaciones = new ArrayList<Estacion>();
		this.listPedido = new ArrayList<Pedido>();
	}
	
	public String getNombreCocina () {
		return nombreCocina;
	}
	
	public void addEstacion (Estacion e1) {
		listEstaciones.add(e1);
	}
	
	public void addPedido (Pedido p) {
		listPedido.add(p);
	}
	
	public double cobrarPedido(Calculador c) {
		double precioPedido = 0;
		for (Pedido p: listPedido){
			for (Comida c1: p.getComidas()) {
					precioPedido += c1.getPrecio() + c.devolverCosto(c1);
			}
		}
		return precioPedido;
	}
	
	public String estacionAcepta(Comida c1) {
		Estacion e1 = new Estacion ("Default", null);
		for (Estacion e: listEstaciones) {
			if (e.aceptaComida(c1))
				e1 = e;
		}
		return e1.toString();
	}	
	
	
}
