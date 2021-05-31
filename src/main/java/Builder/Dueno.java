package Builder;

public class Dueno {

    private BuilderPlato builderPlato;

    public void setBuilderPlato(BuilderPlato builderPlato){
        this.builderPlato = builderPlato;
    }

    public Plato getPlato(){
        return builderPlato.getPlato();
    }

    public void prepararPlato(){
        this.builderPlato.createPlato();
        this.builderPlato.buildGuarniciones();
        this.builderPlato.buildTipoCarne();
        this.builderPlato.buildSaborRefresco();
    }

}
