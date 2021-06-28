package decoratorEjercicio;

public class MejorasEscudo implements Component {

	public MejorasEscudo(Component component) {
		super();
		this.component = component;
		aumentarDefensa(35);
		aumentarArmadura(10);
	}

	Component component;

	@Override
	public void show() {
		this.component.show();
	}

	@Override
	public String nombre() {
		return component.nombre();
	}

	@Override
	public int nivel() {
		return component.nivel();
	}

	@Override
	public void subirNivel(int niveles) {
		component.subirNivel(niveles);
	}

	@Override
	public String armas() {
		return component.armas();
	}

	@Override
	public void equiparArma(String arma) {
		component.subirNivel(component.nivel());
	}

	@Override
	public int porcentajeArmadura() {
		return component.porcentajeArmadura();
	}

	@Override
	public void aumentarArmadura(int porcentaje) {
		component.aumentarArmadura(porcentaje);
	}

	@Override
	public int puntosAtaque() {
		return component.puntosAtaque();
	}

	@Override
	public void aumentarAtaque(int puntos) {
		component.aumentarAtaque(puntos);
	}

	@Override
	public int puntosDefensa() {
		return component.puntosDefensa();
	}

	@Override
	public void aumentarDefensa(int puntos) {
		component.aumentarDefensa(puntos);
	}

	@Override
	public int puntosRegeneracion() {
		return component.puntosRegeneracion();
	}

	@Override
	public void aumentarRegeneracion(int puntos) {
		component.aumentarRegeneracion(puntos);
	}

}
