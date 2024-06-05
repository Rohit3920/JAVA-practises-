
public class Aggregation {
    public static void main(String[] args) {
        System.out.println("this is an Aggregation in java");

        //create object for address class and pass as a parameter in student object
        Address adrs1 = new Address("Paroliwadi", "Ajara", "Maharashtra", "INDIA");
        Student s1 = new Student("Rohit", 32, adrs1);
        s1.studDisplay();
    }
}

class Address{
    String villege;
    String city;
    String state;
    String country;

    Address(String villege, String city, String state, String country){
        this.villege = villege;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Student {

    String name;
    int rollNo;

    //Address class as user define datatype to use variable and access this class variable in Student class
    Address adrs;


    Student(String name, int rollNo, Address adrs) {
        this.name = name;
        this.rollNo = rollNo;
        this.adrs = adrs;
    }

    void studDisplay() {
        System.out.println("-----Student Datails----- \n\tName : " + name);
        System.out.println("\tRoll No. : " + rollNo);

        //access the Address variable using dot operator and show the result
        System.out.println("\tVillege : " + adrs.villege);
        System.out.println("\tCity : " + adrs.city);
        System.out.println("\tState : " + adrs.state);
        System.out.println("\tCountry : " + adrs.country);
        System.out.println("-----------------------------------");
    }
}
