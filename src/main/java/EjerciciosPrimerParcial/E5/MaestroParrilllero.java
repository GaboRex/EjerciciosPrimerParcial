package EjerciciosPrimerParcial.E5;

public class MaestroParrilllero {

    private BuilderParrilla builder;

    public Parrilla getParrillaHecha(){
        return builder.getProduct();
    }

    public void setBuilder(BuilderParrilla builder) {
        this.builder = builder;
    }

    public void buildParrilla(){
        this.builder.prepararParrilla();
        this.builder.buildTipoDeCarne();
        this.builder.buildSaborRefresco();
        this.builder.buildGuarniciones();

    }
}
