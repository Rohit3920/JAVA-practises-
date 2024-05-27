
public class Array1 {

    public static void main(String[] args) {
        System.out.println("Array in JAVA");

        int mrks[] = {80, 80, 90, 86, 96, 98};
        int result = 0;
        for (int x = 0; x < mrks.length; x++) {
            result = (result + mrks[x]);
            System.out.println("subject "+ (x+1) +" = " + mrks[x]);
        }
        System.out.println("Percentage = " + result / 6);
    }
}
