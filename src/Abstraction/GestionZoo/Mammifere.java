package Abstraction.GestionZoo;

public class Mammifere extends Animal {
    private double temperatureCorps;

    public Mammifere(String nom, int age, double temperatureCorps) {
        super(nom, age, TypeAnimal.MAMMIFERE);
        this.temperatureCorps = temperatureCorps;
    }

    public double getTemperatureCorps() {
        return temperatureCorps;
    }

    public void allaiter() {
        System.out.println(getNom() + " nourrit ses petits.");
    }

    @Override
    public void manger() {
        System.out.println(getNom() + " le mammifère mange sa nourriture.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " fait un bruit de mammifère.");
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Température corporelle : " + temperatureCorps + " °C");
    }
}
