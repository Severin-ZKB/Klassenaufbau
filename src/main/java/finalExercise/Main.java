package finalExercise;

import java.util.Scanner;
import finalExercise.*;
public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma("zkb", "Hard", 67, 30);
        boolean programm = true;
        while (programm) {


            Scanner sc = new Scanner(System.in);
            System.out.println("---------------------------");
            System.out.println("---1. Raum Hinzufügen -----");
            System.out.println("---------------------------");
            System.out.println("---2. Raum Suchen ---------");
            System.out.println("---------------------------");
            System.out.println("---3. freie Raume ---------");
            System.out.println("---------------------------");
            System.out.println("---4. Raum Buchen ---------");
            System.out.println("---------------------------");
            System.out.println("---5. Beenden -------------");
            System.out.println("---------------------------");
            int eingabe = sc.nextInt();
            if (eingabe == 1){
                System.out.println("Wie viele Personen haben platz? ");
                int personen = sc.nextInt();
                firma.addRoom(personen);
            } else if (eingabe == 2) {
                System.out.println("Wie viele Personen sollen platz haben? ");
                int personen = sc.nextInt();
                firma.searchRoom(personen);

            }else if (eingabe == 3) {
                firma.freeRooms();


            }else if (eingabe == 4) {
                firma.bookRoom();

            }else if (eingabe == 5) {
                programm = false;
            }
        }

    }
}
