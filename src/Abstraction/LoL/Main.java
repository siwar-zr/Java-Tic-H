package Abstraction.LoL;

public class Main {
    public static void main(String[] args) {
        Champion tank = new Tank("Garen", 1000, 80, 30);
        Champion assassin = new Assassin("Zed", 700, 100, 1.5);
        Champion mage = new Mage("Lux", 600, 90, 100);
        Champion tireur = new Tireur("Ashe", 650, 85, 10);

        Championnat championnat = new Championnat(10);
        championnat.inscrireChampion(tank);
        championnat.inscrireChampion(assassin);
        championnat.inscrireChampion(mage);
        championnat.inscrireChampion(tireur);

        // Lancer 3 matchs aléatoires
        for (int i = 0; i < 3; i++) {
            System.out.println("\n=== Match " + (i + 1) + " ===");
            championnat.lancerMatchAleatoire();
        }

        championnat.afficherClassement();
    }
}
