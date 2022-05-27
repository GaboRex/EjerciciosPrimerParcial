package EjerciciosPrimerParcial.E4;



public class Historia implements IMateria{
    private Estudiante estudiante;
    public Historia(){}
    @Override
    public void inscribirse() {
        System.out.println("Vamos a inscribir a " +estudiante.getNombre() + "con el numero de carnet: " +estudiante.getCi() + " a la hermosa materia de Historia");
    }

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
