package nivell_1.exercici_2;

import nivell_1.exercici_2.model.Cotxe;

public class Main {
    public static void main(String[] args) {

        Cotxe cotxe1 = new Cotxe("Ranger", 250);
        Cotxe cotxe2 = new Cotxe("Escort", 120);

        System.out.println("Model segons la instància de cotxe2: " + cotxe2.getModel());
        System.out.println("Model segons la instància de cotxe1: " + cotxe1.getModel());

        System.out.println("Potència del cotxe1: " + cotxe1.getPotencia());
        System.out.println("Potència del cotxe2: " + cotxe2.getPotencia());

        System.out.println("Model del cotxe1 des de la instància: " + Cotxe.getModel());
        System.out.println("Model del cotxe1 des de la classe: " + cotxe1.getModel());

        System.out.println("Marca del cotxe1 des de la classe: " + Cotxe.getMarca());
        System.out.println("Marca del cotxe1 des de la instància: " + cotxe1.getMarca());

        cotxe1.accelerar();

        Cotxe.frenar();
    }
}
