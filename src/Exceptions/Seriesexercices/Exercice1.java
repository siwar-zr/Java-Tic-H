package Exceptions.Seriesexercices;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        boolean divisionReussie = false;

        System.out.print("Veuillez saisir le premier nombre entier : ");
        num1 = scanner.nextInt();

        // Boucle jusqu'à ce que la division soit réussie (num2 != 0)
        do {
            System.out.print("Veuillez saisir le deuxième nombre entier : ");
            num2 = scanner.nextInt();

            try {
                int resultat = num1 / num2;
                System.out.println("Résultat : " + num1 + " / " + num2 + " = " + resultat);
                divisionReussie = true; // Sortir de la boucle
            } catch (ArithmeticException e) {
                System.out.println("Erreur : la division par zéro n'est pas autorisée. Veuillez réessayer.");
            }
        } while (!divisionReussie);
    }
}

