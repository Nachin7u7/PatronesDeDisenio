package traduccionInterpreter;

import java.util.Vector;

public class IteratorConcreteLista3 implements Iterator {
	private Vector<String> nombres;
	private int position;

	public IteratorConcreteLista3(Vector<String> nombres) {
		this.nombres = nombres;
	}

	@Override
	public Object next() {
		return nombres.get(position++);
	}

	@Override
	public boolean hasNext() {
		return nombres.size() != 0 && position < nombres.size();
	}
}
