package CorrectionExamens.ExamenJavaTic2023;

public class HabitationIndividuelle extends Habitation {
    private int nbPieces;
    private boolean piscine;

    public HabitationIndividuelle(String proprietaire, String adresse, double surface,
                                  int nbPieces, boolean piscine) {
        super(proprietaire, adresse, surface);
        this.nbPieces = nbPieces;
        this.piscine = piscine;
    }

    @Override
    public double impot() throws ImpotException {
        if (surface < 0 || nbPieces < 0) {
            throw new ImpotException("Valeurs négatives détectées (surface ou pièces)");
        }
        double imp = super.impot() + (100 * nbPieces);
        if(piscine)
            imp += 500;
        return imp;
        //return super.impot() + (100 * nbPieces) + (piscine ? 500 : 0);
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Type : Individuelle");
        System.out.println("Pièces : " + nbPieces);
        System.out.println("Piscine : " + (piscine ? "Oui" : "Non"));
    }
}

