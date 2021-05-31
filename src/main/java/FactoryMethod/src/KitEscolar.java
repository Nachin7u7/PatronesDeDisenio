
public class KitEscolar implements Kit {

	private Deportivo deportivo;
	private Cuaderno cuaderno;
	private Mochila mochila;

	public KitEscolar() {
	}

	public void setMochila(Mochila mochila) {
		this.mochila = mochila;
	}

	public void setDeportivo(Deportivo deportivo) {
		this.deportivo = deportivo;
	}

	public void setCuaderno(Cuaderno cuaderno) {
		this.cuaderno = cuaderno;
	}

	@Override
	public void create() {
		mochila.getMochila();
		deportivo.getDeportivo();
		cuaderno.getCuaderno();
	}

}
