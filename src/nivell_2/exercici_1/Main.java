package nivell_2.exercici_1;

import nivell_2.exercici_1.model.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone samsung = new Smartphone("Samsung", "galaxy");

        samsung.trucar("+34 932103131");
        samsung.alarma();
        samsung.fotografiar();
    }
}
