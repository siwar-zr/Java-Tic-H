package gestionEmployees;

public class Employe {

    private String nom;
    private int age;
    private double salaire;

    // Constructeur
    public Employe(String nom, int age, double salaire) {
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public double getSalaire() {
        return salaire;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    // Méthode pour afficher les détails de l'employé
    public void afficherDetails() {
        System.out.println("Nom: " + nom);
        System.out.println("Âge: " + age);
        System.out.println("Salaire: " + salaire + "€");
    }
}
