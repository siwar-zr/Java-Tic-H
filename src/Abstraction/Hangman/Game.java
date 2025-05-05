package Abstraction.Hangman;

import java.util.Scanner;
import java.util.Random;

public class Game {
    private Word[] words;
    private Word currentWord;
    private int maxAttempts = 6;
    private int wrongAttempts;
    private StringBuilder triedLetters;

    public Game(Word[] words) {
        this.words = words;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choisissez une catégorie :");
        for (Category cat : Category.values()) {
            System.out.println("- " + cat);
        }

        // Choix de catégorie sans gestion d'erreur
        System.out.print("Votre choix : ");
        String inputCategory = sc.next().toUpperCase();
        Category chosenCategory = Category.valueOf(inputCategory);

        // Sélection aléatoire d’un mot dans la catégorie choisie
        Random rand = new Random();
        int count = 0;
        for (Word w : words) {
            if (w.getCategory() == chosenCategory) count++;
        }

        int idx = rand.nextInt(count);
        int j = 0;
        for (Word w : words) {
            if (w.getCategory() == chosenCategory) {
                if (j == idx) {
                    currentWord = w;
                    break;
                }
                j++;
            }
        }

        wrongAttempts = 0;
        triedLetters = new StringBuilder();

        System.out.println("Le mot à deviner appartient à la catégorie : " + currentWord.getCategory());

        while (wrongAttempts < maxAttempts && !currentWord.isFullyRevealed()) {
            System.out.println("\nMot : " + currentWord.getMaskedWord());
            System.out.println("Tentatives restantes : " + (maxAttempts - wrongAttempts));
            System.out.println("Lettres essayées : " + triedLetters.toString());
            System.out.print("Proposez une lettre : ");

            String input = sc.next().toUpperCase();
            char letter = input.charAt(0);  // on suppose que l’utilisateur entre une lettre

            // On suppose que la lettre n’a pas été déjà essayée (pas de vérification ici)
            triedLetters.append(letter).append(' ');

            if (currentWord.revealLetter(letter)) {
                System.out.println("Bonne lettre !");
            } else {
                wrongAttempts++;
                System.out.println("Mauvaise lettre !");
                drawFigure();
            }
        }

        if (currentWord.isFullyRevealed()) {
            System.out.println("\nFélicitations ! Vous avez trouvé le mot : " + currentWord.getWord());
        } else {
            System.out.println("\nPerdu ! Le mot était : " + currentWord.getWord());
        }
        System.out.println("Nombre de tentatives restantes : " + (maxAttempts - wrongAttempts));
    }

    public void drawFigure() {
        String[] hangman = {
                "",
                "  O",
                "  O\n  |",
                "  O\n /|",
                "  O\n /|\\",
                "  O\n /|\\\n /",
                "  O\n /|\\\n / \\"
        };
        System.out.println(hangman[wrongAttempts]);
    }
}
