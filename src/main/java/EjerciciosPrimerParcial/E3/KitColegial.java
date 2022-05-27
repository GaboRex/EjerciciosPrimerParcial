package EjerciciosPrimerParcial.E3;

public class KitColegial implements IProduct{
    private Mochila mochila;
    private Libro libro;
    private Computadora computadora;

    public KitColegial(Mochila mochila, Libro libro, Computadora computadora) {
        this.mochila = mochila;
        this.libro = libro;
        this.computadora = computadora;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\n ****  KIT COLEGIAL 2022 *** \n");
        System.out.println("NUESTRA MOCHILA: ");
        System.out.println("Tamano: " +mochila.getTamaño());
        System.out.println("Numero de bolsillos: " +mochila.getNumeroBolsillos());
        System.out.println("NUESTRO LIBRO: ");
        System.out.println("Autor: " +libro.getAutor());
        System.out.println("Tipo: " +libro.getTipo());
        System.out.println("NUESTRA COMPUTADORA:");
        System.out.println("Marca: " +computadora.getMarca());
        System.out.println("Sistema Operativo: " +computadora.getSistemaOperativo());
        System.out.println();
    }
}
