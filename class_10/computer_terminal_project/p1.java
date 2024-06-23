import java.util.Scanner;
public class p1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        double ticket, discount, amount;

        System.out.print("Enter customer name: ");
        name = sc.nextLine();

        System.out.print("Enter ticket amount: ");
        ticket = sc.nextDouble();

        if (ticket > 70000) {
            discount = ticket * 0.18;
        } else if (ticket >= 55001) {
            discount = ticket * 0.16;
        } else if (ticket >= 35001) {
            discount = ticket * 0.12;
        } else if (ticket >= 25001) {
            discount = ticket * 0.1;
        } else {
            discount = ticket * 0.02;
        }

        amount = ticket - discount;

        System.out.println("\nSl. No.\t\tName\t\t Ticket Charges\t Discount\t Net Amount");
        System.out.println("-------\t\t-----\t\t --------------\t --------\t  ----------");
        System.out.println("1\t\t\t" + name + " \t\t" + ticket + "\t \t" + discount + " \t\t" + amount);
    }
}