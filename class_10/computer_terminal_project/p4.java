import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("A. Print the series 0, 3, 8, 15, 24, ... up to n terms");
        System.out.println("B. Find the sum of the series S = (1/2) + (3/4) + (5/6) + (7/8) + ... + (19/20)");
        System.out.print("Enter your choice: ");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'a', 'A' -> {
                System.out.print("Enter the value of n: ");
                int n = scanner.nextInt();
                for (int i = 1; i <= n; i++) {
                    int term = i * i - 1; // Series formula
                    System.out.print(term + " ");
                }
                System.out.println();
            }
            case 'b', 'B' -> {
                double sum = 0.0;
                for (int i = 1; i < 20; i += 2) {
                    sum += (double) i / (i + 1);
                }
                System.out.println("The sum of the series is: " + sum);
            }
            default -> System.out.println("Invalid choice!");
        }
    }
}