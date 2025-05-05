package Abstraction.LoL;

import java.util.Random;

public class Championnat {
    private Champion[] participants;
    private int count;
    private int[] victoires;

    public Championnat(int capacite) {
        participants = new Champion[capacite];
        victoires = new int[capacite];
        count = 0;
    }

    public boolean inscrireChampion(Champion champion) {
        if (count < participants.length) {
            participants[count] = champion;
            victoires[count] = 0;
            count++;
            return true;
        }
        return false;
    }

    public void lancerMatchAleatoire() {
        if (count < 2) {
            System.out.println("Pas assez de participants pour un match.");
            return;
        }
        Random rand = new Random();
        int i1, i2;
        do {
            i1 = rand.nextInt(count);
            i2 = rand.nextInt(count);
        } while (i1 == i2);

        Champion c1 = participants[i1];
        Champion c2 = participants[i2];

        Match match = new Match(c1, c2);
        match.lancerCombat();

        if (c1.estVivant()) {
            victoires[i1]++;
        } else {
            victoires[i2]++;
        }
    }

    public void afficherClassement() {
        System.out.println("\nClassement des champions :");
        for (int i = 0; i < count; i++) {
            System.out.println(participants[i].getNom() + " - Victoires : " + victoires[i]);
        }
    }
}