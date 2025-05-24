package CorrectionExamens.ExamenJavaTic2023;

public class Habitation {
    protected String proprietaire;
    protected String adresse;
    protected double surface;

    public Habitation(String proprietaire, String adresse, double surface) {
        this.proprietaire = proprietaire;
        this.adresse = adresse;
        this.surface = surface;
    }

    public double impot() {
        return 2 * surface;
    }

    public void affiche() {
        System.out.println("Propriétaire : " + proprietaire);
        System.out.println("Adresse : " + adresse);
        System.out.println("Surface : " + surface + " m²");
    }
}

