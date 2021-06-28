package decoratorEjercicio;

public interface Component {
	String nombre();

	int nivel();

	void subirNivel(int niveles);

	String armas();

	void equiparArma(String arma);

	int porcentajeArmadura();

	void aumentarArmadura(int porcentaje);

	int puntosAtaque();

	void aumentarAtaque(int puntos);

	int puntosDefensa();

	void aumentarDefensa(int puntos);

	int puntosRegeneracion();

	void aumentarRegeneracion(int puntos);

	void show();
}
