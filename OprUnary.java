public class OprUnary {
    public static void main(String[] args){
        int a = 10;
        boolean b = true;
        System.out.println(" Main value : " + a);
        System.out.println("Post Unary Operator");
        System.out.println("1> INC - after value : " + (a++) + " before value : " + a);
        System.out.println("2> DEC - after value : " + (a--) + " before value : " + a);
        System.out.println("pre Unary Operator");
        System.out.println("3> INC - after value : " + (++a) + " before value : " + a);
        System.out.println("4> DEC - after value : " + (--a) + " before value : " + a);
        System.out.println("5> OPPOSITE - after value : " + b + " before value : " + !b);


    }
}
