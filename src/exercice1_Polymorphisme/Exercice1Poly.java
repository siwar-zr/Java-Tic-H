package exercice1_Polymorphisme;

import java.util.Scanner;

// 1. Classe Paiement
class Paiement {
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement effectué de " + montant + "€");
    }
}

// 2. Classe CarteBancaire (hérite de Paiement)
class CarteBancaire extends Paiement {
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + "€ effectué par carte bancaire.");
    }
}

// 3. Classe PayPal (hérite de Paiement)
class PayPal extends Paiement {
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + "€ effectué via PayPal.");
    }
}

// 4. Classe principale avec la méthode main
public class Exercice1Poly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le montant du paiement:");
        double montant = scanner.nextDouble();
        scanner.nextLine(); // Pour consommer le newline après le nextDouble()

        System.out.println("Choisissez le type de paiement:");
        System.out.println("1. Carte Bancaire");
        System.out.println("2. PayPal");
        int choix = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le newline après le nextInt()

        // Paiement paiement = new Paiement(.....)
        Paiement paiement;

        switch (choix) {
            case 1:
                paiement = new CarteBancaire();
                break;
            case 2:
                paiement = new PayPal();
                break;
            default:
                System.out.println("Choix invalide. Utilisation de la méthode générique.");
                paiement = new Paiement();
                break;
        }

        System.out.println("\nEffectuation du paiement...");
        paiement.effectuerPaiement(montant);

        scanner.close();
    }
}
