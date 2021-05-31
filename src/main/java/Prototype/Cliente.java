package Prototype;

public class Cliente {

    public static void main(String[] args) {

        Contrato docente1 = new Contrato();

        docente1.setSalida(1800);
        docente1.setNombre("Cristiano");
        docente1.setApellido("Rolando");
        docente1.setSueldo(5000);
        docente1.setEntrada(800);
        docente1.setMarcado(false);
        docente1.setCursoSuperior(true);
        docente1.setAcceso(true);
        docente1.setCargaHoraria(8);

        Contrato docente2 = (Contrato) docente1.clone();
        docente2.setNombre("Sofia");
        docente2.setApellido("Vidal");

        Contrato docente3 = (Contrato) docente1.clone();
        docente2.setNombre("Ximena");
        docente2.setApellido("Vidal");

        Contrato docente4 = (Contrato) docente1.clone();
        docente2.setNombre("Carolina");
        docente2.setApellido("Flores");

        Contrato docente5 = (Contrato) docente1.clone();
        docente2.setNombre("Carolina");
        docente2.setApellido("Pari");

        Contrato docente6 = (Contrato) docente1.clone();
        docente2.setNombre("Carolina");
        docente2.setApellido("Cahuna");

        Contrato docente7 = (Contrato) docente1.clone();
        docente2.setNombre("Cristina");
        docente2.setApellido("Vidal");

        Contrato docente8 = (Contrato) docente1.clone();
        docente2.setNombre("Gilda");
        docente2.setApellido("Vidal");

        Contrato docente9 = (Contrato) docente1.clone();
        docente2.setNombre("Carolina");
        docente2.setApellido("Flores");

        Contrato docente10 = (Contrato) docente1.clone();
        docente2.setNombre("Carolina");
        docente2.setApellido("Morales");

        Contrato docente11 = (Contrato) docente1.clone();
        docente2.setNombre("Carolina");
        docente2.setApellido("Uymanta");

        Contrato docente12 = (Contrato) docente1.clone();
        docente2.setNombre("Carolina");
        docente2.setApellido("Rojas");

        Contrato docente13 = (Contrato) docente1.clone();
        docente2.setNombre("Mohana");
        docente2.setApellido("Vidal");

        Contrato docente14 = (Contrato) docente1.clone();
        docente2.setNombre("Merida");
        docente2.setApellido("Vidal");

        Contrato docente15 = (Contrato) docente1.clone();
        docente2.setNombre("Barbara");
        docente2.setApellido("Vidal");

        docente1.mostrarInfo();
        docente2.mostrarInfo();
        docente3.mostrarInfo();
        docente4.mostrarInfo();
        docente5.mostrarInfo();
        docente6.mostrarInfo();
        docente7.mostrarInfo();
        docente8.mostrarInfo();
        docente9.mostrarInfo();
        docente10.mostrarInfo();
        docente11.mostrarInfo();
        docente12.mostrarInfo();
        docente13.mostrarInfo();
        docente14.mostrarInfo();
        docente15.mostrarInfo();

    }


}
