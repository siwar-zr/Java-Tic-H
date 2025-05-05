package Abstraction.PlateformeQuiz;

public abstract class Question {
    protected String texte;
    protected Difficulty difficulte;
    protected int points;

    public Question(String texte, Difficulty difficulte, int points) {
        this.texte = texte;
        this.difficulte = difficulte;
        this.points = points;
    }

    public String getTexte() {
        return texte;
    }

    public Difficulty getDifficulte() {
        return difficulte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void setDifficulte(Difficulty difficulte) {
        this.difficulte = difficulte;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public abstract void ask();
}