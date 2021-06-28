package ejercicioExtra;

public class ServicioReparacion implements Reparacion {

	@Override
	public int reparar(Laptop laptop) {
		System.out.println("Kit de reparación para Laptos");
		return laptop.getTamano() * 5;

	}

	@Override
	public int reparar(PC pc) {
		System.out.println("Kit de reparación para PCs");
		return pc.getTamano() * 10;

	}

	@Override
	public int reparar(Tablet tablet) {
		System.out.println("Kit de reparación para Tablets");
		return tablet.getTamano() * 4;

	}

}