public class OprLogical {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;

        if(a == 10 && b ==20){
            System.out.println("AND Logical Operator");
        }

        if(a == 10 || b ==30){
            System.out.println("OR Logical Operator");
        }

        if(!(a != 10 && b ==20)){
            System.out.println("NOT Logical Operator");
        }
    }
}
