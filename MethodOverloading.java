

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Method or Function Overloading in java");

        Emp e = new Emp();
        e.login();
        Customer c = new Customer();
        c.login();

    }
}

class User{
    void login(){
        System.out.println("User login successfully");
    }
}

class Emp extends User{
    void login(){
        System.out.println("Emp login successfully");
    }
}
class Customer extends Emp{
    void login(){
        System.out.println("Customer login successfully");
    }
}


