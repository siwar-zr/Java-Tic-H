package Exceptions.Seriesexercices;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        boolean saisieValide = false;

        do {
            System.out.print("Veuillez saisir un nombre entier : ");
            String saisie = scanner.nextLine();

            try {
                nombre = Integer.parseInt(saisie);
                saisieValide = true; // La conversion a réussi
            } catch (NumberFormatException e) {
                System.out.println("Erreur : la chaîne saisie n'est pas un nombre entier valide. Veuillez réessayer.");
            }
        } while (!saisieValide);

        System.out.println("Vous avez saisi l'entier : " + nombre);
    }
}

