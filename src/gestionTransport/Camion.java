package gestionTransport;

public class Camion extends Vehicule {
    private double poidsMax;

    // Constructeur
    public Camion(String marque, double prixParJour, double poidsMax) {
        super(marque, prixParJour);
        this.poidsMax = poidsMax;
    }

    // Méthode pour calculer le prix total de location avec tarif spécial pour camions lourds
    @Override
    public double calculerPrixLocation(int jours) {
        double prixTotal = super.calculerPrixLocation(jours);
        if (poidsMax > 3) {
            prixTotal += jours * 50; // Supplément de 50€ par jour pour camions de plus de 3 tonnes
        }
        return prixTotal;
    }
}
