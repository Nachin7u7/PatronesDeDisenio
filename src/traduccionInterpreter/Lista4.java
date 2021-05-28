package traduccionInterpreter;

import java.util.Stack;

public class Lista4 implements Lista {

	private Stack<String> nombres;

	public Lista4() {

		nombres = new Stack<>();
	}

	public void add(String value) {
		nombres.add(value);
	}

	@Override
	public IteratorConcreteLista4 iterator() {
		return new IteratorConcreteLista4(this.nombres);
	}
}
