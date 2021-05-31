package traduccionInterpreter;

public class IteratorConcreteLista2 implements Iterator {
	private String[] nombres;
	private int position;

	public IteratorConcreteLista2(String[] nombres) {
		this.nombres = nombres;
	}

	@Override
	public Object next() {
		return nombres[position++];
	}

	@Override
	public boolean hasNext() {
		return nombres.length != 0 && position < nombres.length;
	}
}
