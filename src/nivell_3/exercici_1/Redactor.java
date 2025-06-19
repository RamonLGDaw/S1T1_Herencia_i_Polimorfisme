package nivell_3.exercici_1;

import java.util.ArrayList;

public class Redactor {
    private final String DNI;
    private String nom;
    private static final double salari = 1500;
    private ArrayList<Noticia> llistaNoticies;

    public Redactor(String DNI, String nom){
        this.DNI = DNI;
        this.nom = nom;
        this.llistaNoticies = new ArrayList<>();
    }

    public String getDNI() {
        return DNI;
    }

    public ArrayList getLlistaNoticies() {
        return this.llistaNoticies;
    }

    public void setLlistaNoticies(Noticia noticia) {
        llistaNoticies.add(noticia);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
