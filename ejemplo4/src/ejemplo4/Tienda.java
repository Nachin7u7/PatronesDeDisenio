package ejemplo4;

import java.util.*;

public class Tienda {

	private IBusquedaM bm;
	private IBusquedaP bp;
	private int value;
	private List<Celular> list = new LinkedList<Celular>();

	public Tienda(int value) {
		this.value = value;
	}

	public void add(Celular c) {
		list.add(c);
	}

	public IBusquedaM getBm() {
		return bm;
	}

	public void setBm(IBusquedaM bm) {
		this.bm = bm;
	}

	public IBusquedaP getBp() {
		return bp;
	}

	public void setBp(IBusquedaP bp) {
		this.bp = bp;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public List<Celular> getList() {
		return list;
	}

	public void setList(List<Celular> list) {
		this.list = list;
	}

	public void buscarSegunPrecio(int precio) {
		if (list.size() > value) {
			bp = new BusquedaMuchosPrecios();
		} else {
			bp = new BusquedaPrecios();
		}
		((BusquedaMuchosPrecios) bp).busquedaPrecio(list, precio);
	}

	public void buscarSegunModelo(String modelo) {
		if (list.size() > value) {
			bm = new BusquedaMuchosModelos();
		} else {
			bm = new BusquedaModelos();
		}
		((BusquedaMuchosModelos) bm).busquedaPrecio(list, modelo);
	}

}
