package CorrectionExamens.ExamenJavaJuin2020;

import java.util.ArrayList;
import java.util.Comparator;

public class ServiceInfo {
    private ArrayList<Collaborateur> lesCollaborateurs;

    public ServiceInfo() {
        lesCollaborateurs = new ArrayList<>();
    }

    public void ajouterCollaborateur(Collaborateur c) {
        for (Collaborateur collab : lesCollaborateurs) {
            if (collab.equals(c)) {
                return; // Déjà présent, on n'ajoute pas
            }
        }
        lesCollaborateurs.add(c);
    }

    public Collaborateur retirerCollaborateurMoinsCher(int n) {
        if (lesCollaborateurs.isEmpty()) return null;

        Collaborateur moinsCher = lesCollaborateurs.get(0);
        for (Collaborateur c : lesCollaborateurs) {
            if (c.calculCoutProjet(n) < moinsCher.calculCoutProjet(n)) {
                moinsCher = c;
            }
        }
        lesCollaborateurs.remove(moinsCher);
        return moinsCher;
    }

    public ArrayList<Collaborateur> triCroissantParCout(int n) {
        ArrayList<Collaborateur> sorted = new ArrayList<>(lesCollaborateurs);
        sorted.sort(Comparator.comparingDouble(c -> c.calculCoutProjet(n)));
        return sorted;
    }
}

