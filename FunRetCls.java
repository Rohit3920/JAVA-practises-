public class FunRetCls {
    public static void main(String[] args){
        System.out.println("Fuction with return type in JAVA");

        System.out.println("\nAddition : " + sum(12, 10) + "\n");
        System.out.println("\nString return : " + PrintName("ROHIT") + "\n");

        System.out.println("\nFloat value for condition : " + FloatVal(10) + "\n");
        System.out.println("\nFloat value for condition : " + FloatVal(12) + "\n");

    }

    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }

    public static String PrintName(String nm){
        return nm;
    }

    public static float FloatVal(float a){
        if(a > 10.5)
        return a;
        else
        return a+a;
    }
}
