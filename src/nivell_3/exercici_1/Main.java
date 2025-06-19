package nivell_3.exercici_1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Redactor> llistaRedactors = new ArrayList<>();

        while (true) {
            System.out.println("1.- Introduir redactor/a." +
                    "\n2.- Eliminar redactor/a." +
                    "\n3.- Introduir notícia a un redactor/a." +
                    "\n4.- Eliminar notícia (ha de demanar redactor/a i titular de la notícia)." +
                    "\n5.- Mostrar totes les notícies per redactor/a." +
                    "\n6.- Calcular puntuació de la notícia." +
                    "\n7.- Calcular preu-notícia." +
                    "\n8.- Finalitzar el programa");
            System.out.println("Tria una opció: ");
            try {
                int opcio = sc.nextInt();
                sc.nextLine();

                if (opcio > 0 && opcio < 9) {

                    switch (opcio) {
                        case 1:
                            introduirRedactor(llistaRedactors);
                            break;
                        case 2:
                            eliminarRedactor(llistaRedactors);
                            break;
                        case 3:
                            introducirNoticia(llistaRedactors);
                            break;
                        case 4:
                            eliminarNoticia(llistaRedactors);
                            break;
                        case 5:
                            mostrarNoticiesPerRedactor(llistaRedactors);
                            break;
                        case 6:
                            calcularPuntuacioNoticia(llistaRedactors);
                            break;
                        case 7:
                            calcularPreuNoticia(llistaRedactors);
                            break;
                        case 8:
                            System.out.println("El programa s'ha finalitzat");
                            return;
                    }
                } else {
                    System.out.println("Has d'introduir un valor enter del 1 al 8 (els dos inclosos)");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada no vàlida, ha de ser un número enter.");
                sc.nextLine();
            }
        }
    }

    public static Redactor recuperarRedactor(ArrayList<Redactor> llistaRedactors) {

        System.out.print("Introdueix el DNI del redactor: ");
        String dniRedactor = sc.nextLine();

        boolean redactorRecuperatCorrectament = false;
        Redactor redactorRecuperat = null;

        for (Redactor redactor : llistaRedactors) {
            if (dniRedactor.equalsIgnoreCase(redactor.getDNI())) {
                redactorRecuperat = redactor;
                redactorRecuperatCorrectament = true;
                break;
            }
        }

        if (redactorRecuperatCorrectament) {
            return redactorRecuperat;
        } else {
            System.out.println("No s'ha trobat el redactor amb DNI: " + dniRedactor);
            return null;
        }
    }

    public static Noticia recuperarNoticiaPerTitular(ArrayList<Noticia> noticies) {
        System.out.println("Introdueix el titular de la noticia: ");
        String titularNoticia = sc.nextLine();

        if (noticies.isEmpty()) {
            System.out.println("Aquest redactor no té noticies associades");
            return null;


        } else {
            for (Noticia noticia : noticies) {
                if (titularNoticia.equalsIgnoreCase(noticia.getTitular())) {
                    return noticia;
                }
            }
        }
        System.out.println("No s'ha trobat cap noticia amb aquest titular");
        return null;
    }

    private static void introduirRedactor(ArrayList<Redactor> llistaRedactors) {
        System.out.println("Introdueix el nom del redactor: ");
        String nomRedactor = sc.nextLine();
        System.out.println("Introdueix el DNI del redactor: ");
        String DNI_Redactor = sc.nextLine();

        for (Redactor redactor : llistaRedactors) {
            if (DNI_Redactor.equalsIgnoreCase(redactor.getDNI())) {
                System.out.println("Aquest DNI ja està a la llista, no s'ha pogut registrar al redactor.");
                return;
            }
        }

        Redactor nouRedactor = new Redactor(DNI_Redactor, nomRedactor);
        llistaRedactors.add(nouRedactor);
        System.out.println("Redactor afegit correctament.");
    }

    private static void eliminarRedactor(ArrayList<Redactor> llistaRedactors) {

        System.out.println("Introdueix el DNI del redactor que vols eliminar: ");
        String DNI_eliminar_redactor = sc.nextLine();
        boolean correctamentEliminat = false;

        for (int i = 0; i < llistaRedactors.size(); i++) {
            if (DNI_eliminar_redactor.equalsIgnoreCase(llistaRedactors.get(i).getDNI())) {
                llistaRedactors.remove(i);
                System.out.println("Redactor eliminat correctament.");
                correctamentEliminat = true;
                break;
            }
        }

        if (!correctamentEliminat) {
            System.out.println("No s'ha trobat el redactor amb DNI: " + DNI_eliminar_redactor);
        }
    }

    private static void introducirNoticia(ArrayList<Redactor> llistaRedactors) {
        Redactor redactorRecuperat = recuperarRedactor(llistaRedactors);

        System.out.println("Selecciona l'esport de la notícia:");
        System.out.println("1. Futbol\n2. Bàsquet\n3. Tenis\n4. F1\n5. Motociclisme");
        try {
            int tipusNoticia = sc.nextInt();
            sc.nextLine();

            if (tipusNoticia >= 1 && tipusNoticia <= 5) {
                switch (tipusNoticia) {
                    case 1:
                        System.out.print("Introdueix el titular de la notícia de futbol: ");
                        String titular = sc.nextLine();

                        System.out.print("Introdueix la competició (Campions/Lliga/etc.): ");
                        String competicio = sc.nextLine();

                        System.out.print("Introdueix el club (Barça/Madrid/etc.): ");
                        String club = sc.nextLine();

                        System.out.print("Introdueix el jugador (Ferran Torres/Benzema/etc.): ");
                        String jugador = sc.nextLine();

                        Futbol noticiaFutbol = new Futbol(titular, competicio, club, jugador);
                        redactorRecuperat.setLlistaNoticies(noticiaFutbol);
                        System.out.println("Notícia de futbol afegida correctament.");
                        break;

                    case 2:
                        System.out.print("Introdueix el titular de la notícia de Basquet: ");
                        String titularBasquest = sc.nextLine();

                        System.out.print("Introdueix la competició (Eurolliga/ACB/etc.): ");
                        String competicioBasquet = sc.nextLine();

                        System.out.print("Introdueix el club (Barça/Madrid/etc.): ");
                        String clubBasquet = sc.nextLine();

                        Basquet noticiaBasquet = new Basquet(titularBasquest, competicioBasquet, clubBasquet);
                        redactorRecuperat.setLlistaNoticies(noticiaBasquet);
                        System.out.println("Noticia de Basquet afegida correctament.");
                        break;

                    case 3:
                        System.out.println("Introdueix el titular de la noticia de tennis: ");
                        String titularTenis = sc.nextLine();
                        System.out.print("Introdueix el jugador (Federer/Nadal/Djokovic/etc.): ");
                        String jugadorTenis = sc.nextLine();

                        Tenis noticiaTenis = new Tenis(titularTenis, jugadorTenis);
                        redactorRecuperat.setLlistaNoticies(noticiaTenis);
                        System.out.println("Noticia de Tennis afegida correctament.");
                        break;

                    case 4:
                        System.out.println("Introdueix el titular de la noticia de F1: ");
                        String titularF1 = sc.nextLine();
                        System.out.print("Introdueix la escuderia de F1: ");
                        String escuderiaF1 = sc.nextLine();

                        F1 noticiaF1 = new F1(titularF1, escuderiaF1);
                        redactorRecuperat.setLlistaNoticies(noticiaF1);
                        break;


                    case 5:
                        System.out.println("Introdueix el titular de la noticia de Motociclisme: ");
                        String titularMotociclisme = sc.nextLine();
                        System.out.print("Introdueix la marca de motociclisme: ");
                        String marcaMotociclisme = sc.nextLine();

                        Motociclisme noticiaMotociclisme = new Motociclisme(titularMotociclisme, marcaMotociclisme);
                        redactorRecuperat.setLlistaNoticies(noticiaMotociclisme);
                        break;
                    default:
                        System.out.println("Opció no vàlida.");
                }
            } else {
                System.out.println("Has de triar un tipus de noticia del 1 al 5");
            }

        } catch (InputMismatchException e) {
            System.out.println("Has d'introduir un número enter del 1 al 5.");
        }
    }

    public static void eliminarNoticia(ArrayList<Redactor> llistaRedactors) {
        System.out.println("Has escollit eliminar una noticia.");

        Redactor redactorRecuperat = recuperarRedactor(llistaRedactors);


        if (redactorRecuperat == null) {
            System.out.println("No s'ha trobat cap redactor amb aquest DNI.");

        } else {
            System.out.println("Introdueix el titular de la noticia: ");
            String titularNoticia = sc.nextLine();

            ArrayList<Noticia> noticies = redactorRecuperat.getLlistaNoticies();
            boolean eliminada = false;
            for (int i = 0; i < redactorRecuperat.getLlistaNoticies().size(); i++) {
                if (titularNoticia.equals(noticies.get(i).getTitular())) {
                    redactorRecuperat.getLlistaNoticies().remove(i);
                    eliminada = true;
                    break;
                }
            }

            if (eliminada == false) {
                System.out.println("No s'ha trobat cap notícia amb aquest titular.");
            } else {
                System.out.println("Noticia eliminada correctament.11");
            }
        }
    }

    public static void mostrarNoticiesPerRedactor(ArrayList<Redactor> llistaRedactors) {
        System.out.println("Has escollit mostrar totes les noticies per redactor.");

        Redactor redactorRecuperat = recuperarRedactor(llistaRedactors);

        if (redactorRecuperat == null) {
            System.out.println("No s'ha trobat cap redactor amb aquest DNI.");

        } else {
            ArrayList<Noticia> noticies = redactorRecuperat.getLlistaNoticies();
            if (noticies.size() <= 0) {
                System.out.println("Aquest redactor no té noticies associades");
            }
            System.out.println("Noticies del redactor amb DNI " + redactorRecuperat.getDNI() + ":");

            for (Noticia noticia : noticies) {
                System.out.println("-" + noticia.getTitular());
            }

        }
    }

    public static void calcularPuntuacioNoticia(ArrayList<Redactor> llistaRedactors) {
        System.out.println("Has escollit calcular la puntuació de la noticia.");

        Redactor redactorRecuperat = recuperarRedactor(llistaRedactors);

        if (redactorRecuperat == null) {
            System.out.println("No s'ha trobat cap redactor amb aquest DNI.");

        } else {

            ArrayList<Noticia> noticies = redactorRecuperat.getLlistaNoticies();

            Noticia noticiaSeleccionada = recuperarNoticiaPerTitular(noticies);

            if (noticiaSeleccionada != null) {
                System.out.println("La puntuació de la noticia seleccionada es: "
                        + noticiaSeleccionada.getPuntuacio());
            }


        }
    }

    public static void calcularPreuNoticia(ArrayList<Redactor> llistaRedactors) {
        System.out.println("Has escollit calcular el preu de la noticia.");
        Redactor redactorRecuperat = recuperarRedactor(llistaRedactors);

        if (redactorRecuperat == null) {
            System.out.println("No s'ha trobat cap redactor amb aquest DNI.");

        } else {

            ArrayList<Noticia> noticies = redactorRecuperat.getLlistaNoticies();

            Noticia noticiaSeleccionada = recuperarNoticiaPerTitular(noticies);

            if (noticiaSeleccionada != null) {
                System.out.println("El preu de la noticia seleccionada es: "
                        + noticiaSeleccionada.getPreu() + "€");
            } else {
                System.out.println("No s'ha trobat cap noticia amb aquest titular");
            }

        }
    }
}