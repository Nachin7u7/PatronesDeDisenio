package traduccionInterpreter;

import java.util.Vector;

public class Lista3 implements Lista {

	private Vector<String> nombres;
	

	public Lista3() {
		
		nombres = new Vector<>();
	}

	public void add(String value) {
		nombres.add(value);
	}

	@Override
	public IteratorConcreteLista3 iterator() {
		return new IteratorConcreteLista3(this.nombres);
	}
}
