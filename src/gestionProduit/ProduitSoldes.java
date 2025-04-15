package gestionProduit;

public class ProduitSoldes extends Produit {
    private double pourcentageReduction;

    // Constructeur
    public ProduitSoldes(String nom, double prix, double pourcentageReduction) {
        super(nom, prix);
        this.pourcentageReduction = pourcentageReduction;
    }

    // Méthode pour afficher les détails du produit soldé
    @Override
    public void afficherDetails() {
        double prixFinal = getPrix() - (getPrix() * pourcentageReduction / 100);
        System.out.println("Nom du produit soldé: " + getNom());
        System.out.println("Prix original: " + getPrix() + "€");
        System.out.println("Pourcentage de réduction: " + pourcentageReduction + "%");
        System.out.println("Prix après réduction: " + prixFinal + "€");
    }
}
