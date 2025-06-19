package nivell_1.exercici_1;

public class Percussio extends Instrument{

    // El bloc static s'executa un sola vegada al carregar la classe a la jvm
    static {
        System.out.println("Això és un bloc static, de la classe Percussió, que s'executa un cop al carregar la classe a la JVM");
    }

    // El bloc d'inicialització s'executa cada vegada que es crea una instància de la classe Percussió.
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
