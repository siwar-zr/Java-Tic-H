package Abstraction.PlateformeQuiz;

import java.util.Scanner;

public class OpenEndedQuestion extends Question {
    public OpenEndedQuestion(String texte, Difficulty difficulte, int points) {

        super(texte, difficulte, points);
    }

    @Override
    public void ask() {
        System.out.println(getTexte());
        System.out.println("Your answer :");
        Scanner scanner = new Scanner(System.in);
        String reponse = scanner.next();
        System.out.println("Your answer has been saved");

    }
}
