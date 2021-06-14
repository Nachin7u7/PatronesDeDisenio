package ejercicio2;

//	(Chain Responsability) Se tiene una orden para un cuerpo del ejército y la cadena de
//	mando es : general > teniente > coronel > cabo. entonces se tienen diferentes tipos de
//	órdenes (Entrevistas,Disciplina,Desbloqueos/Manifestaciones,Limpiezas) y cada una de
//	ellas es atendida según la cadena de mando

public class Cliente {

	public static void main(String[] args) {

		ChainOfResponsability chainOfResponsability = new ChainOfResponsability();

		chainOfResponsability.accion("Entrevistas");
		chainOfResponsability.accion("Disciplina");
		chainOfResponsability.accion("Desbloqueos");
		chainOfResponsability.accion("Manifestaciones");
		chainOfResponsability.accion("Limpiezas");
		chainOfResponsability.accion("Arrestar");

	}

}
