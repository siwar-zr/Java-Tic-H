package CorrectionExamens.ExamenJavaJuin2020;

public abstract class Collaborateur implements ICollaborateur {
    protected int matricule;
    protected String nom;
    protected double coutJournalier;

    public Collaborateur(int matricule, String nom, double coutJournalier) {
        this.matricule = matricule;
        this.nom = nom;
        this.coutJournalier = coutJournalier;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public double getCoutJournalier() {
        return coutJournalier;
    }

    @Override
    public boolean equals(Collaborateur o) {
        return matricule == o.getMatricule();

    }

    @Override
    public boolean moinsCher(Collaborateur c, int n) {
        return this.coutJournalier*n <= c.getCoutJournalier()*n;
    }

    public void afficher() {
        System.out.println(matricule + " " + nom + " " + coutJournalier);
    }

    public abstract double calculCoutProjet(int n);
}

