package CorrectionExamens.ExamenJavaTic2023;

public class HabitationProfessionnelle extends Habitation {
    private int nbEmployes;

    public HabitationProfessionnelle(String proprietaire, String adresse,
                                     double surface, int nbEmployes) {
        super(proprietaire, adresse, surface);
        this.nbEmployes = nbEmployes;
    }

    @Override
    public double impot() throws ImpotException {
        if (surface < 0 || nbEmployes < 0) {
            throw new ImpotException("Valeurs négatives détectées (surface ou employés)");
        }
        return super.impot() + (nbEmployes / 10) * 1000;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Type : Professionnelle");
        System.out.println("Employés : " + nbEmployes);
    }
}

