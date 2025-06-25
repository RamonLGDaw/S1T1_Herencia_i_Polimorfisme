package nivell_1.exercici_1.model;

public class Vent extends Instrument{

    static {
        System.out.println("Això és un bloc static, de la classe Vent, que s'executa un cop al carregar la classe a la JVM");
    }

    {
        System.out.println("Això és un bloc d'inicialització, de la classe Vent, que s'executa cada cop que es crea una instància.");
    }

    public Vent(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de vent, en aquest cas, un " + getNom() + ".");
    }
}
