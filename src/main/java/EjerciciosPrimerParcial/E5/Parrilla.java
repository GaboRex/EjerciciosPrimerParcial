package EjerciciosPrimerParcial.E5;

public class Parrilla {
    private String tipoDeCarne;
    private String saborDeRefresco;
    private String guarniciones;

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
    }

    public String getSaborDeRefresco() {
        return saborDeRefresco;
    }

    public void setSaborDeRefresco(String saborDeRefresco) {
        this.saborDeRefresco = saborDeRefresco;
    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        this.guarniciones = guarniciones;
    }
    public void mostrarInfoParrilla(){
        System.out.println("\n ****  UN MOMENTO LOS MAESTROS PARRILLEROS ESTAN TRABAJANDO *** \n");
        System.out.println("Tu tipo de carne es: " +tipoDeCarne);
        System.out.println("Tu sabor de refresco es: " +saborDeRefresco);
        System.out.println("Tus guarniciones son: " +guarniciones);
        System.out.println();
    }
}
