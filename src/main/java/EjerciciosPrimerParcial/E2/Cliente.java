package EjerciciosPrimerParcial.E2;

public class Cliente {
    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setSueldo(5000);
        contrato.setCargaHorario(80);
        contrato.setCursoEduSuperior(true);
        contrato.setAccessoPlataforma(true);
        contrato.setMarcadoBiometrico(false);
        contrato.setMarcadoHoraEntrada("08:00");
        contrato.setMarcadoHoraSalida("18:00");

        //creando primer contrato

        Contrato c1 = (Contrato) contrato.clone();
        c1.setNombre("Pablo");
        c1.setApellido("Badani");
        c1.mostrarInfoContrato();

        //creando segundo contrato

        Contrato c2 = (Contrato) contrato.clone();
        c2.setNombre("Miguel");
        c2.setApellido("Molina");
        c2.mostrarInfoContrato();

        //creando tercer contrato

        Contrato c3 = (Contrato) contrato.clone();
        c3.setNombre("Richard");
        c3.setApellido("Rojas");
        c3.mostrarInfoContrato();

        //creando cuarto contrato

        Contrato c4 = (Contrato) contrato.clone();
        c4.setNombre("Joseph");
        c4.setApellido("Meneses");
        c4.mostrarInfoContrato();

        //creando quinto contrato

        Contrato c5 = (Contrato) contrato.clone();
        c5.setNombre("Alexis");
        c5.setApellido("Marechal");
        c5.mostrarInfoContrato();
    }
}
