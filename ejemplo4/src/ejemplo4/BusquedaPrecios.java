package ejemplo4;

import java.util.*;

public class BusquedaPrecios implements IBusquedaP {

	@Override
	public void busquedaPrecio(List<Celular> list, int precio) {
		System.out.println("Buscando entre pocos elementos según el precio: " + precio);
		for (Celular c : list) {
			if (c.getPrecio() == precio) {
				c.show();
			}
		}

	}

}
