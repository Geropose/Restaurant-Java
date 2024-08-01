
public class PalacioDuhau {

	public static void main(String[] args) {

									// Ingredientes //
		
		Ingrediente tomate = new Ingrediente("Tomate", "Fruta", "Salteado", 18, 5, 5); //
		Ingrediente cebolla = new Ingrediente("Cebolla", "Verdura", "Salteado", 40, 9, 8);
		Ingrediente morron = new Ingrediente("Morron", "Verdura", "Salteado", 35, 20, 10);
		Ingrediente pollo = new Ingrediente("Pollo", "Carne", "Salteado", 240, 200, 20);
		Ingrediente carne = new Ingrediente("Carne", "Carne", "Salteado", 140, 300, 20);
		Ingrediente harina = new Ingrediente("Harina", "MateriaPrima", "Amasado", 370, 35, 10);
		Ingrediente agua = new Ingrediente("Agua", "Bebida", "Nigungo", 0, 3, 0);
		Ingrediente vinoBlanco = new Ingrediente("Vino Blanco", "Bebida", "Evaporar", 82,75,5);
		
									 	// Platos //
		
		ComidaCompleja fajita = new ComidaCompleja("Fajita", "Pasta", "Amasado");
		ComidaCompleja tacosPollo = new ComidaCompleja ("Taco Pollo", "Mexicana", "Salteado");
		ComidaCompleja tacosCarne = new ComidaCompleja ("Taco Carne", "Mexicana", "Salteado");
		
										// Pedidos //
		
		Pedido pedido1 = new Pedido (1,"Ismael");
		Pedido pedido2 = new Pedido (2,"Geronimo");

									// Especialidades //
		
		EspecialidadTipo tipoComidaMexicana = new EspecialidadTipo("Mexicana");
		EspecialidadTipo tipoComidaAmericana = new EspecialidadTipo ("Americana");
		EspecialidadTipo tipoComidaVegana = new EspecialidadTipo ("Vegana");
		EspecialidadMPrep tipoPreparacion = new EspecialidadMPrep ("Salteado");
		EspecialidadCaloriasMayor cantCalorias = new EspecialidadCaloriasMayor (60);
		EspecialidadTiempoMenor cantTiempo = new EspecialidadTiempoMenor (15);
		
								// Estaciones de la Cocina //	
		
		Calculador calCondicional = new CalculadorCondicional (tipoComidaMexicana,50,200);
		Calculador calPorcentual = new CalculadorPorcentual (50,"Propina");
				
								// Estaciones de la Cocina //
		
		Estacion mexicana = new Estacion ("Mexicana", tipoComidaMexicana);
		Estacion americana = new Estacion ("Americana", tipoComidaAmericana);
		Estacion vegana = new Estacion ("Vegana", tipoComidaVegana);
		
									    // Cocina //
		
		Cocina cocinaDuhau = new Cocina ("Cocina Duhau");
		
		
		
//------------------------------------------------------------------------------------------------------------------------------------------------------		
		
									// IMPLEMENTACION //
		
		cocinaDuhau.addEstacion(mexicana);
		cocinaDuhau.addEstacion(americana);
		cocinaDuhau.addEstacion(vegana);
		
		
		fajita.addComida(harina);
		fajita.addComida(agua);
		
		tacosPollo.addComida(tomate);
		tacosPollo.addComida(cebolla);
		tacosPollo.addComida(morron);
		tacosPollo.addComida(pollo);
		tacosPollo.addComida(vinoBlanco);
		
		tacosCarne.addComida(tomate);
		tacosCarne.addComida(cebolla);
		tacosCarne.addComida(morron);
		tacosCarne.addComida(carne);
		tacosCarne.addComida(vinoBlanco);

		tacosPollo.addComida(fajita);		
		
		pedido1.addComida(tacosCarne);
		pedido1.addComida(tacosPollo);
		
		pedido2.addComida(vinoBlanco);
		
		cocinaDuhau.addPedido(pedido1);
		
		System.out.println(cocinaDuhau.estacionAcepta(tacosPollo));
		System.out.println(tipoComidaMexicana.seCumple(tacosPollo));
		System.out.println(tipoPreparacion.seCumple(tacosPollo));
		System.out.println(cantCalorias.seCumple(tacosPollo));
		System.out.println(cantTiempo.seCumple(tacosPollo));
		System.out.println(tacosPollo.getTiempoPreparacion());
		System.out.println(tacosPollo.getCalorias());
		System.out.println(tacosPollo.getPrecio());
		System.out.println(tacosCarne.getPrecio());
		System.out.println(cocinaDuhau.cobrarPedido(calCondicional));
		System.out.println(cocinaDuhau.cobrarPedido(calPorcentual));
		
		
	}

}
