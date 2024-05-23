
import java.util.Scanner;

public class IfElse {

    public static void main(String[] para) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();

        String num = a%2 == 0 ? "Even": "odd";
            System.out.println("this number is " + num +" -> " + a);
    }
}
