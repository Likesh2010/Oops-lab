import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Packages1{
  public static void main(String[] args){
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    System.out.println("Current Date: " + date);
    System.out.println("Current Time: " + time);
    System.out.println("Current Date and Time: " + dateTime.format(formatter));
  }
}
