package strategyTarea;

public class Oto�o implements IStrategy {

	@Override
	public void execute(double precio) {
		double descuento = precio * 0.5;
		System.out.println("Precio oto�o: " + (precio - descuento));
	}

}
