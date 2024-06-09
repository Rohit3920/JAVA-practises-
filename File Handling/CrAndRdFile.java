import java.io.FileWriter;

public class CrAndRdFile {
    // public static void main(String[] args) throws IOException {
    //     System.out.println("Create file using throws 'Excerption handling' in java" );

    //     File file = new File("File Handling/sample.txt");
    //     file.createNewFile();
    // }


    public static void main(String[] args) {
        System.out.println("Createed file to Write a text for file using try catch 'Excerption handling' in java" );

        try {
            FileWriter writer = new FileWriter("File Handling/sample.txt");
            writer.write("This is a sample file for file handling in java \n\twrite a file using file handling");
            writer.close();
        } catch (Exception err) {
            System.out.println("Error : " + err);
        }
    }
}
