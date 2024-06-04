interface software{
    public void getSoftware(String st);
}

interface hardware{
    public void getHardware(String hd);
}


class Project implements  software, hardware{
    public void getSoftware(String st){
        System.out.println("this project use software is  :  "+ st);
    }

    public void getHardware(String hd){
        System.out.println("this project use hardware  :  "+ hd);
    }
}

public class InheritanceMultiple {
    public static void main(String[] args){
        System.out.println("Multiple Inheritance in java");

        Project p1 = new Project();
        p1.getSoftware("VS code");
        p1.getHardware("Laptop");
    }
}
