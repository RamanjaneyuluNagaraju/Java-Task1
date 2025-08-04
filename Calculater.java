import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;
        boolean continueCalc = true;

        System.out.println("==== Java Console Calculator ====");

        while (continueCalc) {
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                case '/':
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result = " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = scanner.next();
            continueCalc = choice.equalsIgnoreCase("yes");
        }

        System.out.println("Calculator closed. Goodbye!");
        scanner.close();
    }
}
