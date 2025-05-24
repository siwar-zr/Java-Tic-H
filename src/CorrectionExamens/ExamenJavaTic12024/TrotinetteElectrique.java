package CorrectionExamens.ExamenJavaTic12024;

import java.util.Date;

public class TrotinetteElectrique extends Vehicule {
    private String couleur;
    private int poidsMax;

    public TrotinetteElectrique(String id, String marque, String modele, String couleur, int poidsMax) {
        super(id, marque, modele);
        this.couleur = couleur;
        this.poidsMax = poidsMax;
    }

    @Override
    public boolean estDisponible() {

        return etat_vehicule == Etat.Disponible;
    }

    @Override
    public void louer(String client, Date date) {
        if(etat_vehicule == Etat.Disponible) {
            this.date_location = date;
            this.etat_vehicule = Etat.Loué;
        }
    }



    @Override
    public void retourner(Date date) {
        this.date_retour = date;
        this.etat_vehicule = Etat.Disponible;
    }

    //TrotinetteElectrique tr = new TrotinetteElectrique("id","marque"....)
}

