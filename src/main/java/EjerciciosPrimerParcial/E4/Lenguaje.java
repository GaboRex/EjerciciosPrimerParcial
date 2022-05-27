package EjerciciosPrimerParcial.E4;



public class Lenguaje implements IMateria{
    private Estudiante estudiante;
    public Lenguaje(){}
    @Override
    public void inscribirse() {
        System.out.println("Vamos a inscribir a " +estudiante.getNombre() + "con el numero de carnet: " +estudiante.getCi() + " a la hermosa materia de Lenguaje");
    }

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
