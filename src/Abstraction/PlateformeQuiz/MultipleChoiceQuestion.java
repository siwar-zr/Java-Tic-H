package Abstraction.PlateformeQuiz;

import java.util.Scanner;

public class MultipleChoiceQuestion extends Question implements Evaluable {
    private final String[] options;
    private final int bonneReponse;

    public MultipleChoiceQuestion(String texte, Difficulty difficulte, int points,
                                  String[] options, int bonneReponse) {
        super(texte, difficulte, points);
        this.options = options;
        this.bonneReponse = bonneReponse;
    }

    @Override
    public void ask() {
        System.out.println(texte);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the correct answer :");
        int reponse = scanner.nextInt();
        if (evaluate(reponse )) {
            System.out.println("Correct Answer");
        } else {
            this.setPoints(0);
            System.out.println("Incorrect Answer");

        }
    }

    @Override
    public boolean evaluate(int response) {
            return response - 1 == bonneReponse;
        }

}
