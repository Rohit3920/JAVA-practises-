class parent{
    void getParentData(){
        System.out.println("Call parent class function");
    }
}

class child extends parent{
    void getChildData(){
        System.out.println("Call child class function");
    }
}



public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance in java");

        child c = new child();
        c.getChildData();
        c.getParentData();
    }
}
