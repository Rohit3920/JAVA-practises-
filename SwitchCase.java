
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] para) {
        System.out.println("Switch Case ");

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter percentage : ");
        int per = obj.nextInt();
        System.out.println("cout : " + per / 20);

        if (per <= 100) {
            switch (per / 20) {
                case 5:
                    System.out.println("First class distition");
                    break;
                case 4:
                    System.out.println("First class ");
                    break;
                case 3:
                    System.out.println("second class ");
                    break;
                case 2:
                    System.out.println("Third class ");
                    break;
                case 1:
                    System.out.println("fouth class ");
                    break;
                default:
                    System.out.println("You are Failed ");

            }
        }
    }
}
