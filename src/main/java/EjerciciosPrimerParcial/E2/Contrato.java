package EjerciciosPrimerParcial.E2;

public class Contrato {

    private String nombre;
    private String apellido;

    private int sueldo;
    private  int cargaHorario;
    private Boolean cursoEduSuperior;
    private Boolean accessoPlataforma;
    private Boolean marcadoBiometrico;
    private String marcadoHoraEntrada;
    private String marcadoHoraSalida;

    public Contrato() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    public Boolean getCursoEduSuperior() {
        return cursoEduSuperior;
    }

    public void setCursoEduSuperior(Boolean cursoEduSuperior) {
        this.cursoEduSuperior = cursoEduSuperior;
    }

    public Boolean getAccessoPlataforma() {
        return accessoPlataforma;
    }

    public void setAccessoPlataforma(Boolean accessoPlataforma) {
        this.accessoPlataforma = accessoPlataforma;
    }

    public Boolean getMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(Boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcadoHoraEntrada() {
        return marcadoHoraEntrada;
    }

    public void setMarcadoHoraEntrada(String marcadoHoraEntrada) {
        this.marcadoHoraEntrada = marcadoHoraEntrada;
    }

    public String getMarcadoHoraSalida() {
        return marcadoHoraSalida;
    }

    public void setMarcadoHoraSalida(String marcadoHoraSalida) {
        this.marcadoHoraSalida = marcadoHoraSalida;
    }

    @Override
    public Object clone(){

        Contrato cloneC = new Contrato();
        cloneC.setNombre(this.getNombre());
        cloneC.setApellido(this.getApellido());
        cloneC.setSueldo(this.getSueldo());
        cloneC.setCargaHorario(this.getCargaHorario());
        cloneC.setCursoEduSuperior(this.getCursoEduSuperior());
        cloneC.setAccessoPlataforma(this.getAccessoPlataforma());
        cloneC.setMarcadoBiometrico(this.getMarcadoBiometrico());
        cloneC.setMarcadoHoraEntrada(this.getMarcadoHoraEntrada());
        cloneC.setMarcadoHoraSalida(this.getMarcadoHoraSalida());
        return cloneC;

    }

    public void mostrarInfoContrato(){
        System.out.println("\n ****  INFORMACION DEL CONTRATO *** \n");
        System.out.println("Nombre: " +nombre);
        System.out.println("Apellido: " +apellido);
        System.out.println("Sueldo: " +sueldo + "Bs");
        System.out.println("Carga Horaria: " +cargaHorario + "horas");
        System.out.println("Curso Educacion Superior: " +cursoEduSuperior);
        System.out.println("Acceso a la plataforma: " +accessoPlataforma);
        System.out.println("Marcado Biometrico: " +marcadoBiometrico);
        System.out.println("Marcado Hora de Entrada: " +marcadoHoraEntrada);
        System.out.println("Maracado Hora de Salida: " +marcadoHoraSalida);
        System.out.println();
    }
}
