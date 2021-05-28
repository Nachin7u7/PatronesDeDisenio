package traduccionInterpreter;

public class Lista2 implements Lista {

	private String[] nombres;
	private int position;

	public Lista2() {
		position = 0;
		nombres = new String[5];
	}

	public void add(String value) {
		nombres[position] = value;
		position++;
	}

	@Override
	public IteratorConcreteLista2 iterator() {
		return new IteratorConcreteLista2(this.nombres);
	}

}
