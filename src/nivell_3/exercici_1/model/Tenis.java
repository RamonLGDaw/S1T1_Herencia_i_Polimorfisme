package nivell_3.exercici_1.model;

public class Tenis extends Noticia {
    private String jugador;

    public Tenis(String titular, String jugador) {
        super(titular);
        this.jugador = jugador;
        calcularPreuNoticia();
        calcularPuntuacio();
    }

    @Override
    public void calcularPreuNoticia() {
        double preuTotal = 150;
        if(this.jugador.equalsIgnoreCase("Federer")
                || this.jugador.equalsIgnoreCase("Nadal")
                || this.jugador.equalsIgnoreCase("Djokovic")){
            preuTotal += 100;
        }

        this.setPreu(preuTotal);
    }

    @Override
    public void calcularPuntuacio() {
        int puntsInicials = 4;

        if(this.jugador.equalsIgnoreCase("Federer")
                || this.jugador.equalsIgnoreCase("Nadal")
                || this.jugador.equalsIgnoreCase("Djokovic")){
            puntsInicials += 3;
        }

        this.setPuntuacio(puntsInicials);
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
}
