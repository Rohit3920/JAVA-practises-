
import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("For Loop ");
        System.out.println("Enter number to print table ");
        int num = obj.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * num);
        }
    }
}
