package Abstraction.LoL;

public class Match {
    private Champion champion1;
    private Champion champion2;

    public Match(Champion champion1, Champion champion2) {
        this.champion1 = champion1;
        this.champion2 = champion2;
    }

    public void lancerCombat() {
        System.out.println("Début du combat entre " + champion1.getNom() + " et " + champion2.getNom() + " !");
        int tour = 1;
        while (champion1.estVivant() && champion2.estVivant()) {
            System.out.println("\n--- Tour " + tour + " ---");
            champion1.attaquer(champion2);
            if (!champion2.estVivant()) break;
            champion2.attaquer(champion1);
            tour++;
        }
        if (champion1.estVivant()) {
            System.out.println("\n" + champion1.getNom() + " remporte le combat !");
        } else {
            System.out.println("\n" + champion2.getNom() + " remporte le combat !");
        }
    }
}
