package Abstraction.LoL;

public class Tireur extends Champion {
    private double portee;

    public Tireur(String nom, double pointsVie, double puissanceAttaque, double portee) {
        super(nom, pointsVie, puissanceAttaque, RoleChampion.TIREUR);
        this.portee = portee;
    }

    public double getPortee() {
        return portee;
    }

    public void tirDePrecision(Champion adversaire) {
        double degats = getPuissanceAttaque() * 1.2;
        System.out.println(getNom() + " réalise un tir de précision sur " + adversaire.getNom() + " infligeant " + degats + " dégâts.");
        adversaire.subirDegats(degats);
    }

    @Override
    public void attaquer(Champion adversaire) {
        tirDePrecision(adversaire);
    }
}
