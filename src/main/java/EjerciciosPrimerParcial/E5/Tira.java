package EjerciciosPrimerParcial.E5;

public class Tira extends BuilderParrilla{
    @Override
    public void buildTipoDeCarne() {
        this.parrilla.setTipoDeCarne("Jugoso Tira de carne");
    }

    @Override
    public void buildSaborRefresco() {
        this.parrilla.setSaborDeRefresco("CocaCola");
    }

    @Override
    public void buildGuarniciones() {
        this.parrilla.setGuarniciones("Fideo");

    }
}
