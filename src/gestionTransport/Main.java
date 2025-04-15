package gestionTransport;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez le type de véhicule:");
        System.out.println("1. Voiture");
        System.out.println("2. Camion");
        int choix = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le newline après le nextInt()

        Vehicule vehicule;

        switch (choix) {
            case 1:
                // Création d'une voiture
                System.out.println("Entrez la marque de la voiture:");
                String marqueVoiture = scanner.nextLine();

                System.out.println("Entrez le prix par jour de la voiture:");
                double prixVoiture = scanner.nextDouble();
                scanner.nextLine(); // Pour consommer le newline après le nextDouble()

                System.out.println("Entrez le type de carburant (essence/diesel):");
                String typeCarburant = scanner.nextLine();

                vehicule = new Voiture(marqueVoiture, prixVoiture, typeCarburant);
                break;

            case 2:
                // Création d'un camion
                System.out.println("Entrez la marque du camion:");
                String marqueCamion = scanner.nextLine();

                System.out.println("Entrez le prix par jour du camion:");
                double prixCamion = scanner.nextDouble();
                scanner.nextLine(); // Pour consommer le newline après le nextDouble()

                System.out.println("Entrez le poids maximum du camion (en tonnes):");
                double poidsCamion = scanner.nextDouble();
                scanner.nextLine(); // Pour consommer le newline après le nextDouble()

                vehicule = new Camion(marqueCamion, prixCamion, poidsCamion);
                break;

            default:
                System.out.println("Choix invalide.");
                scanner.close();
                return; // Sortie de la méthode main si le choix est invalide
        }

        // Demande du nombre de jours de location
        System.out.println("Entrez le nombre de jours de location:");
        int joursLocation = scanner.nextInt();

        // Calcul et affichage du prix total de location
        double prixTotal = vehicule.calculerPrixLocation(joursLocation);
        System.out.println("\nPrix total de location pour " + joursLocation + " jours: " + prixTotal + "€");

        scanner.close();
    }
}
