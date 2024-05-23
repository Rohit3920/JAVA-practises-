

public class ForLoop {

    public static void main(String[] args) {
        // Scanner obj = new Scanner(System.in);
        // System.out.println("For Loop ");
        // System.out.println("Enter number to print table ");
        // int num = obj.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i * num);
        // }/


        for (int i = 1; i <= 10; i++) {
            for(int j =1; j <= 10; j++){
                System.out.print(j*i +"  ");
            }
            System.out.print("\n");
        }
    }
}
