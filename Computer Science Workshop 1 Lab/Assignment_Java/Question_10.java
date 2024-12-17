import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an expression (e.g., 123+345): ");
        String input = sc.nextLine();

        char operator = ' ';
        for (char ch : input.toCharArray()) {
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operator = ch;
                break;
            }
        }

        if (operator == ' ') {
            System.out.println("Invalid expression.");
            return;
        }

        String[] parts = input.split("\\" + operator);
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Sum = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Difference = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division = " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
        }
    }
}
