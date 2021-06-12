package strategyTarea;

public class Verano implements IStrategy {

	@Override
	public void execute(double precio) {
		double descuento = precio * 0.1;
		System.out.println("Precio verano: " + (precio - descuento));
	}

}
