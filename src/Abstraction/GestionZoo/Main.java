package Abstraction.GestionZoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(10);

        Mammifere lion = new Mammifere("Lion", 5, 37.5);
        Oiseau perroquet = new Oiseau("Perroquet", 2, 0.4);
        Reptile serpent = new Reptile("Serpent", 3, true);

        zoo.ajouterAnimal(lion);
        zoo.ajouterAnimal(perroquet);
        zoo.ajouterAnimal(serpent);

        zoo.afficherAnimaux();

        System.out.println();

        zoo.faireTousLesBruits();

        System.out.println();


        lion.allaiter();
        perroquet.voler();
        if (serpent.isVenimeux()) {
            serpent.changerPeau();
        }
    }
}