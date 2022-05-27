package EjerciciosPrimerParcial.E3;

import java.nio.file.WatchEvent.Kind;

public class Cliente {
    public static void main(String[] args) {
        KitEscolar kitEs = new CreadorKitEscolar().createKit();
        kitEs.mostrarInfo();

        KitColegial kitCo = new CreadorKitColegial().createKit();
        kitCo.mostrarInfo();
    }
}
