package gestionEmployees;

public class Developpeur extends Employe {
    private String langage;

    // Constructeur
    public Developpeur(String nom, int age, double salaire, String langage) {
        super(nom, age, salaire);
        this.langage = langage;
    }

    // Méthode pour afficher les détails du développeur
    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Langage de programmation: " + langage);
    }
}
