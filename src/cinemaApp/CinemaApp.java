package cinemaApp;

import java.util.Scanner;

public class CinemaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CinemaHall cinema = new CinemaHall(5, 10); // Création d'une salle avec 5 rangées et 10 sièges par rangée

        // Afficher l'état initial des sièges
        cinema.displaySeats();

        while (true) {
            System.out.println("\nMenu d'actions:");
            System.out.println("1. Afficher les sièges");
            System.out.println("2. Réserver un siège");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une action: ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    cinema.displaySeats();
                    break;
                case 2:
                    System.out.print("Entrez le numéro de la rangée: ");
                    int row = scanner.nextInt();
                    System.out.print("Entrez le numéro du siège: ");
                    int number = scanner.nextInt();
                    cinema.reserveSeat(row, number);
                    break;
                case 3:
                    System.out.println("Au revoir!");
                    scanner.close();
                    return; // Quitter le programme
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
}
