package EjerciciosPrimerParcial.E4;

public class Cliente {
    public static void main(String[] args) {
        Estudiante pablito = new Estudiante();
        pablito.setNombre("Pablo Badani");
        pablito.setCi(79797989);
        IMateria inscri1 = FactoryMateria.make("Lenguaje");
        inscri1.registrarEstudiante(pablito);
        inscri1.inscribirse();

        Estudiante miguel = new Estudiante();
        miguel.setNombre("Miguel Molina");
        miguel.setCi(57575757);
        IMateria inscri2 = FactoryMateria.make("Matematicas");
        inscri2.registrarEstudiante(miguel);
        inscri2.inscribirse();

        Estudiante richard = new Estudiante();
        richard.setNombre("Richard Messi");
        richard.setCi(23233232);
        IMateria inscri3 = FactoryMateria.make("Ingles");
        inscri3.registrarEstudiante(richard);
        inscri3.inscribirse();

        Estudiante gabriel = new Estudiante();
        gabriel.setNombre("Gabriel Benitez");
        gabriel.setCi(11111123);
        IMateria inscri4 = FactoryMateria.make("Ingles");
        inscri4.registrarEstudiante(gabriel);
        inscri4.inscribirse();

        Estudiante joaquin = new Estudiante();
        joaquin.setNombre("Miguel Molina");
        joaquin.setCi(44444223);
        IMateria inscri5 = FactoryMateria.make("Historia");
        inscri5.registrarEstudiante(joaquin);
        inscri5.inscribirse();



    }
}
