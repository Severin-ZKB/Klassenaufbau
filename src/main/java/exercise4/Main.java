package exercise4;

import exercise4.BankAccount;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean programm = true;
        while (programm) {
            BankAccount bankAccount = new BankAccount("Max", "Mustermann", 11223, 1000.25, 500);
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Geld einzahlen");
            System.out.println("2. Geld auszahlen");
            System.out.println("3. beenden");
            int eingabe = sc.nextInt();
            if (eingabe == 1) {

                System.out.println("Wie viel möchtest du hinzufügen? :");
                int depositAmount = sc.nextInt();
                bankAccount.deposit(depositAmount);
                bankAccount.printBalance();
            } else if (eingabe == 2) {


                System.out.println("wie viel möchtest du auszahlen? :");
                int withdrawAmount = sc.nextInt();
                bankAccount.withdraw(withdrawAmount);
                bankAccount.printBalance();
            } else if (eingabe == 3) {
                programm = false;


            }



            }
        }
        }





