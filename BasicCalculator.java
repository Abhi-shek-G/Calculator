import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ans = 0;

        while (true) {
            System.out.print("Enter the operator (+, -, *, /, %, x to exit): ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero.");
                        continue;
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }

                System.out.println("Result: " + ans);

            } else if (op == 'x' || op == 'X') {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            } else {
                System.out.println("Invalid operation!");
            }
        }

        sc.close(); // Good practice
    }
}
