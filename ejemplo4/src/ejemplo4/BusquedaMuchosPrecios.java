package ejemplo4;

import java.util.List;

public class BusquedaMuchosPrecios implements IBusquedaP{

	@Override
	public void busquedaPrecio(List<Celular> list, int precio) {
		System.out.println("Buscando entre varios elementos según el precio: " + precio);
		for (Celular c : list) {
			if (c.getPrecio() == precio) {
				c.show();
			}
		}

	}

}
