package EjerciciosPrimerParcial.E3;

import java.util.concurrent.CompletableFuture;

public class CreadorKitColegial extends Creador{
    @Override
    public KitColegial createKit() {
        Mochila mochila = new Mochila();
        mochila.setTamaño("Ultra grande");
        mochila.setNumeroBolsillos(10);

        Libro libro = new Libro();
        libro.setAutor("Ulman");
        libro.setTipo("Informatica");

        Computadora computadora = new Computadora();
        computadora.setMarca("Asus");
        computadora.setSistemaOperativo("Windows 11");

        KitColegial kit1 = new KitColegial(mochila,libro,computadora);

        return kit1;
    }
}
