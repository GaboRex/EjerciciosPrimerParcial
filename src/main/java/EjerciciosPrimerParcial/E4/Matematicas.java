package EjerciciosPrimerParcial.E4;



public class Matematicas implements IMateria{
    private Estudiante estudiante;
    public Matematicas(){}
    @Override
    public void inscribirse() {
        System.out.println("Vamos a inscribir a " +estudiante.getNombre() + "con el numero de carnet: " +estudiante.getCi() + " a la hermosa materia de Matematicas");
    }

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
