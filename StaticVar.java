


public class StaticVar {

    public static void main(String[] args) {
        System.out.println("Static variable in java");

        sample s1 = new sample();
        sample s2 = new sample();

        StaticCls st1 = new StaticCls();
        StaticCls st2 = new StaticCls();

        System.out.println("Sample variable : " + s1.sampleFun() + " second Variable: " + s2.sampleFun());
        System.out.println("Static variable : " + st1.StaticClsFun() + " second Variable: " + st2.StaticClsFun());

    }
}

class sample {
    int sampleCouter = 0;
    int sampleFun() {
        sampleCouter++;
        return sampleCouter;
    }
}

class StaticCls{
    static int Couter = 0;
    int StaticClsFun() {
        Couter++;
        return Couter;
    }
}
