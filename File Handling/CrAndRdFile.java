import java.io.File;
import java.io.IOException;

public class CrAndRdFile {
    public static void main(String[] args) throws IOException {
        System.out.println("Create file using throws 'Excerption handling' in java" );

        File file = new File("File Handling/sample.txt");
        file.createNewFile();
    }
}
