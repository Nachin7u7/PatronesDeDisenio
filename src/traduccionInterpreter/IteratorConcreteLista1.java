package traduccionInterpreter;

import java.util.List;

public class IteratorConcreteLista1 implements Iterator {
	private List<String> nombres;
	private int position;

	public IteratorConcreteLista1(List<String> nombres) {
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
