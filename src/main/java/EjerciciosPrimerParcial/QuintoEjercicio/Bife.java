package EjerciciosPrimerParcial.QuintoEjercicio;

public class Bife extends BuilderParrilla{
    @Override
    public void buildTipoDeCarne() {
        this.parrilla.setTipoDeCarne("Jugoso Bife");
    }

    @Override
    public void buildSaborRefresco() {
        this.parrilla.setSaborDeRefresco("CocaCola");
    }

    @Override
    public void buildGuarniciones() {
        this.parrilla.setGuarniciones("Papas fritas");

    }
}
