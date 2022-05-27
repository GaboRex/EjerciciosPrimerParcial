package EjerciciosPrimerParcial.E1;

public class SingeltonVentanilla {
    private static SingeltonVentanilla instance =null;
    private Cajero cajero ;
    private int saldo;

    private SingeltonVentanilla(Cajero cajero) {
        this.cajero = cajero;
        this.saldo = 0;
    }

    public  static SingeltonVentanilla getInstance(Cajero cajero){
        if (instance == null)
            instance = new SingeltonVentanilla(cajero);

        return instance;
    }

    public void pagarMatricula(int cantidad, Estudiantes estudiante){
        saldo = saldo+cantidad;
        System.out.println("**************************************");
        System.out.println("Codigo cajero: " +this.cajero.getCodigo() + "\nNombre: " +this.cajero.getNombre()+ "\nSaldo: " +saldo);
        System.out.println("Estudiante: " + estudiante.getNombre());
    }
    public Integer getSaldo(){
        System.out.println("Saldo: " +this.saldo);
        return this.saldo;
    }
}
