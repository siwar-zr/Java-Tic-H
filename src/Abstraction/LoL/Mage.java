package Abstraction.LoL;

public class Mage extends Champion {
    private double mana;

    public Mage(String nom, double pointsVie, double puissanceAttaque, double mana) {
        super(nom, pointsVie, puissanceAttaque, RoleChampion.MAGE);
        this.mana = mana;
    }

    public double getMana() {
        return mana;
    }

    public void regenererMana(double montant) {
        mana += montant;
        System.out.println(getNom() + " régénère " + montant + " mana. Mana actuel : " + mana);
    }

    public void lancerSort(Champion adversaire) {
        double coutSort = 20;
        if (mana >= coutSort) {
            mana -= coutSort;
            double degatsSort = getPuissanceAttaque() * 1.5;
            System.out.println(getNom() + " lance un sort sur " + adversaire.getNom() + " infligeant " + degatsSort + " dégâts.");
            adversaire.subirDegats(degatsSort);
            System.out.println(getNom() + " a maintenant " + mana + " mana.");
        } else {
            System.out.println(getNom() + " n'a pas assez de mana pour lancer un sort.");
        }
    }

    @Override
    public void attaquer(Champion adversaire) {
        lancerSort(adversaire);
    }
}
