package test;

//	(Estado) Se tiene una objeto computadora (programas abiertos [String], consumo en memoria
//	RAM, consumo en CPU) donde esta computadora tiene los estados de apagado, prendido, reiniciar.
//	cuando este está iniciando la cantidad de programas abiertos es 0 y el consumo de recursos es
//	mínimo, cuando está en reiniciar los programas abiertos son cerrados y el consumo de recursos es 0%,
//	cuando está en prendido el consumo de recurso va incrementando en 5% en relación a los programas
//	abiertos (cantidad randómica de programas son abiertos cuando está en este estado)

public class Cliente {

	public static void main(String[] args) {

		IState estado = new Prendido();
		Computadora compu = new Computadora();
		compu.setState(estado);
		compu.setRam("8Gb");
		compu.request();
		
		
	}

}
