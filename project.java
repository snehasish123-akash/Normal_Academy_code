import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, sqrt): ");
        String input = scanner.next();
        char operator = input.charAt(0);

        double result;

        if (input.equals("sqrt")) {
            if (num1 >= 0) {
                result = Math.sqrt(num1);
                System.out.println("The result is: " + result);
            } else {
                System.out.println("Error! Square root of a negative number is not allowed.");
            }
            scanner.close();
            return; // Exit after handling square root
        } 

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    scanner.close();
                    return;
                }
                break;

            default:
                System.out.println("Error! Operator is not correct");
                scanner.close();
                return;
        }

        System.out.println("The result is: " + result);
        scanner.close();
    }
}
