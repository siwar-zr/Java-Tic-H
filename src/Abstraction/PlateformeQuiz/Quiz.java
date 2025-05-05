package Abstraction.PlateformeQuiz;

public class Quiz {
    private Question[] questions;
    private int score;

    public Quiz(int taille){
        questions = new Question[taille];
        score = 0;
    }

    public void AjouterQuestion(Question question, int indice){

        questions[indice] = question;
    }

    public void LanceQuizz(){
        for (Question qst : questions){
            if (qst != null){
                qst.ask();
            }
        }
    }

    public void calculScore(){
        for (int i = 0; i < questions.length; i++) {

            if (questions[i] != null){
                if (questions[i] instanceof Evaluable){
                    score += questions[i].getPoints();
                }
            }
        }
    }


    public void Final_Result(){
        System.out.println("Votre Score est : "+score);
    }
}
