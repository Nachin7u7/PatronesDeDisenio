package adapterEjercicio;

//	Adapter) Se tiene una empresa de artefactos electr�nicos (celulares, tablets,computadoras
//	--> method precio / tiempoDeVida) esta empresa absorbe otra empresa de artefactos
//	electr�nicos (televisores,lavadoras, refrigeradores --> method : costo / tiempodeGarantia)
//	ambas estructuras son diferentes pero se desea adaptar a la primera estructura

public class Cliente {

	public static void main(String[] args) {

		IAdapterEmpresa1 celular = new Celular("400$", "5 a�os");
		IAdapterEmpresa1 tablet = new Tablet("300$", "3 a�os");
		IAdapterEmpresa1 computadora = new Computadora("1200$", "7 a�os");

		IAdapterEmpresa1 televisor = new Adapter(new Televisor("350$", "1 a�o"));
		IAdapterEmpresa1 lavadora = new Adapter(new Lavadora("750$", "3 a�o"));
		IAdapterEmpresa1 refrigerador = new Adapter(new Refrigerador("500$", "2 a�o"));

		celular.precio();
		celular.tiempoDeVida();

		tablet.precio();
		tablet.tiempoDeVida();

		computadora.precio();
		computadora.tiempoDeVida();

		televisor.precio();
		televisor.tiempoDeVida();

		lavadora.precio();
		lavadora.tiempoDeVida();

		refrigerador.precio();
		refrigerador.tiempoDeVida();

	}

}
