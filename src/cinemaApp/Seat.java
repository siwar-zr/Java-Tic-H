package cinemaApp;

public class Seat {

    private int row;
    private int number;
    private boolean isAvailable;

    public Seat(int row, int number) {
        this.row = row;
        this.number = number;
        this.isAvailable = true; // Siège disponible par défaut
    }

    public int getRow() {
        return row;
    }

    public int getNumber() {
        return number;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean availability) {
        isAvailable = availability;
    }
}
