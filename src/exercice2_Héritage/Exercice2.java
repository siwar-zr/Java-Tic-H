package exercice2_Héritage;

import java.util.Scanner;

// 1. Classe Employe
class Employe {
    private String nom;
    private double salaire;

    public Employe(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public double calculerSalaire() {
        return salaire;
    }
}

// 2. Classe Manager (hérite de Employe)
class Manager extends Employe {
    private double prime;

    public Manager(String nom, double salaire, double prime) {
        super(nom, salaire);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + prime;
    }
}

// 3. Classe principale avec la méthode main
public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voulez-vous créer un employé (1) ou un manager (2) ?");
        int choix = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le newline après le nextInt()

        if (choix == 1) {
            // Création d'un employé
            System.out.println("Nom de l'employé:");
            String nom = scanner.nextLine();

            System.out.println("Salaire de l'employé:");
            double salaire = scanner.nextDouble();
            scanner.nextLine(); // Pour consommer le newline après le nextDouble()

            Employe employe = new Employe(nom, salaire);
            System.out.println("\nNom de l'employé: " + employe.getNom());
            System.out.println("Salaire final de l'employé: " + employe.calculerSalaire());

        } else if (choix == 2) {
            // Création d'un manager
            System.out.println("Nom du manager:");
            String nom = scanner.nextLine();

            System.out.println("Salaire du manager:");
            double salaire = scanner.nextDouble();

            System.out.println("Prime du manager:");
            double prime = scanner.nextDouble();
            scanner.nextLine(); // Pour consommer le newline après le nextDouble()

            Manager manager = new Manager(nom, salaire, prime);
            System.out.println("\nNom du manager: " + manager.getNom());
            System.out.println("Salaire final du manager: " + manager.calculerSalaire());
        } else {
            System.out.println("Choix invalide.");
        }

        scanner.close();
    }
}

