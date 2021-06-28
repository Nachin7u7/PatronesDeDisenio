package decoratorEjercicio;
//nombre, nivel, armas, porcentaje de armadura,
//puntos ataque, puntos de defensa, puntos de regeneración de vida
public class Personaje implements Component {

	public Personaje(String name, String guns, int lvl, int pa, int pd, int pv, int armadura) {
		super();
		this.name = name;
		this.guns = guns;
		this.lvl = lvl;
		this.pa = pa;
		this.pd = pd;
		this.pv = pv;
		this.armadura = armadura;
	}

	String name, guns;
	int lvl, pa, pd, pv;
	int armadura;

	@Override
	public void show() {
		System.out.println();
		System.out.println("Nombre: " + name);
		System.out.println("Armas: " + guns);
		System.out.println("Nivel:" + lvl);
		System.out.println("Pts de ataque:" + pa);
		System.out.println("Pts de defensa:" + pd);
		System.out.println("Pts de regeneracion de vida:" + pv);
		System.out.println("Porcentaje de armadura: " + armadura + "%");
	}

	@Override
	public String nombre() {
		return name;
	}

	@Override
	public int nivel() {
		return lvl;
	}

	@Override
	public void subirNivel(int niveles) {
		this.lvl++;
	}

	@Override
	public String armas() {
		return guns;
	}

	@Override
	public void equiparArma(String arma) {
		subirNivel(lvl);
	}

	@Override
	public int porcentajeArmadura() {
		return armadura;
	}

	@Override
	public void aumentarArmadura(int porcentaje) {
		armadura += porcentaje;
	}

	@Override
	public int puntosAtaque() {
		return pa;
	}

	@Override
	public void aumentarAtaque(int puntos) {
		pa += puntos;
	}

	@Override
	public int puntosDefensa() {
		return pd;
	}

	@Override
	public void aumentarDefensa(int puntos) {
		pd += puntos;
	}

	@Override
	public int puntosRegeneracion() {
		return pv;
	}

	@Override
	public void aumentarRegeneracion(int puntos) {

		pv += puntos;
	}

}
