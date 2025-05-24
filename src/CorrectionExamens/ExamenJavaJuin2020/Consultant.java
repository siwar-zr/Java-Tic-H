package CorrectionExamens.ExamenJavaJuin2020;

public class Consultant extends Collaborateur {
    private double coutProjetForfaitaire;

    public Consultant(int matricule, String nom, double coutJournalier, double coutProjetForfaitaire) {
        super(matricule, nom, coutJournalier);
        this.coutProjetForfaitaire = coutProjetForfaitaire;
    }

    @Override
    public double calculCoutProjet(int n) {
        return n * coutJournalier + coutProjetForfaitaire;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Coût projet forfaitaire: " + coutProjetForfaitaire);
        System.out.println("Coût projet 10 jours: " + calculCoutProjet(10));
    }
}

