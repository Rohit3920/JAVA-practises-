

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Method or Function Overloading in java");

        User u = new User();
        u.getData();
        u.getData("this is method overloading means function overloading");
        u.getData(20);


    }
}

class User{
    void getData(){
        System.out.println("Ready to getting the data");
    }

    void getData(String data){
        System.out.println("getting a data for : " + data);
    }
    
    void getData(int NoOfData){
        System.out.println("getting data in number is : " + NoOfData);
    }
}


