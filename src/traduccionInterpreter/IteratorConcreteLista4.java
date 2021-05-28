package traduccionInterpreter;

import java.util.Stack;

public class IteratorConcreteLista4 implements Iterator {
	private Stack<String> nombres;
	private int position;

	public IteratorConcreteLista4(Stack<String> nombres) {
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
