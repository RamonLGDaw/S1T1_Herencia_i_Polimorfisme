package nivell_3.exercici_1.model;

public class Motociclisme extends Noticia {

    private String marca;

    public Motociclisme(String titular, String marca) {
        super(titular);
        this.marca = marca;
        calcularPreuNoticia();
        calcularPuntuacio();
    }

    @Override
    public void calcularPreuNoticia() {
        double preuTotalNoticia = 100;
        if(this.marca.equalsIgnoreCase("Honda") || this.marca.equalsIgnoreCase("Yamaha")){
            preuTotalNoticia += 50;
        }
        this.setPreu(preuTotalNoticia);
    }

    @Override
    public void calcularPuntuacio() {
        int puntuacioTotal = 3;
        if(this.marca.equalsIgnoreCase("Honda") || this.marca.equalsIgnoreCase("Yamaha")){
            puntuacioTotal += 3;
        }

        this.setPuntuacio(puntuacioTotal);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
