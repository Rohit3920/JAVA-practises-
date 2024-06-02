public class Constructer {
    public static void main(String[] args) {
        System.out.println("Constructer in java");

        ConstCls c = new ConstCls();
    }
}

class ConstCls{
    ConstCls(){
        System.out.println("--------Constructer call----------");
    }
}
