package nivell_3.exercici_1.model;

public class Basquet extends Noticia {

    private String competicio;
    private String club;

    public Basquet(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        calcularPreuNoticia();
        calcularPuntuacio();
    }

    @Override
    public void calcularPreuNoticia() {
        double preuTotalNoticia = 250;
        if(this.competicio.equals("Eurolliga")){
            preuTotalNoticia += 75;
        }

        if(this.club.equals("Barça") || this.club.equals("Madrid")){
            preuTotalNoticia += 75;
        }

        this.setPreu(preuTotalNoticia);
    }

    @Override
    public void calcularPuntuacio() {
        int puntuacioTotal = 4;
        if(this.competicio.equalsIgnoreCase("Eurolliga")){
            puntuacioTotal += 3;
        } else if (this.competicio.equalsIgnoreCase("ACB")) {
            puntuacioTotal += 2;
        }

        if(this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")){
            puntuacioTotal += 1;
        }

        this.setPuntuacio(puntuacioTotal);
    }

    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}
