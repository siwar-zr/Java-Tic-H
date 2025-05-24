package CorrectionExamens.ExamenJavaTic2023;

import java.util.ArrayList;
import java.util.List;

public class Commune {
    private List<Habitation> lesHabitations;
    private String nom;

    public Commune(String nom) {
        this.nom = nom;
        this.lesHabitations = new ArrayList<>();
    }

    public void ajoutHabitation(Habitation habitation) {
        lesHabitations.add(habitation);
    }

    public double calculImpôtLocal() throws ImpotException {
//        double total = 0;
//        for (Habitation h : lesHabitations) {
//            total += h.impot();
//        }
        double total = lesHabitations.stream().map(h -> h.impot()).reduce(0.0,(c,e) -> c+e);
        return total;
    }
}

