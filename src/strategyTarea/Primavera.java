package strategyTarea;

public class Primavera implements IStrategy {

	@Override
	public void execute(double precio) {
		System.out.println("Precio primavera: " + (precio));
	}

}
