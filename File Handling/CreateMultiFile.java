
import java.io.File;

public class CreateMultiFile {

    public static void main(String[] args) {
        System.out.println("Cerate multiple files and write content on file in java");

        try {
            for (int i = 0; i < 10; i++) {
                String F_nm = "File Handling/MultipleFiles/SampleFiles" + i + ".txt";
                File DelFile = new File(F_nm);
                DelFile.delete();
                System.out.println(F_nm + " file Deleted successfully!!!");
            }
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
