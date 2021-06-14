package ejercicio1;

//		(Memento) Se tiene un estudiante que está realizando su tesis, cada ocasión que lleva
//		su documento a revisión el guarda un estado de este para poder retornar a esa versión
//		cuando el lo necesite, ya tiene 5 revisiones del tutor y esto quiere decir que tiene 5
//		versiones, El necesita volver a su estado 3 para revisar qué fue lo que cambio

public class Cliente {

	public static void main(String[] args) {

		Versiones version = new Versiones();
		Originator originator = new Originator();

		Tesis tesis;

		tesis = new Tesis("13/01/2020", "Contexto1");
		originator.setState(tesis);
		version.add(originator.crearVersion());

		tesis = new Tesis("13/02/2020", "Contexto2");
		originator.setState(tesis);
		version.add(originator.crearVersion());

		tesis = new Tesis("14/03/2020", "Contexto3");
		originator.setState(tesis);
		version.add(originator.crearVersion());

		tesis = new Tesis("15/09/2021", "Contexto4");
		originator.setState(tesis);
		version.add(originator.crearVersion());

		tesis = new Tesis("30/01/2021", "Contexto5");
		originator.setState(tesis);
		version.add(originator.crearVersion());

		originator.restoreFromMemento(version.getVersion(2));

	}

}
