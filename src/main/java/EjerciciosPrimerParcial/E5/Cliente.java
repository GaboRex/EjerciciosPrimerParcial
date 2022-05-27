package EjerciciosPrimerParcial.E5;

public class Cliente {
    public static void main(String[] args) {

                MaestroParrilllero pablito = new MaestroParrilllero();
                BuilderParrilla bife    = new Bife();
                BuilderParrilla lomito = new Lomito();
                BuilderParrilla tira    = new Tira();

                pablito.setBuilder(bife);
                pablito.buildParrilla();
                Parrilla p1  = pablito.getParrillaHecha();
                p1.mostrarInfoParrilla();

                pablito.setBuilder(lomito);
                pablito.buildParrilla();
                Parrilla p2   = pablito.getParrillaHecha();
                p2.mostrarInfoParrilla();

                pablito.setBuilder(tira);
                pablito.buildParrilla();
                Parrilla p3   = pablito.getParrillaHecha();
                p3.mostrarInfoParrilla();
            }
        }

