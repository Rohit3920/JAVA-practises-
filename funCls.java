import java.util.Scanner;
public class funCls {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("\n\nFunction in JAVA \n------------------------------------------------------------------");
        System.out.println("Amount");
        int amount = obj.nextInt();
        System.out.println("time");
        int time =obj.nextInt();
        System.out.println("rate");

        int rate = obj.nextInt();
        simpleInterest(amount, time, rate);
        System.out.println("\n\n");
    }

    public static void simpleInterest(int a, int t, int r) {
        System.out.println("Simple interest : " + (a * t * r) / 100);
    }
}
