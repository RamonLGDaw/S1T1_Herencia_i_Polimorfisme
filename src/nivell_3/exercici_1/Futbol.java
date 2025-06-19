package nivell_3.exercici_1;

public class Futbol extends Noticia{

    private String competicio;
    private String club;
    private String jugador;


    public Futbol(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
        calcularPreuNoticia();
        calcularPuntuacio();
    }

    @Override
    public void calcularPreuNoticia() {
        double preuTotalNoticia = 300;
        if(this.competicio.equalsIgnoreCase("Campions")){
            preuTotalNoticia += 100;
        }

        if(this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")){
            preuTotalNoticia += 100;
        }

        if(this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")){
            preuTotalNoticia += 50;
        }

        this.setPreu(preuTotalNoticia);
    }

    @Override
    public void calcularPuntuacio() {
        int puntuacioTotal = 5;
        if(this.competicio.equalsIgnoreCase("Campions")){
            puntuacioTotal += 3;
        } else if (this.competicio.equalsIgnoreCase("Lliga")) {
            puntuacioTotal += 2;
        }

        if(this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")){
            puntuacioTotal += 1;
        }

        if(this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")){
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

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
}
