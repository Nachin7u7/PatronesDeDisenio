package ejemplo3;

public class Memento {

	private GitCodigo state;
	
	public Memento(GitCodigo state) {
		this.state=state;
	}
	
	public GitCodigo getState() {
		return state;
	}
	
	
}
