package EjerciciosPrimerParcial.E3;

public class CreadorKitEscolar extends Creador{
    @Override
    public KitEscolar createKit() {
        Mochila mochila = new Mochila();
        mochila.setTamaño("Mediana");
        mochila.setNumeroBolsillos(6);

        Deportivo deportivo = new Deportivo();
        deportivo.setColor("Azul");
        deportivo.setTalla("M");
        deportivo.setNumeroPrendas(5);

        Cuaderno cuaderno = new Cuaderno();
        cuaderno.setTipo("Oficio");
        cuaderno.setNumeroHojas(200);

        KitEscolar kit2 = new KitEscolar(mochila,deportivo,cuaderno);

        return kit2;
    }
}
