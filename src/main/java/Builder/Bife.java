package Builder;

public class Bife extends BuilderPlato{

    @Override
    public void buildTipoCarne() {
        plato.setTipoCarne("Bife");
    }

    @Override
    public void buildSaborRefresco() {
        plato.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarniciones() {
        plato.setGuarniciones("Papas Fritas");
    }

}
