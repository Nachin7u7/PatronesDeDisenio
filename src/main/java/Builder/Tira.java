package Builder;

public class Tira extends BuilderPlato{

    @Override
    public void buildTipoCarne() {
        plato.setTipoCarne("Tira de Carne");
    }

    @Override
    public void buildSaborRefresco() {
        plato.setSaborRefresco("Coca cola");
    }

    @Override
    public void buildGuarniciones() {
        plato.setGuarniciones("Fideo");
    }


}
