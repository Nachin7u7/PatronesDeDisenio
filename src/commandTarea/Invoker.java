package commandTarea;

import java.util.*;

public class Invoker {
	private List<IOperacionBuild> listaDeAcciones = new ArrayList<>();

	public void addCommand(IOperacionBuild concreteCommand) {
		listaDeAcciones.add(concreteCommand);
	}

	public void executeCommands() {
		for (IOperacionBuild command : listaDeAcciones) {
			command.execute();
		}
		listaDeAcciones.clear();
	}
}