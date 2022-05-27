package EjerciciosPrimerParcial.E1;

public class Colegio {
    private Cajero cajero;
    private  String nombreColegio;

    public Colegio() {
        this.cajero =new Cajero("Default","Default","Default");
        }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    public void pagarMatricula(int cantidad, Estudiantes estudiante){
        SingeltonVentanilla.getInstance(this.cajero).pagarMatricula(cantidad,estudiante);
    }
}

