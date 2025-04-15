package cinemaApp;

public class CinemaHall {

    private Seat[][] seats;

    // Constructeur
    public CinemaHall(int rows, int seatsPerRow) {
        this.seats = new Seat[rows][seatsPerRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                seats[i][j] = new Seat(i + 1, j + 1); // Initialisation des sièges
            }
        }
    }

    // Méthode pour afficher l'état des sièges
    public void displaySeats() {
        System.out.println("État des sièges:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j].isAvailable()) {
                    System.out.print("D"); // Disponible
                } else {
                    System.out.print("R"); // Réservé
                }
                System.out.print(" "); // Espace entre les sièges
            }
            System.out.println(); // Nouvelle ligne pour chaque rangée
        }
    }

    // Méthode pour réserver un siège
    public boolean reserveSeat(int row, int number) {
        if (row < 1 || row > seats.length || number < 1 || number > seats[row - 1].length) {
            System.out.println("Siège inexistant.");
            return false;
        }
        Seat seat = seats[row - 1][number - 1];
        if (seat.isAvailable()) {
            seat.setAvailability(false); // Réserver le siège
            System.out.println("Siège réservé avec succès.");
            return true;
        } else {
            System.out.println("Siège déjà réservé.");
            return false;
        }
    }
}
