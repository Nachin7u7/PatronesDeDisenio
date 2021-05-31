package traduccionInterpreter;

import java.util.ArrayList;
import java.util.List;

public class Lista1 implements Lista {

	private List<String> nombres;

	public Lista1() {
		nombres = new ArrayList<>();
	}

	public void add(String value) {
		nombres.add(value);
	}

	@Override
	public IteratorConcreteLista1 iterator() {
		return new IteratorConcreteLista1(this.nombres);
	}

}
