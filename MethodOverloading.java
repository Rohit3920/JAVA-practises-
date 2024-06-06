

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Method or Function Overloading in java");

        Customer c = new Customer();
        c.login();
        c.login("ROHIT ");
        c.login(12345678);
    }
}

class User{
    void login(){
        System.out.println("User login successfully");
    }
}

class Emp extends User{
    void login(String name){
        System.out.println(name + " login successfully");
    }
}
class Customer extends Emp{
    void login(int password){
        System.out.println("Customer login successfully");
    }
}


