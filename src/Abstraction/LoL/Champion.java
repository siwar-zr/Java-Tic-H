package Abstraction.LoL;

public abstract class Champion implements Combattant {
    private String nom;
    private double pointsVie;
    private double puissanceAttaque;
    private RoleChampion role;

    public Champion(String nom, double pointsVie, double puissanceAttaque, RoleChampion role) {
        this.nom = nom;
        this.pointsVie = pointsVie;
        this.puissanceAttaque = puissanceAttaque;
        this.role = role;
    }

    public String getNom() {
        return nom;
    }

    public double getPointsVie() {
        return pointsVie;
    }

    protected void setPointsVie(double pointsVie) {
        this.pointsVie = Math.max(pointsVie, 0); // PV ne peuvent pas être négatifs
    }

    public double getPuissanceAttaque() {
        return puissanceAttaque;
    }

    public RoleChampion getRole() {
        return role;
    }

    @Override
    public void afficherStats() {
        System.out.println("Champion : " + nom);
        System.out.println("Rôle : " + role);
        System.out.println("Points de vie : " + pointsVie);
        System.out.println("Puissance d'attaque : " + puissanceAttaque);
    }

    @Override
    public void attaquer(Champion adversaire) {
        System.out.println(nom + " attaque " + adversaire.getNom() + " avec " + puissanceAttaque + " dégâts.");
        adversaire.subirDegats(puissanceAttaque);
    }

    // Méthode pour gérer la réception des dégâts (peut être redéfinie)
    public void subirDegats(double degats) {
        setPointsVie(pointsVie - degats);
        System.out.println(nom + " subit " + degats + " dégâts. PV restants : " + pointsVie);
    }

    public boolean estVivant() {
        return pointsVie > 0;
    }
}