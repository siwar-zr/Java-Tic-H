package gestionEmployees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Entreprise entreprise = new Entreprise(10);// Capacité pour 10 employés

        while (true) {
            System.out.println("\nMenu d'actions:");
            System.out.println("1. Ajouter un Manager");
            System.out.println("2. Ajouter un Développeur");
            System.out.println("3. Afficher tous les employés");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une action: ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer le newline après le nextInt()

            switch (choix) {
                case 1:
                    // Ajouter un Manager
                    System.out.println("Entrez le nom du manager:");
                    String nomManager = scanner.nextLine();

                    System.out.println("Entrez l'âge du manager:");
                    int ageManager = scanner.nextInt();
                    scanner.nextLine(); // Pour consommer le newline après le nextInt()

                    System.out.println("Entrez le salaire du manager:");
                    double salaireManager = scanner.nextDouble();
                    scanner.nextLine(); // Pour consommer le newline après le nextDouble()

                    System.out.println("Entrez le département du manager:");
                    String departement = scanner.nextLine();

                    Manager manager = new Manager(nomManager,ageManager,salaireManager,departement);
                    entreprise.ajouterEmploye(manager);
                    break;

                case 2:
                    // Ajouter un Développeur
                    System.out.println("Entrez le nom du développeur:");
                    String nomDeveloppeur = scanner.nextLine();

                    System.out.println("Entrez l'âge du développeur:");
                    int ageDeveloppeur = scanner.nextInt();
                    scanner.nextLine(); // Pour consommer le newline après le nextInt()

                    System.out.println("Entrez le salaire du développeur:");
                    double salaireDeveloppeur = scanner.nextDouble();
                    scanner.nextLine(); // Pour consommer le newline après le nextDouble()

                    System.out.println("Entrez le langage de programmation du développeur:");
                    String langage = scanner.nextLine();

                    Developpeur developpeur = new Developpeur(nomDeveloppeur,ageDeveloppeur,salaireDeveloppeur,langage);
                    entreprise.ajouterEmploye(developpeur);
                    break;

                case 3:
                    // Afficher tous les employés
                    entreprise.afficherTousLesEmployes();
                    break;

                case 4:
                    System.out.println("Au revoir!");
                    scanner.close();
                    return; // Quitter le programme

                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
}
