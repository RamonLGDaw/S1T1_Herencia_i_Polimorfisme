package nivell_2.exercici_1.model;

public class Telefon {

    private String model;
    private String marca;

    public Telefon(String marca, String model){
        this.marca = marca;
        this.model = model;
    }

    public void trucar(String numero){
        System.out.println("S'està trucant al: " + numero);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
