package ejercicioBridge;

//Bridge : Se tiene varias empresas (Empresa SRL, Empresa SA) de env�o de
//paquetes (precio, nombre del paquete )ambos tiene metodos de enviarPaquete ( Aire, Tierra
//, Mar) cuando se env�a por aire se debe sumar 10% del precio del paquete, cuando se
//env�a por tierra se debe sumar el 5% del precio del paquete y cuando se env�a por mar se
//debe sumar 25% del precio del paquete

public class Cliente {

	public static void main(String[] args) {

		Paquete paquete = new Paquete(100, "Caja", new EmpresaSA());

		paquete.tipoDeEnvio(Implementor.envio.Aire);
		paquete.tipoDeEnvio(Implementor.envio.Tierra);
		paquete.tipoDeEnvio(Implementor.envio.Mar);

	}

}
