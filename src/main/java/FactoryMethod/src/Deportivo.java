
public class Deportivo {
//deportivo (talla, color, número de prendas),
	private String talla;
	private String color;
	private String prendas;

	public Deportivo(String talla, String color, String prendas) {
		this.talla = talla;
		this.color = color;
		this.prendas = prendas;
	}

	public void getDeportivo() {
		System.out.println("Talla: " + talla);
		System.out.println("Color: " + color);
		System.out.println("Prendas: " + prendas);
	}

}
