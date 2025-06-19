package nivell_1.exercici_2;

public class Cotxe {

    private static final String marca = "Ford";
    private static String model;
    private final double potencia;

    public Cotxe(String model, double potencia) {
        this.model = model;
        this.potencia = potencia;
    }

    public static void frenar(){
        System.out.println("El cotxe està frenant.");
    }

    public void accelerar(){
        System.out.println("El vehicle està accelerant.");
    }

    public static String getMarca(){
        return marca;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Cotxe.model = model;
    }

    public double getPotencia() {
        return potencia;
    }
}
