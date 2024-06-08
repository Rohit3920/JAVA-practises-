class Animal{
    Animal(){
        System.out.println("This is ANIMAL");
    }

    int animals = 1000;

    void AnimalSleep(){
        System.out.println("Animal sleep");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        //Parent constructer call only child constructer using super kayword
    }

    void doSomething(){
        super.AnimalSleep();
            //access parent variable in child class without creating object
        System.out.println("Total number of Animal :" +super.animals);
            //access parent function in child class without creating object
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        System.out.println("Super keyword in java");

        Dog d = new Dog();
        d.doSomething();
    }
}
