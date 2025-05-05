package Abstraction.GestionZoo;

public class Oiseau extends Animal {
    private double envergure;

    public Oiseau(String nom, int age, double envergure) {
        super(nom, age, TypeAnimal.OISEAU);
        this.envergure = envergure;
    }

    public double getEnvergure() {
        return envergure;
    }

    public void voler() {
        System.out.println(getNom() + " vole dans le ciel.");
    }

    @Override
    public void manger() {
        System.out.println(getNom() + " l’oiseau picore sa nourriture.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " chante ou crie.");
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Envergure : " + envergure + " mètres");
    }
}
