package Abstraction.LoL;

import java.util.Random;

public class Assassin extends Champion {
    private double vitesseAttaque;
    private Random random = new Random();

    public Assassin(String nom, double pointsVie, double puissanceAttaque, double vitesseAttaque) {
        super(nom, pointsVie, puissanceAttaque, RoleChampion.ASSASSIN);
        this.vitesseAttaque = vitesseAttaque;
    }

    public double getVitesseAttaque() {
        return vitesseAttaque;
    }

    public boolean frappeCritique() {
        boolean critique = random.nextDouble() < 0.3; // 30% de chance
        if (critique) {
            System.out.println(getNom() + " réalise une frappe critique !");
        }
        return critique;
    }

    @Override
    public void attaquer(Champion adversaire) {
        double degats = getPuissanceAttaque();
        if (frappeCritique()) {
            degats *= 2;
        }
        System.out.println(getNom() + " attaque (Assassin) " + adversaire.getNom() + " avec " + degats + " dégâts.");
        adversaire.subirDegats(degats);
    }
}
