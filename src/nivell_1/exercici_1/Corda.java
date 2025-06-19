package nivell_1.exercici_1;

public class Corda extends Instrument{

    // El bloc static s'executa una sola vegada al carragar-se la classe a la jvm.
    static {
        System.out.println("Això és un bloc static, de la classe Corda, que s'executa un cop al carregar la classe a la JVM");
    }


    // El bloc d'inicialització s'executa cada vegada que el crea una instancia de la classe Corda.
    {
        System.out.println("Això és un bloc d'inicialització, de la classe Corda, que s'executa cada cop que es crea una instància.");
    }

    public Corda(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de Corda, en aquest cas, un " + getNom() + ".");
    }
}


