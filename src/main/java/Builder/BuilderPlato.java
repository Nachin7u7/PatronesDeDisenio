package Builder;

public abstract class BuilderPlato {

    protected Plato plato;

    public Plato getPlato() {
        return plato;
    }

    public void createPlato() {
        plato = new Plato();
    }

    public abstract void buildTipoCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();

}
