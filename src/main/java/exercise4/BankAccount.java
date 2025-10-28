package exercise4;

public class BankAccount {

    public String nachname;
    public String vorname;
    public int accountNummer;
    public double balance;
    public int limit;


    public BankAccount(String nachname, String vorname, int accountNummer, double balance, int limit) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.accountNummer = accountNummer;
        this.balance = balance;
        this.limit = limit;

    }

    public void withdraw(double amount) {
        if  (balance > amount) {
            System.out.println("Du bist Geringverdiener");
            if(amount > limit) {
                System.out.println("limit überschritten");

            }
            else  {
                balance -= amount;
            }
        }

        }


    public void deposit(int amount) {
            balance += amount;
    }
    public void printBalance() {
        System.out.println(balance);
    }

}
