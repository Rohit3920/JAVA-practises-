public class ClsObj {
    public static void main(String[] args){
        System.out.println("This is Class in JAVA");
        Cls2 c1 = new Cls2();
        c1.fun();

    }
}

class Cls2{
    void fun(){
        System.out.println("External Class function call");
    }
}