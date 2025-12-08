import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String fileName = "assignment_output.txt";
        String content = "This is a test.";

        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write(content);

            writer.close();

            System.out.println("Content written to " + fileName + " successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
