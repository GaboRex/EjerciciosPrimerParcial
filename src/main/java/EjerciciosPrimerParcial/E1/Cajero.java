package EjerciciosPrimerParcial.E1;

public class Cajero {

    private String nombre;
    private String codigo;
    private String ci;

    public Cajero(String nombre, String ci, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

}
