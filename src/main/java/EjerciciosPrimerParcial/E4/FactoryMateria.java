package EjerciciosPrimerParcial.E4;

public class FactoryMateria {
    public static IMateria make(String typeProduct){
        IMateria materia;
        switch (typeProduct.toLowerCase()){
            case "matematicas":
                materia = new Matematicas();
                break;
            case "lenguaje":
                materia = new Lenguaje();
                break;
            case "ingles":
                materia = new Ingles();
                break;
            default:
                materia = new Historia();
                break;
        }
        return materia;
    }
}
