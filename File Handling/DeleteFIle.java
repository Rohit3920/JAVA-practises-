
import java.io.File;

public class DeleteFIle {
    public static void main(String[] args) {
        System.out.println("Delete file using try catch 'Excerption handling' in java");

        try{
        File DelFile = new File("File Handling/sample.txt");
        DelFile.delete();
        }catch(Exception err){
            System.out.println("Error : " + err);
        }
    }
}
