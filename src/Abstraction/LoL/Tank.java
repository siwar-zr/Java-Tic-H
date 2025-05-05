package Abstraction.LoL;

public class Tank extends Champion {
    private double armure;

    public Tank(String nom, double pointsVie, double puissanceAttaque, double armure) {
        super(nom, pointsVie, puissanceAttaque, RoleChampion.TANK);
        this.armure = armure;
    }

    public double getArmure() {
        return armure;
    }

    public void encaisserDegats(double degats) {
        double degatsReduits = degats * (1 - armure / 100);
        System.out.println(getNom() + " encaisse les dégâts avec armure (" + armure + "%). Dégâts reçus : " + degatsReduits);
        setPointsVie(getPointsVie() - degatsReduits);
        System.out.println(getNom() + " a maintenant " + getPointsVie() + " PV.");
    }

    @Override
    public void attaquer(Champion adversaire) {
        double degatsReduits = getPuissanceAttaque() * 0.8; // dégâts réduits
        System.out.println(getNom() + " attaque (Tank) " + adversaire.getNom() + " avec " + degatsReduits + " dégâts.");
        adversaire.subirDegats(degatsReduits);
    }

    @Override
    public void subirDegats(double degats) {
        encaisserDegats(degats);
    }
}
