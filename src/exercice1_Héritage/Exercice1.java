
package exercice1_Héritage;

import java.util.Scanner;

// 1. Classe Vehicule
class Vehicule {
    private String marque;
    private int vitesseMax;

    public Vehicule(String marque, int vitesseMax) {
        this.marque = marque;
        this.vitesseMax = vitesseMax;
    }

    public String getMarque() {
        return marque;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void afficherInfo() {
        System.out.println("Marque: " + marque);
        System.out.println("Vitesse Max: " + vitesseMax + " km/h");
    }
}

// 2. Classe Voiture (hérite de Vehicule)
class Voiture extends Vehicule {
    private int nombrePortes;

    public Voiture(String marque, int vitesseMax, int nombrePortes) {
        super(marque, vitesseMax);
        this.nombrePortes = nombrePortes;
    }

    public int getNombrePortes() {
        return nombrePortes;
    }

    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Nombre de Portes: " + nombrePortes);
    }
}

// 3. Classe Moto (hérite de Vehicule)
class Moto extends Vehicule {
    private int cylindree;

    public Moto(String marque, int vitesseMax, int cylindree) {
        super(marque, vitesseMax);
        this.cylindree = cylindree;
    }

    public int getCylindree() {
        return cylindree;
    }

    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Cylindrée: " + cylindree + " cc");
    }
}

// 4. Classe principale avec la méthode main
public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voulez-vous créer une voiture (1) ou une moto (2) ?");
        int choix = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le newline après le nextInt()

        if (choix == 1) {
            // Création d'une voiture
            System.out.println("Marque de la voiture:");
            String marque = scanner.nextLine();

            System.out.println("Vitesse Max de la voiture (km/h):");
            int vitesseMax = scanner.nextInt();

            System.out.println("Nombre de portes de la voiture:");
            int nombrePortes = scanner.nextInt();

            Voiture voiture = new Voiture(marque, vitesseMax, nombrePortes);
            System.out.println("\nInformations de la voiture:");
            voiture.afficherInfo();

        } else if (choix == 2) {
            // Création d'une moto
            System.out.println("Marque de la moto:");
            String marque = scanner.nextLine();

            System.out.println("Vitesse Max de la moto (km/h):");
            int vitesseMax = scanner.nextInt();

            System.out.println("Cylindrée de la moto (cc):");
            int cylindree = scanner.nextInt();
            scanner.nextLine();

            Moto moto = new Moto(marque, vitesseMax, cylindree);
            System.out.println("\nInformations de la moto:");
            moto.afficherInfo();
        } else {
            System.out.println("Choix invalide.");
        }

        scanner.close();
    }
}
