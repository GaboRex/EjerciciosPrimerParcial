package EjerciciosPrimerParcial.QuintoEjercicio;

public class Lomito extends BuilderParrilla{
    @Override
    public void buildTipoDeCarne() {
        this.parrilla.setTipoDeCarne("Jugoso Lomito");
    }

    @Override
    public void buildSaborRefresco() {
        this.parrilla.setSaborDeRefresco("Pepsi");
    }

    @Override
    public void buildGuarniciones() {
        this.parrilla.setGuarniciones("Arroz");

    }
}
