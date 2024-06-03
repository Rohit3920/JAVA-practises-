public class InheritanceHierarchical{
    public static void main(String[] args) {
        System.out.println("Hierarchical Inheritance in java");

        child1 c1 = new child1();
        c1.getParentData();
        c1.getChild1Data();

        child2 c2 = new child2();
        c2.getParentData();
        c2.getChild2Data();

    }
}

class parent{
    void getParentData(){
        System.out.println("parent class function call");
    }
}

class child1 extends parent{
    void getChild1Data(){
        System.out.println("child1 class function call");
    }
}

class child2 extends parent{
    void getChild2Data(){
        System.out.println("child2 class function call");
    }
}