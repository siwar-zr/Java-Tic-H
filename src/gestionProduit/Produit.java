package gestionProduit;

public class Produit {

    private String nom;
    private double prix;

    // Constructeur
    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // Méthode pour afficher les détails du produit
    public void afficherDetails() {
        System.out.println("Nom du produit: " + nom);
        System.out.println("Prix du produit: " + prix + "€");
    }
}
