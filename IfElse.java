import java.util.Scanner;

public class IfElse {
    public static void main(String[] para){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int a = sc.nextInt();

        if(a%4 == 0)
        System.out.println("this is leaf Year " + a);
        else
        System.out.println("this is not leaf Year " + a);
    }
}
