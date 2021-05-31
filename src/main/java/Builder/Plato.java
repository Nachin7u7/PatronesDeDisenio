package Builder;

public class Plato {

    private String tipoCarne;
    private String saborRefresco;
    private String guarniciones;

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public void setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        this.guarniciones = guarniciones;
    }

    public void mostrarInfo() {
        System.out.println("Tipo de carne: " + tipoCarne);
        System.out.println("Sabor soda : " + saborRefresco);
        System.out.println("Guarniciones : " + guarniciones);

    }

}
