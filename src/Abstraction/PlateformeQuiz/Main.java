package Abstraction.PlateformeQuiz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MultipleChoiceQuestion questionChoixMultiple = new MultipleChoiceQuestion(
                "Quelle est la capitale de la France ?", Difficulty.MOYEN,10,new String[]{"Paris","Lyon","Marseille"},0 );
        TrueFalseQuestion quuestionVraiFaux = new TrueFalseQuestion(
                "Italie est située en Afrique ",Difficulty.FACILE,15,false
        );

        OpenEndedQuestion questionOuvert = new OpenEndedQuestion("Comment vas-tu ? ",Difficulty.MOYEN,
                20);

        Quiz quiz = new Quiz(10);

        quiz.AjouterQuestion(questionChoixMultiple,0);
        quiz.AjouterQuestion(quuestionVraiFaux,1);
        quiz.AjouterQuestion(questionOuvert,2);


        quiz.LanceQuizz();
        quiz.calculScore();

        quiz.Final_Result();

        scanner.close();
    }
}
