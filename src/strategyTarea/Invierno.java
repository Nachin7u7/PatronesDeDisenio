package strategyTarea;

public class Invierno implements IStrategy {

	@Override
	public void execute(double precio) {
		double descuento = precio * 0.1;
		System.out.println("Precio invierno: " + (precio + descuento));
	}

}
