import java.io.FileWriter;
import java.io.IOException;

public class File3 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt", true); // true = append mode
            writer.write("\nAppended line using FileWriter.");
            writer.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to file.");
            e.printStackTrace();
        }
    }
}
