package factoryMethodTarea3;

public class Cliente {

	public static void main(String[] args) {

		PasajeStandart estandar1 = new PasajeStandart();
		PasajeStandart estandar2 = new PasajeStandart();

		PasajeSolidario solitario1 = new PasajeSolidario();
		PasajeSolidario solitario2 = new PasajeSolidario();

		PasajeInfantes infante1 = new PasajeInfantes();
		PasajeInfantes infante2 = new PasajeInfantes();

		Destino destino1 = new Destino();
		destino1.setPais("Italia");
		destino1.setCiudad("Roma");
		destino1.setAeropuerto("Fiumicino");

		Destino destino2 = new Destino();
		destino2.setPais("Rusia");
		destino2.setCiudad("Moscu");
		destino2.setAeropuerto("Sheremetievo");

		Destino destino3 = new Destino();
		destino3.setPais("Bolivia");
		destino3.setCiudad("La Paz");
		destino3.setAeropuerto("El Alto");

		Destino destino4 = new Destino();
		destino4.setPais("Chile");
		destino4.setCiudad("Santiago");
		destino4.setAeropuerto("Arturo Merino Benitez");

		Destino destino5 = new Destino();
		destino5.setPais("Peru");
		destino5.setCiudad("Lima");
		destino5.setAeropuerto("Jorge Chavez");

		Destino destino6 = new Destino();
		destino6.setPais("USA");
		destino6.setCiudad("Nueva York");
		destino6.setAeropuerto("John F. Kennedy");
		////////////
		Origen origen1 = new Origen();
		origen1.setPais("USA");
		origen1.setCiudad("Nueva York");
		origen1.setAeropuerto("John F. Kennedy");

		Origen origen2 = new Origen();
		origen2.setPais("Peru");
		origen2.setCiudad("Lima");
		origen2.setAeropuerto("Jorge Chavez");

		Origen origen3 = new Origen();
		origen3.setPais("Chile");
		origen3.setCiudad("Santiago");
		origen3.setAeropuerto("Arturo Merino Benitez");

		Origen origen4 = new Origen();
		origen4.setPais("Bolivia");
		origen4.setCiudad("La Paz");
		origen4.setAeropuerto("El Alto");

		Origen origen5 = new Origen();
		origen5.setPais("Rusia");
		origen5.setCiudad("Moscu");
		origen5.setAeropuerto("Sheremetievo");

		Origen origen6 = new Origen();
		origen6.setPais("Italia");
		origen6.setCiudad("Roma");
		origen6.setAeropuerto("Fiumicino");

		Avion avion1 = new Avion();
		avion1.setMarca("Boeing");
		avion1.setModelo("747");
		avion1.setCapacidad("366");
		avion1.setNumeroAsientos("350");

		Avion avion2 = new Avion();
		avion2.setMarca("Airbus");
		avion2.setModelo("A340");
		avion2.setCapacidad("400");
		avion2.setNumeroAsientos("375");

		Avion avion3 = new Avion();
		avion3.setMarca("McDonnell");
		avion3.setModelo("MD-80");
		avion3.setCapacidad("357");
		avion3.setNumeroAsientos("357");

		Avion avion4 = new Avion();
		avion4.setMarca("Boeing");
		avion4.setModelo("757");
		avion4.setCapacidad("187");
		avion4.setNumeroAsientos("287");

		Avion avion5 = new Avion();
		avion5.setMarca("Embraer");
		avion5.setModelo("170");
		avion5.setCapacidad("184");
		avion5.setNumeroAsientos("193");

		Avion avion6 = new Avion();
		avion6.setMarca("Airbus");
		avion6.setModelo("A320");
		avion6.setCapacidad("150");
		avion6.setNumeroAsientos("150");

		Pasajero pasajero1 = new Pasajero();
		pasajero1.setNombre("Juan G.");
		pasajero1.setCi("20154788");

		Pasajero pasajero2 = new Pasajero();
		pasajero2.setNombre("Pedro V.");
		pasajero2.setCi("56124788");

		Pasajero pasajero3 = new Pasajero();
		pasajero3.setNombre("Alfonzo Veracruz");
		pasajero3.setCi("2017766");

		Pasajero pasajero4 = new Pasajero();
		pasajero4.setNombre("Fernando Aguilar");
		pasajero4.setCi("78541125");

		Pasajero pasajero5 = new Pasajero();
		pasajero5.setNombre("Pablo S.");
		pasajero5.setCi("77898525");

		Pasajero pasajero6 = new Pasajero();
		pasajero6.setNombre("Zulema Perales");
		pasajero6.setCi("10927845");

		estandar1.setAvion(avion1);
		estandar2.setAvion(avion2);

		infante1.setAvion(avion3);
		infante2.setAvion(avion4);

		solitario1.setAvion(avion5);
		solitario2.setAvion(avion6);

		estandar1.setCostoPasaje("400 Bs.");
		estandar2.setCostoPasaje("500 Bs.");

		infante1.setCostoEspecial("350 Bs.");
		infante2.setCostoEspecial("345 Bs.");

		solitario1.setCostoPasaje("456 Bs.");
		solitario2.setCostoPasaje("354 Bs.");

		estandar1.setDestino(destino1);
		estandar2.setDestino(destino2);

		infante1.setDestino(destino3);
		infante2.setDestino(destino4);

		solitario1.setDestino(destino5);
		solitario2.setDestino(destino6);

		estandar1.setOrigen(origen1);
		estandar2.setOrigen(origen2);

		infante1.setOrigen(origen3);
		infante2.setOrigen(origen4);

		solitario1.setOrigen(origen5);
		solitario2.setOrigen(origen6);

		estandar1.setNumeroAsiento("50");
		estandar2.setNumeroAsiento("101");

		infante1.setNumeroAsiento("35");
		infante2.setNumeroAsiento("40");

		solitario1.setNumeroAsiento("100");
		solitario2.setNumeroAsiento("150");

		estandar1.setPasajero(pasajero1);
		estandar2.setPasajero(pasajero2);

		infante1.setPasajero(pasajero3);
		infante2.setPasajero(pasajero4);

		solitario1.setPasajero(pasajero5);
		solitario2.setPasajero(pasajero6);

		estandar1.setNumeroVuelo("504");
		estandar2.setNumeroVuelo("444");

		infante1.setNumeroVuelo("306");
		infante2.setNumeroVuelo("654");

		solitario1.setNumeroVuelo("852");
		solitario2.setNumeroVuelo("132");

		estandar1.create();
		estandar2.create();

		infante1.create();
		infante2.create();

		solitario1.create();
		solitario2.create();

	}

}
