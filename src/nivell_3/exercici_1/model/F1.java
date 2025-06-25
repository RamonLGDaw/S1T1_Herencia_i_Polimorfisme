package nivell_3.exercici_1.model;

public class F1 extends Noticia {

    private String escuderia;

    public F1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
        calcularPreuNoticia();
        calcularPuntuacio();
    }

    @Override
    public void calcularPreuNoticia() {
        double preuTotalNoticia = 100;
        if(this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")){
            preuTotalNoticia += 50;
        }
        this.setPreu(preuTotalNoticia);
    }

    @Override
    public void calcularPuntuacio() {
        int puntuacioTotal = 4;
        if(this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")){
            puntuacioTotal += 2;
        }

        this.setPuntuacio(puntuacioTotal);
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }
}
