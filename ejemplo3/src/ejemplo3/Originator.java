package ejemplo3;

import java.util.*;

public class Originator implements IVersion {
	private GitCodigo state;
	private List<ISubscriptor> observerList = new ArrayList<>();

	public void setState(GitCodigo state) {
		System.out.println("**** Set State *****");
		state.showInfo();
		this.state = state;
	}

	public Memento createVersion() {
		System.out.println("**** Create State *****");
		state.showInfo();
		;
		return new Memento(this.state);
	}

	public void restoreFromMemento(Memento version) {
		this.state = version.getState();
		System.out.println("**** State Restored *****");
		this.state.showInfo();
		this.notifyObserver(state.getVersion());
	}

	@Override
	public void notifyObserver(int version) {
		System.out.println("**** Notificando usuarios ****");
		for (ISubscriptor observer : observerList) {
			observer.update("Se ha restaurado la version: " + version);
		}
	}

	@Override
	public void attach(ISubscriptor observer) {
		observerList.add(observer);

	}

	@Override
	public void deattach(ISubscriptor observer) {
		observerList.remove(observer);

	}
}
