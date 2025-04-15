package gestionEmployees;

public class Manager extends Employe {
    private String departement;

    // Constructeur
    public Manager(String nom, int age, double salaire, String departement) {
        super(nom, age, salaire);
        this.departement = departement;
    }

    // Méthode pour afficher les détails du manager
    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Département: " + departement);
    }
}
