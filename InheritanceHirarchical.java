
interface geneticX {
    public void getGeneticX();
}
interface geneticY {
    public void getGeneticY();
}

class ParentG implements geneticX, geneticY{
    public void getGeneticX() {
        System.out.println("Pass genetic material in X family");
    }

    public void getGeneticY(){
        System.out.println("pass genetic material in Y family");
    }

    void getParent() {
        System.out.println("first parent function call");
    }
}

class children1 extends ParentG{
    void getChildren1() {
        System.out.println("children one function call");
    }
}

class children2 extends ParentG{
    void getChildren2() {
        System.out.println("children two function call");
    }
}

public class InheritanceHirarchical {

    public static void main(String[] args) {
        System.out.println("-------- Hirarchical Inheritance in java ----------");

        System.out.println("\n frist children ---------->");
        children1 c1 = new children1();
        c1.getGeneticX();
        c1.getGeneticY();
        c1.getParent();
        c1.getChildren1();

        System.out.println("\n Second children ---------->");
        children2 c2 = new children2();
        c2.getGeneticX();
        c2.getGeneticY();
        c2.getParent();
        c2.getChildren2();
    }
}
