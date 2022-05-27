package EjerciciosPrimerParcial.E1;

public class Cliente {
    public static void main(String[] args) {
      Colegio colegioSanCalixto = new Colegio();
      colegioSanCalixto.setCajero(new Cajero("Fabricio","12690909","Fabri123"));

      colegioSanCalixto.pagarMatricula(50,new Estudiantes("Gisel",1202));
      colegioSanCalixto.pagarMatricula(50,new Estudiantes("Gabriel",2610));
      colegioSanCalixto.pagarMatricula(50,new Estudiantes("Paola",2207));
      colegioSanCalixto.pagarMatricula(50,new Estudiantes("Giovanna",0207));
      colegioSanCalixto.pagarMatricula(50,new Estudiantes("Nicolas",1112));




    }
}
