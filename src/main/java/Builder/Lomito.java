package Builder;

public class Lomito extends BuilderPlato{

    @Override
    public void buildTipoCarne() {
        plato.setTipoCarne("Lomo");
    }

    @Override
    public void buildSaborRefresco() {
        plato.setSaborRefresco("Pepsi");
    }

    @Override
    public void buildGuarniciones() {
        plato.setGuarniciones("Arroz");
    }

}
