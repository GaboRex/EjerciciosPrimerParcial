package EjerciciosPrimerParcial.E3;

public class KitEscolar implements IProduct{

    private Mochila mochila;
    private Deportivo deportivo;
    private Cuaderno cuaderno;

    public KitEscolar(Mochila mochila, Deportivo deportivo, Cuaderno cuaderno) {
        this.mochila = mochila;
        this.deportivo = deportivo;
        this.cuaderno = cuaderno;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuaderno getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\n ****  KIT ESCOLAR 2022 *** \n");
        System.out.println("NUESTRA MOCHILA: ");
        System.out.println("Tamano: " +mochila.getTamaño());
        System.out.println("Numero de bolsillos: " +mochila.getNumeroBolsillos());
        System.out.println("NUESTRO DEPORTIVO: ");
        System.out.println("Color: " +deportivo.getColor());
        System.out.println("Talla: " +deportivo.getTalla());
        System.out.println("Numero de prendas: " +deportivo.getNumeroPrendas());
        System.out.println("NUESTRO CUADERNO:");
        System.out.println("Tipo: " +cuaderno.getTipo());
        System.out.println("Numero de hojas: " +cuaderno.getNumeroHojas());
        System.out.println();

    }
}
