package Exceptions.ExerciceDevise;

public class Monnaie {

    private double valeur;
    private String devise;


    public Monnaie(double valeur, String devise) {
        this.valeur = valeur;
        this.devise = devise;
    }


    public double getValeur() {
        return this.valeur;
    }


    public String getDevise() {
        return this.devise;
    }


    public Monnaie ajouter(Monnaie m) throws DeviseIncompatible {
        if (getDevise().compareTo(m.getDevise()) != 0) {
            throw new DeviseIncompatible("Problème de devise");
        }
        return new Monnaie(getValeur() + m.getValeur(), getDevise());
    }
}

