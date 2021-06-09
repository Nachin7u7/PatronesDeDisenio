package commandTarea;

import java.util.*;

//		(Command) Se tiene un juego donde se tienen acciones de disparar, modo defensa, atacar.
//		se desea mover estas acciones a comandos específicos y ejecutarlos en el mismo orden que se
//		guardó.(usar solo un método para ejecutar todos los comando guardados)

public class Cliente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Personaje personaje = new Personaje();

		Atacar atacar = new Atacar(personaje);
		Defensa defensa = new Defensa(personaje);
		Disparar disparar = new Disparar(personaje);

		Invoker combo1 = new Invoker();
		Invoker combo2 = new Invoker();
		Invoker combo3 = new Invoker();

		combo1.addCommand(atacar);
		combo1.addCommand(defensa);
		combo1.addCommand(disparar);

		combo2.addCommand(disparar);
		combo2.addCommand(atacar);
		combo2.addCommand(defensa);

		combo3.addCommand(defensa);
		combo3.addCommand(atacar);
		combo3.addCommand(disparar);

		int n = sc.nextInt();
		switch (n) {
		case 1:
			combo1.executeCommands();
			break;
		case 2:
			combo2.executeCommands();
			break;
		case 3:
			combo3.executeCommands();
			break;
		default:
			System.out.println("ERROR");
			break;
		}

		sc.close();
	}

}