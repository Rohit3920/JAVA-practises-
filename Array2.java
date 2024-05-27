
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        System.out.println("User throught input in element of array  and print the array ");

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of subject : ");
        int ArrSize = obj.nextInt();

        int marks[] = new int[ArrSize];

        System.out.println("Enter the Marks");
        for (int i = 0; i < ArrSize; i++) {
            System.out.print("Subject " + (i+1) +" = ");
            marks[i] = obj.nextInt();
        }

        int total = 0;
        System.out.println("Print the marks : ");
        for (int i = 0; i < ArrSize; i++) {
            System.out.println("Subject "+ (i+1) + " = " + marks[i]);
            total = total + marks[i];
        }

        System.err.println("Percentage : " + total/ArrSize + "%");

    }
}
