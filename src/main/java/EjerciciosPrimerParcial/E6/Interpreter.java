package EjerciciosPrimerParcial.E6;
import java.util.ArrayList;
import java.util.List;
public class Interpreter extends Traductor{
    private List<Traductor> grammar =new ArrayList<>();
    private Context context;


    public Interpreter(String msgToInterpret) {
        context = new Context(msgToInterpret);
        for (String charOriginal : msgToInterpret.split(" ")) {
            switch (charOriginal){
                case "Como":
                    grammar.add(new TerminalComo(charOriginal.length()));
                    break;
                case "Quiero":
                    grammar.add(new TerminalQuiero(charOriginal.length()));
                    break;
                case "Para":
                    grammar.add(new TerminalPara(charOriginal.length()));
                    break;
                default:
                    grammar.add(new TerminalEspacio(charOriginal.length()));
                    break;
            }
        }
    }

    public String evaluateMsg(){
        for (Traductor expression:grammar) {
            expression.interpreter(context);
        }
        return context.output;
    }
    @Override
    public void interpreter(Context context) {}
}