public class ConstMulti {
    public static void main(String[] args) {
        System.out.println("Multiple constructer in java");

        ConstCls c1 = new ConstCls();
        ConstCls c2 = new ConstCls("Params");

    }
}

class ConstCls{
    ConstCls(){
        System.out.println("--------Constructer call----------");
    }

    ConstCls(String name) {
        System.out.println("--------" + name + " Constructer call----------");
    }
}