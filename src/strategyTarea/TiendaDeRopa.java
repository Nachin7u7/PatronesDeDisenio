package strategyTarea;

public class TiendaDeRopa {

	double ropaPrecio;

	IStrategy strategy;

	public IStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	public double getRopaPrecio() {
		return ropaPrecio;
	}

	public void setRopaPrecio(double ropaPrecio) {
		this.ropaPrecio = ropaPrecio;
	}

	public void show() {
		this.strategy.execute(this.ropaPrecio);
	}

}
