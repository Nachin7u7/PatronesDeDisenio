package heladeriaFactoryAbstract;

public class FactoryHelado {
	static Helado agua = new HeladoAgua();
	static Helado cremaH = new HeladoCrema();
	static Helado mixto = new HeladoMixto();

	enum helados {
		HeladoAgua, HeladoCrema, HeladoMixto;
	}

	public static Helado make(helados h) {

		switch (h) {

		case HeladoAgua: {
			((HeladoAgua) agua).setTamanio("Pequeño");
			((HeladoAgua) agua).setForma("Redonda");

			Base base = new Base();
			base.setCosto("3 Bs.");
			base.setNombre("Enrrollado");
			base.setTamanio("Mediano");
			base.setTipo("Cono");

			((HeladoAgua) agua).setBase(base);

			Fruta fruta = new Fruta();
			fruta.setCosto("6 Bs.");
			fruta.setNombre("Naranja");
			fruta.setTamanio("Mediano");
			fruta.setTipoFruta("Citrico");

			((HeladoAgua) agua).setFruta(fruta);

			return agua;
		}

		case HeladoCrema: {
			((HeladoCrema) cremaH).setTamanio("Mediano");
			((HeladoCrema) cremaH).setForma("Redonda");

			Base base = new Base();
			base.setCosto("3 Bs.");
			base.setNombre("Enrrollado");
			base.setTamanio("Mediano");
			base.setTipo("Cono");

			((HeladoCrema) cremaH).setBase(base);

			Fruta fruta = new Fruta();
			fruta.setCosto("5 Bs.");
			fruta.setNombre("Limon");
			fruta.setTamanio("Pequeño");
			fruta.setTipoFruta("Citrico");

			((HeladoCrema) cremaH).setFruta(fruta);

			Crema crema = new Crema();
			crema.setCosto("9 Bs.");
			crema.setMarca("Magnum");
			crema.setSabor("Nata");

			((HeladoCrema) cremaH).setCrema(crema);
			return cremaH;
		}

		case HeladoMixto: {
			((HeladoMixto) mixto).setTamanio("Grande");
			((HeladoMixto) mixto).setForma("Redonda");
			((HeladoMixto) mixto).setCosto("25 bs.");

			Base base = new Base();
			base.setCosto("5 Bs.");
			base.setNombre("Enrrollado");
			base.setTamanio("Grande");
			base.setTipo("Balde");

			((HeladoMixto) mixto).setBase(base);

			Fruta fruta = new Fruta();
			fruta.setCosto("7 Bs.");
			fruta.setNombre("Frutilla");
			fruta.setTamanio("Pequeño");
			fruta.setTipoFruta("Fragaria");

			((HeladoMixto) mixto).setFruta(fruta);

			Crema crema = new Crema();
			crema.setCosto("10 Bs.");
			crema.setMarca("Cornetto");
			crema.setSabor("Dulce de leche");

			((HeladoMixto) mixto).setCrema(crema);
			return mixto;
		}

		default:
			return null;
		}
	}

}
