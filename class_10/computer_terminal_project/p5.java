import java.util.Scanner;
public class p5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0, temp, digit;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        temp = num;
        while (temp > 0) {
            digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }

        if (num == sum) {
            System.out.println(num + " is a special number");
        } else {
            System.out.println(num + " is not a special number");
        }
    }
}