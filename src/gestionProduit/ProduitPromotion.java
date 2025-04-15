package gestionProduit;

public class ProduitPromotion extends Produit {
    private double prixPromo;

    // Constructeur
    public ProduitPromotion(String nom, double prixPromo) {
        super(nom, prixPromo);
        this.prixPromo = prixPromo;
    }

    // Méthode pour afficher les détails du produit en promotion
    @Override
    public void afficherDetails() {
        System.out.println("Nom du produit en promotion: " + getNom());
        System.out.println("Prix promotionnel: " + prixPromo + "€");
    }
}
