
import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] para) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Do-While Loop");
        int n = 0;
        do {
            n = obj.nextInt();
            String msg = n!=0? "<Continue>": "<Exit>";
            String num = n == 0? "non decided": n%2 ==0 ? "Even": "Odd";

            System.out.println("Your  number is " + num + " -> "+ n+"  " + msg);
        } while (n != 0);

    }
}
