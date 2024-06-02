
public class constPara {
    public static void main(String[] args) {
        System.out.println("parameterized constructer in java");

        constCls c1 = new constCls("param");
    }
}

class constCls {
    constCls(String name) {
        System.out.println("--------" + name + " Constructer call----------");
    }
}
