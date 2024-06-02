public class InheritanceMultilevel {
    public static void main(String[] args) {
        System.out.println("Hierarchical Inheritance in java");

        child c1 = new child();
        c1.getGrandFather();
        c1.getFather();
        c1.getChild();

    }
}

class grandFather{
    void getGrandFather(){
        System.out.println("call grandfather class");
    }
}

class father extends grandFather{
    void getFather(){
        System.out.println("Call father class");
    }
}

class child extends father{
    void getChild(){
        System.out.println("Call child class");
    }
}
