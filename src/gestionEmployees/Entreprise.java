package gestionEmployees;

public class Entreprise {

    private Employe[] employes;
    private int compteur;

    // Constructeur
    public Entreprise(int capacite) {
        this.employes = new Employe[capacite];
        this.compteur = 0;
    }

    // Méthode pour ajouter un employé
    public boolean ajouterEmploye(Employe e) {
        if (compteur < employes.length) {
            employes[compteur] = e;
            compteur++;
            return true;
        }
        System.out.println("Tableau plein. Impossible d'ajouter plus d'employés.");
        return false;
    }

    // Méthode pour afficher tous les employés
    public void afficherTousLesEmployes() {
        for (int i = 0; i < compteur; i++) {
            System.out.println("\nEmployé " + (i + 1));
            employes[i].afficherDetails();
        }
    }
}
