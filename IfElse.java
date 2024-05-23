
import java.util.Scanner;

public class IfElse {
    public static void main(String[] para) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter finding digit number : ");
        int a = sc.nextInt();

        if (a <= 9) {
            System.out.println("this number is single Digit " + a); 
        }else if (a <= 99 && a >= 10) {
            System.out.println("this number is two Digit " + a); 
        }else if (a <= 999 && a >= 100) {
            System.out.println("this number is three Digit " + a); 
        }else {
            System.out.println("this number is more then tree Digit " + a);
        }
    }
}
