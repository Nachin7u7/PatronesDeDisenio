package ejemplo4;

import java.util.List;

public class BusquedaModelos implements IBusquedaM {

	@Override
	public void busquedaPrecio(List<Celular> list, String modelo) {
		System.out.println("Buscando entre pocos elementos seg�n el modelo: " + modelo);
		for (Celular c : list) {
			if (c.getModelo().equals(modelo)) {
				c.show();
			}
		}

	}

}
