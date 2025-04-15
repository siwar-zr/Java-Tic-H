package gestionProduit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez le type de produit:");
        System.out.println("1. Produit");
        System.out.println("2. Produit Soldes");
        System.out.println("3. Produit Promotion");

        int choix = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le newline après le nextInt()

        Produit produit;

        switch (choix) {
            case 1:
                // Création d'un produit simple
                System.out.println("Entrez le nom du produit:");
                String nomProduit = scanner.nextLine();

                System.out.println("Entrez le prix du produit:");
                double prixProduit = scanner.nextDouble();

                produit = new Produit(nomProduit, prixProduit);
                break;

            case 2:
                // Création d'un produit soldé
                System.out.println("Entrez le nom du produit soldé:");
                String nomSoldes = scanner.nextLine();

                System.out.println("Entrez le prix du produit soldé:");
                double prixSoldes = scanner.nextDouble();

                System.out.println("Entrez le pourcentage de réduction:");
                double reduction = scanner.nextDouble();

                produit = new ProduitSoldes(nomSoldes, prixSoldes, reduction);
                break;

            case 3:
                // Création d'un produit en promotion
                System.out.println("Entrez le nom du produit en promotion:");
                String nomPromo = scanner.nextLine();

                System.out.println("Entrez le prix promotionnel:");
                double prixPromo = scanner.nextDouble();

                produit = new ProduitPromotion(nomPromo, prixPromo);
                break;

            default:
                System.out.println("Choix invalide.");
                scanner.close();
                return; // Sortie de la méthode main si le choix est invalide
        }

        // Affichage des détails du produit (polymorphisme)
        System.out.println("\nDétails du produit:");
        produit.afficherDetails();

        scanner.close();
    }
}
