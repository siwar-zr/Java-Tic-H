package gestionTransport;

public class Vehicule {

    private String marque;
    private double prixParJour;

    // Constructeur
    public Vehicule(String marque, double prixParJour) {
        this.marque = marque;
        this.prixParJour = prixParJour;
    }

    // Getters
    public String getMarque() {
        return marque;
    }

    public double getPrixParJour() {
        return prixParJour;
    }

    // Setters
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrixParJour(double prixParJour) {
        this.prixParJour = prixParJour;
    }

    // Méthode pour calculer le prix total de location
    public double calculerPrixLocation(int jours) {
        return prixParJour * jours;
    }
}
