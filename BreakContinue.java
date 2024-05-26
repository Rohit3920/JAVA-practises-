public class BreakContinue {
    public static void main(String[] arg){
        System.out.print("\n Break Statement in JAVA");
        for (int i = 0; i < 10; i++) {
            if(i == 7){
                System.out.println("Using break statement to break or exit the loop");
                break;
            }
            System.out.println(i);
        }

        System.out.print("\n Continue Statement in JAVA");
        for (int i = 0; i < 10; i++) {
            if(i == 4){
                System.out.println("Using continue statemant to avoid and continue the loop " + i);
                continue;
            }
            System.out.println(i);
        }
    }
}
