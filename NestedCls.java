public class NestedCls {
    public static void main(String[] args) {
        System.out.println("Nested class in java");

        Clg c = new Clg();
        c.getClgData();
    }
}


class Clg{
    class stud{
        //this child class properties can not access outer side of nested classes
        //nested class are limitation on this nested classes
        void getStudData(){
            System.out.println("Child class in nested class in java");
        }
    }

    void getClgData(){
        System.out.println("Parent class in nested class in java");

        //child class create an object to access the child class properties
        stud s = new stud();
        s.getStudData();
    }
}