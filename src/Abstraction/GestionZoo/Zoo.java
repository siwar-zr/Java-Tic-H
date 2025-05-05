package Abstraction.GestionZoo;

public class Zoo {
    private Animal[] animaux;
    private int count;

    public Zoo(int capacite) {
        animaux = new Animal[capacite];
        count = 0;
    }

    public boolean ajouterAnimal(Animal animal) {
        if (count < animaux.length) {
            animaux[count] = animal;
            count++;
            return true;
        }
        return false; // Zoo plein
    }

    public void afficherAnimaux() {
        System.out.println("Liste des animaux dans le zoo :");
        for (int i = 0; i < count; i++) {
            animaux[i].afficherInfos();
            System.out.println("-----------------------");
        }
    }

    public void faireTousLesBruits() {
        System.out.println("Tous les animaux font du bruit :");
        for (int i = 0; i < count; i++) {
            animaux[i].faireDuBruit();
        }
    }
}
