import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q8_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 15, 14, 30, 45);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = dateTime.format(formatter);
        System.out.println("Formatted LocalDateTime: " + formatted);
    }
} 