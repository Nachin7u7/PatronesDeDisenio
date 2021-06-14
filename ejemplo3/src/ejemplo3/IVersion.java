package ejemplo3;

public interface IVersion {

	void notifyObserver(int version);

	void attach(ISubscriptor observer);

	void deattach(ISubscriptor observer);

}
