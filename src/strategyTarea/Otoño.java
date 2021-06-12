package strategyTarea;

public class Otoño implements IStrategy {

	@Override
	public void execute(double precio) {
		double descuento = precio * 0.5;
		System.out.println("Precio otoño: " + (precio - descuento));
	}

}
