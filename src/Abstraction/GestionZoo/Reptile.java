package Abstraction.GestionZoo;

public class Reptile extends Animal {
    private boolean venimeux;

    public Reptile(String nom, int age, boolean venimeux) {
        super(nom, age, TypeAnimal.REPTILE);
        this.venimeux = venimeux;
    }

    public boolean isVenimeux() {
        return venimeux;
    }

    public void changerPeau() {
        System.out.println(getNom() + " mue sa peau.");
    }

    @Override
    public void manger() {
        System.out.println(getNom() + " le reptile mange sa proie.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " fait un bruit de reptile.");
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Venimeux : " + (venimeux ? "Oui" : "Non"));
    }
}