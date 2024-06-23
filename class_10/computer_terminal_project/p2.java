//      Name - MAYUK SENGUPTA
//      Class - X    Sec - ' F '
//      Roll No. 36
//      UID -
//      Session - 2024-25

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 'A' to check whether the number is Prime Number");
        System.out.println("Press 'B' to check whether the number is Automorphic Number");

        char input = sc.next().charAt(0);

        switch (input) {
            case 'a', 'A' -> {
                System.out.println("Enter a number: ");
                int n = sc.nextInt();

                if (n <= 1) {
                    System.out.println("Invalid input. Please enter a positive integer greater than 1.");
                } else {
                    boolean isPrime = true;
                    for (int i = 2; i * i <= n; i++) {
                        if (n % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    if (isPrime) {
                        System.out.println(n + " is a prime number.");
                    } else {
                        System.out.println(n + " is not a prime number.");
                    }
                }
            }
            case 'b', 'B' -> {
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                int square = num * num;
                int temp = num;
                int count = 0;
                while (temp > 0) {
                    count++;
                    temp /= 10;
                }
                int lastDigits = (int) (square % (Math.pow(10, count)));
                if (num == lastDigits) {
                    System.out.println(num + " is an automorphic number.");
                } else {
                    System.out.println(num + " is not an automorphic number.");
                }
            }
            default -> System.out.println("Invalid choice");
        }
    }
}   