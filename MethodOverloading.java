

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Method or Function Overloading in java");

        User u = new User();
        u.getData();
        u.getData("this is method overloading means function overloading");
        u.getData("this is method overloading", 25);
        u.getData("this is method overloading", "this is function overloading");


    }
}

class User{
    void getData(){
        System.out.println("Ready to getting the data");
    }

    void getData(String data){
        System.out.println("getting a data for : " + data);
    }
    
    void getData(String data, int NoOfData){
        System.out.println("getting a data for : " + data + " for number of data : " + NoOfData);
    }

    void getData(String data1, String data2){
        System.out.println("getting a data for 1 : " + data1 + "\n and \ngetting a data for 2 : " + data2);
    }
}


