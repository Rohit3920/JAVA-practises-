
import java.io.File;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        System.out.println("read file using file handling with java and throws 'Exception Handling' to remove exception error");

        try {
            File ReadFileContent = new File("File Handling/sample.txt");
            Scanner read = new Scanner(ReadFileContent);

            while (read.hasNextLine()) {
                String line = read.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error : " + e);
        } finally {
            System.out.println("------------Done-------------");
        }
    }
}
