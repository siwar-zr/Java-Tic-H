package Abstraction.PlateformeQuiz;

import java.util.Scanner;

public class TrueFalseQuestion extends Question implements Evaluable {
    private final boolean bonneReponse;

    public TrueFalseQuestion(String texte, Difficulty difficulte, int points, boolean bonneReponse) {
        super(texte, difficulte, points);
        this.bonneReponse = bonneReponse;
    }

    @Override
    public void ask() {
        System.out.println(getTexte());

        System.out.println("1. vrai");
        System.out.println("2. false");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
        if (evaluate(choix)){
            System.out.println("Correct Answer");
        }else{
            this.setPoints(0);
            System.out.println("Incorrect Answer");

        }
    }

    @Override
    public boolean evaluate(int reponse) {

        return (reponse==1 && bonneReponse) || (reponse == 2 && !bonneReponse);
    }
}


