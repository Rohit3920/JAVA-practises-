public class throwThrows {
    public static void main(String[] args) {
        System.out.println("Exception Handling : throw and throws : ");

        // try {
        //     int no = 10;
        //     System.out.println(no/2);
        //     throw new ArithmeticException("Text");
        // } catch (ArithmeticException err) {
        //     System.out.println("Error : " + err);
        // }

        try {
            checkAge();
        } catch (ArithmeticException err) {
            System.out.println("Error : " + err);
        }
    }

    public static void checkAge() throws ArithmeticException{
        System.out.println(10/0);
    }
}


