package Exceptions.Seriesexercices;

import java.util.Scanner;
import java.time.Year;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anneeNaissance = 0;
        boolean saisieValide = false;
        int anneeActuelle = Year.now().getValue();

        do {
            System.out.print("Veuillez saisir votre année de naissance : ");
            String saisie = scanner.nextLine();

            try {
                anneeNaissance = Integer.parseInt(saisie);
                if (anneeNaissance > anneeActuelle) {
                    System.out.println("Erreur : l'année saisie est dans le futur. Veuillez réessayer.");
                } else {
                    saisieValide = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erreur : la saisie n'est pas un nombre entier valide. Veuillez réessayer.");
            }
        } while (!saisieValide);

        int age = anneeActuelle - anneeNaissance;
        System.out.println("Votre âge est : " + age + " ans.");
    }
}

