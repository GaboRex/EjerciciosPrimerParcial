package EjerciciosPrimerParcial.E6;

public class TerminalEspacio extends Traductor{
    public TerminalEspacio(int largo) {
        this.largo= largo;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(" ")){
            context.input = context.input.substring(1);
        }
            context.output = context.output + context.input.substring(0, this.largo) + " ";
            context.input = context.input.substring(this.largo);

        }
    }
