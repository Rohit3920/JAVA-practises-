
import java.util.Scanner;

public class Array2D2 {

    public static void main(String[] args) {
        System.out.println("Two dimentional Array in JAVA");

        Scanner obj = new Scanner(System.in);

        int d1, d2;
        System.out.println("Enter 2d array size row and column");
        d1 = obj.nextInt();
        d2 = obj.nextInt();

        String name[][] = new String[d1][d2];
        System.out.println("Enter the 2D array element : ");
        System.out.println("\n-------------------------------------");
        for (int i = 0; i < name.length; i++) {
            System.out.println("Enter " + (i+1) + " Number ------>");
            for (int j = 0; j < name[i].length; j++) {
                name[i][j] = obj.next();
                System.out.println("\n-------------------------------------");
            }
        }

        System.out.println("Print 2D array element : ");
        System.out.println("\n-------------------------------------");
        for (int i = 0; i < name.length; i++) {
            System.out.println("\n-------------------------------------");
            for (int j = 0; j < name[i].length; j++) {
                System.out.print(name[i][j] + " ");
            }
        }

    }
}
