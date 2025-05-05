package Exceptions.ExerciceDevise;

public class TestMonnaie {
    public static void main(String[] args) {
        // Création de deux objets Monnaie
        Monnaie m1 = new Monnaie(100.0, "EUR");
        Monnaie m2 = new Monnaie(50.0, "USD"); // Devise différente pour tester l'exception

        try {
            // Tentative d'addition
            Monnaie resultat = m1.ajouter(m2);
            System.out.println("Addition réussie : " + resultat.getValeur() + " " + resultat.getDevise());
        } catch (DeviseIncompatible e) {
            // Gestion de l'exception
            System.out.println("Erreur : " + e.getMessage());
        }

        // Deux devises identiques
        Monnaie m3 = new Monnaie(30.0, "EUR");
        try {
            Monnaie resultat2 = m1.ajouter(m3);
            System.out.println("Addition réussie : " + resultat2.getValeur() + " " + resultat2.getDevise());
        } catch (DeviseIncompatible e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
