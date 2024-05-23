
import java.util.Scanner;

public class IfElse {

    public static void main(String[] para) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();

        if (a <= 9) {
            System.out.println("this number is single Digit " + a);
            if (a % 2 == 0) {
                System.out.println("this number is even " + a);
            } else {
                System.out.println("this number is odd " + a);
            }
        } else {
            System.out.println("this number is more then one Digit " + a);
            if (a % 2 == 0) {
                System.out.println("this number is even " + a);
            } else {
                System.out.println("this number is odd " + a);
            }
        }
    }
}
