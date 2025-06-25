package nivell_3.exercici_1.model;

abstract public class Noticia {
    private String titular;
    private String text = "";
    private int puntuacio;
    private double preu;

    public Noticia(String titular) {
        this.titular = titular;
    }

    abstract public void calcularPreuNoticia();

    abstract public void calcularPuntuacio();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getPreu() {
        return preu;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
}
