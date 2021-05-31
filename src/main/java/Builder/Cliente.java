package Builder;

public class Cliente {

    public static void main(String[] args) {

        Dueno manu = new Dueno();
        Lomito lomito = new Lomito();
        Tira tira = new Tira();
        Bife bife = new Bife();

        System.out.println("----------------------");
        manu.setBuilderPlato(bife);
        manu.prepararPlato();
        manu.getPlato().mostrarInfo();
        System.out.println("----------------------");
        manu.setBuilderPlato(tira);
        manu.prepararPlato();
        manu.getPlato().mostrarInfo();
        System.out.println("----------------------");
        manu.setBuilderPlato(lomito);
        manu.prepararPlato();
        manu.getPlato().mostrarInfo();


    }

}
