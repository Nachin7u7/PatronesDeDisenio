package ejercicioComposite;

//(Composite) Se tiene un archivo como objeto base, un conjunto de archivos se los

//guarda en folders y varios folders se lo guardan en una unidad de disco, Lo que
//podemos obtener de un archivo es el número de palabras que tiene el archivo.
//Debemos de obtener el número de palabras que hay en un folder y en una unidad de
//disco.

public class Cliente {

	public static void main(String[] args) {

		Disco disco1 = new Archivos("contenido1");
		Disco disco2 = new Archivos("contenido 2");
		Disco disco3 = new Archivos("contenido tres");

		disco1.show();

		Disco disco4 = new Archivos("contenido cua tro");
		Disco disco5 = new Archivos("contenido cinco");
		Disco disco6 = new Archivos("contenido seis  ");

		disco4.show();

		Disco folder1 = new Folder();

		folder1.add(disco1);
		folder1.add(disco2);
		folder1.add(disco3);

		folder1.show();

		Disco folder2 = new Folder();

		folder2.add(disco4);
		folder2.add(disco5);
		folder2.add(disco6);

		folder2.show();

		Disco unidadDisco = new Folder();

		unidadDisco.add(folder1);
		unidadDisco.add(folder2);

		unidadDisco.show();

	}

}
