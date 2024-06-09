
import java.io.FileWriter;
import java.io.IOException;

public class CreateMultiFile{
    public static void main(String[] args) {
        System.out.println("Cerate multiple files and write content on file in java");

        try {
        for (int i = 0; i < 10; i++) {
            String F_nm = "File Handling/MultipleFiles/SampleFiles"+i+".txt";
            FileWriter filesWrite = new FileWriter(F_nm);
            filesWrite.write("this is file for "+F_nm+" \n\t This is content for file");
            System.out.println(F_nm +" file write successfully!!!");
        }
        } catch (IOException e) {
            System.out.println("Error : "+e);
        }
    }
}