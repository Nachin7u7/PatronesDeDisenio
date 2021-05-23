//
//una dispensadora de helados realiza distintos tipo de helados como ser :
//helado de Agua
//helado de crema
//helados mixtos
//
//cada helado tiene una forma de prepar e ingredientes especificos
//
//helado de Agua
//  tamano
//  forma
//  fruta (tipoFruta, nombre , costo, tamano)
//  base (nombre, tamano, tipo, costo)
//
//helado de crema
//  tamano
//  forma
//  fruta (tipoFruta, nombre , costo, tamano)
//  base (nombre, tamano, tipo, costo)
//  crema (sabor, costo, marca)
//
//helados mixtos
//  tamano
//  forma
//  fruta (tipoFruta, nombre , costo, tamano)
//  base (nombre, tamano, tipo, costo)
//  crema (sabor, costo, marca)
//  costo
//
//crear 3 objetos de cada tipo de helado en total (9)

package heladeriaFactoryAbstract;

public class Cliente {

	public static void main(String[] args) {

		HeladoAgua agua1 = (HeladoAgua) FactoryHelado.make(FactoryHelado.helados.HeladoAgua);
		HeladoAgua agua2 = (HeladoAgua) FactoryHelado.make(FactoryHelado.helados.HeladoAgua);
		HeladoAgua agua3 = (HeladoAgua) FactoryHelado.make(FactoryHelado.helados.HeladoAgua);

		HeladoCrema crema1 = (HeladoCrema) FactoryHelado.make(FactoryHelado.helados.HeladoCrema);
		HeladoCrema crema2 = (HeladoCrema) FactoryHelado.make(FactoryHelado.helados.HeladoCrema);
		HeladoCrema crema3 = (HeladoCrema) FactoryHelado.make(FactoryHelado.helados.HeladoCrema);

		HeladoMixto mixto1 = (HeladoMixto) FactoryHelado.make(FactoryHelado.helados.HeladoMixto);
		HeladoMixto mixto2 = (HeladoMixto) FactoryHelado.make(FactoryHelado.helados.HeladoMixto);
		HeladoMixto mixto3 = (HeladoMixto) FactoryHelado.make(FactoryHelado.helados.HeladoMixto);

		// VARIACIONES AL HELADO POR DEFAULT
		agua1.setTamanio("Pequeño");
		agua1.setForma("Plana");

		agua2.setTamanio("Mediano");
		agua2.setForma("Redonda");

		agua3.setTamanio("Grande");
		agua3.setForma("Paleta");

		crema1.setTamanio("Pequeño");
		crema1.setForma("Plana");

		crema2.setTamanio("Mediano");
		crema2.setForma("Redonda");

		crema3.setTamanio("Grande");
		crema3.setForma("Plana");

		mixto1.setTamanio("Pequeño");
		mixto1.setForma("Plana");

		mixto2.setTamanio("Mediano");
		mixto2.setForma("Paleta");

		mixto3.setTamanio("Grande");
		mixto3.setForma("Molecular");
		
		
		agua1.crear();
		agua2.crear();
		agua3.crear();
		crema1.crear();
		crema2.crear();
		crema3.crear();
		mixto1.crear();
		mixto2.crear();
		mixto3.crear();

	}
}
