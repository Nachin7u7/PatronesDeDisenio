package proxyEjercicio;

//	Proxy>Se tiene una cuenta en un banco donde una persona debe sacar el dinero
//	para poder realizar distintas compras, este banco empieza con la implementaci�n de una
//	tarjeta de d�bito (proxy) por donde puede realizar compras en esta tarjeta de d�bito se
//	controla que el tipo de moneda debe estar en bolivianos (si se le env�a en otro tipo de
//	moneda internamente se realiza el cambio correspondiente) y no debe poder gastar m�s de
//	lo que tiene guardado en su cuenta del banco.

public class Cliente {
	public static void main(String[] args) {

		RealTarjeta tarjeta = new RealTarjeta(new TarjetaDebito(100));

		tarjeta.comprar(50, "bolivianos");
		tarjeta.comprar(100, "euros");
		tarjeta.ingresarFondos(200, "dolares");
		tarjeta.comprar(12, "pesos");

	}
}
