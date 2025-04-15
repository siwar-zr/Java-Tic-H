package gestionTransport;

public class Voiture extends Vehicule {
    private String typeCarburant;

    // Constructeur
    public Voiture(String marque, double prixParJour, String typeCarburant) {
        super(marque, prixParJour);
        this.typeCarburant = typeCarburant;
    }

    // Méthode pour calculer le prix total de location avec supplément pour diesel
    @Override
    public double calculerPrixLocation(int jours) {
        double prixTotal = super.calculerPrixLocation(jours);
        if (typeCarburant.equalsIgnoreCase("diesel")) {
            prixTotal += jours * 10; // Supplément de 10€ par jour pour diesel
        }
        return prixTotal;
    }
}
