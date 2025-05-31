import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q7_DateTimeAPI {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        LocalDate twoWeeksLater = LocalDate.now().plusWeeks(2);
        System.out.println("Date 2 weeks from today: " + twoWeeksLater);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = LocalDate.now().format(formatter);
        System.out.println("Current date (MM/dd/yyyy): " + formattedDate);
    }
} 