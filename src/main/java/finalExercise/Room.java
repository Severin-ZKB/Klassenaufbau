package finalExercise;

public class Room {
    public int anzahlSitze;
    public int roomNumber;
    public boolean isBooked;

    public Room(int anzahlSitze, int roomNumber, boolean isBooked) {
        this.anzahlSitze = anzahlSitze;
        this.roomNumber = roomNumber;
        this.isBooked = isBooked;
    }

    public int getAnzahlSitze() {
        return anzahlSitze;
    }

    public void setAnzahlSitze(int anzahlSitze) {
        this.anzahlSitze = anzahlSitze;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
