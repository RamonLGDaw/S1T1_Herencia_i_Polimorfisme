package nivell_1.exercici_2;

public class Main {
    public static void main(String[] args) {

        /**
         *  El model de cotxe es pot inicialitzar en el constructor, però en ser static serà una propietat
         *  compartida per totes les instàncies i tindrà el valor de l'última instància creada.
         */
        Cotxe cotxe1 = new Cotxe("Ranger", 250);
        Cotxe cotxe2 = new Cotxe("Escort", 120);

        System.out.println("Model segons la instància de cotxe2: " + cotxe2.getModel());
        System.out.println("Model segons la instància de cotxe1: " + cotxe1.getModel());


        // Potencia es pot obtenir des de la instància.
        System.out.println("Potència del cotxe1: " + cotxe1.getPotencia());
        System.out.println("Potència del cotxe2: " + cotxe2.getPotencia());

        /**
         * El model es pot obtenir des de la classe i ho permet des de la instància, però és una mala pràctica accedir-hi
         * des de la instància.
         */
        System.out.println("Model del cotxe1 des de la instància: " + Cotxe.getModel());
        System.out.println("Model del cotxe1 des de la classe: " + cotxe1.getModel());

        /**
         * De manera similar al cas anterior, la marca es pot obtenir des de la classe i ho permet des de la instància,
         * tot i que és una mala pràctica accedir-hi des de la instància.
         */
        System.out.println("Marca del cotxe1 des de la classe: " + Cotxe.getMarca());
        System.out.println("Marca del cotxe1 des de la instància: " + cotxe1.getMarca());

        // Prova d'accés als mètodes:
        cotxe1.accelerar(); //Accés des de la instància

        // Cotxe.accelerar(); Mostrar l'error: java: non-static method accelerar() cannot be referenced from a static context

        Cotxe.frenar(); // Accés des de la classe perquè és un mètodo static


    }
}

/**
 * Sortida per consola:
 *
 * Model segons la instància de cotxe2: Escort
 * Model segons la instància de cotxe1: Escort
 * Potència del cotxe1: 250.0
 * Potència del cotxe2: 120.0
 * Model del cotxe1 des de la instància: Escort
 * Model del cotxe1 des de la classe: Escort
 * Marca del cotxe1 des de la classe: Ford
 * Marca del cotxe1 des de la instància: Ford
 * El vehicle està accelerant.
 * El cotxe està frenant.
 */
