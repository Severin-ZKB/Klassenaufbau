package finalExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Firma {
    public String firmaName;
    public String adresse;
    public int anzahlRaeume;
    public int maxPlatzRaum;
    private int roomNumber = 1;
    public ArrayList<Room> rooms = new ArrayList<Room>();
    private Room room;

    public Firma(String firmaName, String adresse, int anzahlRaeume, int maxPlatzRaum) {
        this.firmaName = firmaName;
        this.adresse = adresse;
        this.maxPlatzRaum = maxPlatzRaum;
        this.anzahlRaeume = anzahlRaeume;

    }
    public void freeRooms() {
        for(Room room : rooms) {
            if (!room.isBooked) {
                System.out.println(room.getRoomNumber());
            }
        }



    }
    public void addRoom(int capacity) {
        rooms.add(new Room(capacity, roomNumber, false ));
        roomNumber++;
    }
    public void searchRoom(int capacity) {
        for(Room room : rooms) {
            if(room.getAnzahlSitze() == capacity){
                System.out.println(room.getRoomNumber());
            }
        }
    }
    public void bookRoom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("welchen Raum willst du buchen?");
        int roomBuchen = sc.nextInt();
        Room room = rooms.get(roomBuchen - 1);
        room.isBooked = true;


    }
}

