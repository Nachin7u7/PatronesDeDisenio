package ejercicio1;

import java.util.*;

public class Versiones {

	List<TesisVersion> lista = new ArrayList<>();

	public void add(TesisVersion version) {
		lista.add(version);
	}

	public TesisVersion getVersion(int position) {
		return lista.get(position);
	}

}
