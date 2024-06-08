
public class tryCatch {

    public static void main(String[] args) {
        System.out.println("Exception Handing in java");

        int num = 10;

        try {
            System.out.println(num / 0);
        } catch (Exception e) {
            System.out.println("Error occur : " + e);
        } finally {
            System.out.println("Next code");
        }
    }
}
