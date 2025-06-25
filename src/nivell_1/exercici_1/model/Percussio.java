package nivell_1.exercici_1.model;

public class Percussio extends Instrument{

    static {
        System.out.println("Això és un bloc static, de la classe Percussió, que s'executa un cop al carregar la classe a la JVM");
    }

    {
        System.out.println("Això és un bloc d'inicialització, de la classe Percussió, que s'executa cada cop que es crea una instància.");
    }

    public Percussio(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió, en aquest cas, un " + getNom() + ".");
    }
}
