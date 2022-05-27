package EjerciciosPrimerParcial.E5;

public abstract class BuilderParrilla {
    protected Parrilla parrilla;

    public Parrilla getProduct(){ return parrilla; }

    public void prepararParrilla(){ this.parrilla = new Parrilla();}

    public abstract void buildTipoDeCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();

}
