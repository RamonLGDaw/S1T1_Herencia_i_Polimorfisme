package nivell_1.exercici_1;

abstract public class Instrument {

    private String nom;
    private double preu;

    public Instrument(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    abstract public void tocar();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
}
