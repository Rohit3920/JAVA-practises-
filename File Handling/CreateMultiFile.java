
import java.io.File;
import java.io.IOException;

public class CreateMultiFile{
    public static void main(String[] args) throws IOException{
        System.out.println("Cerate multiple files and write content on file in java");

        for (int i = 0; i < 10; i++) {
            String F_nm = "File Handling/MultipleFiles/SampleFile"+i+".txt";
            File files = new File(F_nm);
            files.createNewFile();
        }
    }
}