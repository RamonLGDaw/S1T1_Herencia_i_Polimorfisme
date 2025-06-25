package nivell_1.exercici_1;

import nivell_1.exercici_1.model.Corda;
import nivell_1.exercici_1.model.Instrument;
import nivell_1.exercici_1.model.Percussio;

public class Main {
    public static void main(String[] args) {

        Instrument violi = new Corda("Stradivarius", 5000);
        violi.tocar();
        Instrument baix = new Corda("Fender", 1500.99);
        baix.tocar();
        Instrument guitarra = new Corda("Gibson", 199.99);
        Instrument bateria = new Percussio("Yamaha",200);


    }
}


