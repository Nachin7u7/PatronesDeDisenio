package ejemplo4;

import java.util.*;

//	(Strategy) Se tiene una tienda celulares (modelo, marca, gama,precio), cuando alguien
//	desea algún modelo especifico pasa por un módulo de búsqueda donde podemos
//	buscarlo por precio y/o modelo , cuando la cantidad de celulares en la tienda es
//	relativamente poca (< value1) usa un algoritmo apropiado para pocos datos, cuando la
//	cantidad de celulares es alta (> value) usa un algoritmo apropiado para muchos datos.

public class Cliente {

	public static void main(String[] args) {

		Tienda tienda = new Tienda(3);

		List<Celular> p = new LinkedList<Celular>();

		p.add(new Celular("Shaomi", "huawei", "Alta", 300));
		p.add(new Celular("A2", "Samsung", "Alta", 500));
		p.add(new Celular("X45", "Samsung", "Media", 300));

		tienda.setList(p);

		tienda.buscarSegunModelo("Galaxi");
		tienda.buscarSegunPrecio(350);

		tienda.add(new Celular("Xperia", "Sony", "Alta", 400));

		tienda.buscarSegunModelo("SR2");
		tienda.buscarSegunPrecio(700);

	}

}
