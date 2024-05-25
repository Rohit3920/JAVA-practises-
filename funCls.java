
public class funCls {

    public static void main(String[] args) {
        System.out.println("\n\nFunction in JAVA \n------------------------------------------------------------------");
        int amount = 10000;
        int time = 2;
        int rate = 12;
        simpleInterest(amount, time, rate);
        System.out.println("\n\n");
    }

    public static void simpleInterest(int a, int t, int r) {
        System.out.println("Simple interest : " + (a * t * r) / 100);
    }
}
