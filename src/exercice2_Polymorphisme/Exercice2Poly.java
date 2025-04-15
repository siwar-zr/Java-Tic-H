package exercice2_Polymorphisme;

import java.util.Scanner;

// 1. Classe Animal
class Animal {
    public void faireSon() {
        System.out.println("Cet animal fait un bruit.");
    }
}

// 2. Classe Chien (hérite de Animal)
class Chien extends Animal {
    @Override
    public void faireSon() {
        System.out.println("Le chien aboie : Woof!");
    }
}

// 2. Classe Chat (hérite de Animal)
class Chat extends Animal {
    @Override
    public void faireSon() {
        System.out.println("Le chat miaule : Miaou!");
    }
}

// 3. Classe principale avec la méthode main
public class Exercice2Poly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez un type d'animal:");
        System.out.println("1. Chien");
        System.out.println("2. Chat");
        int choix = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le newline après le nextInt()

        Animal animal;

        switch (choix) {
            case 1:
                animal = new Chien();
                break;
            case 2:
                animal = new Chat();
                break;
            default:
                System.out.println("Choix invalide. Utilisation de la méthode générique.");
                animal = new Animal();
                break;
        }

        System.out.println("\nFaire son...");
        animal.faireSon();

        scanner.close();
    }
}

