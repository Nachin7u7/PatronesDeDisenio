package strategyTarea;

//	(Strategy) Se tiene una tienda de ropas (tipo, precio) cada ocasión que cambia de estación
//	(invierno, verano,primavera, otoño) también cambia su estrategia de ventas y precios , En invierno las
//	ropas suben un 10% de su precio original, Cuando la estacion es verano todas las ropas rebajan un
//	10% , en caso de primavera los precios se mantienen, y en otoño los precios bajan 50%

public class Cliente {
	public static void main(String[] args) {

		TiendaDeRopa tienda = new TiendaDeRopa();

		tienda.setRopaPrecio(50);
		tienda.setStrategy(new Invierno());
		tienda.show();

		tienda.setStrategy(new Verano());
		tienda.show();

		tienda.setStrategy(new Primavera());
		tienda.show();

		tienda.setStrategy(new Otoño());
		tienda.show();

	}
}
