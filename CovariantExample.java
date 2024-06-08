
class User {

    User login() {
        System.out.println("User login");
        return this;

        /*
            this is class fuction with returnType / datatype as a class
            and return this means this class is return;
         */
    }
}

class Client extends User {

    @Override
    Client login() {
        System.out.println("Client login");
        return this;

        /*
            this is class fuction with returnType / datatype as a class
            and return this means this class is return;
         */
    }
}

public class CovariantExample {

    public static void main(String[] args) {
        System.out.println("Covariant in java");

        Client clt = new Client();
        clt.login();
    }
}
