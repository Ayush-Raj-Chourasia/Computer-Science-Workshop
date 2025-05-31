import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Q9_SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start date (YYYY-MM-DD): ");
        String startDateStr = scanner.nextLine();
        System.out.print("Enter initial amount: ");
        double principal = scanner.nextDouble();
        double rate = 8.0;

        LocalDate startDate = LocalDate.parse(startDateStr);
        LocalDate currentDate = LocalDate.now();
        long days = ChronoUnit.DAYS.between(startDate, currentDate);
        double years = days / 365.0;
        double interest = principal * rate * years / 100.0;
        double total = principal + interest;

        System.out.println("Number of days: " + days);
        System.out.printf("Simple Interest: %.2f\n", interest);
        System.out.printf("Total Amount: %.2f\n", total);
        scanner.close();
    }
} 