
public class Aggregation {
    public static void main(String[] args) {
        System.out.println("this is an Aggregation in java");

        Student s1 = new Student("Rohit", 32, "Paroliwadi", "Ajara", "Maharashtra", "INDIA");
        s1.studDisplay();
    }
}

class Student {

    String name;
    int rollNo;
    String villege;
    String city;
    String state;
    String country;

    Student(String name, int rollNo, String villege, String city, String state, String country) {
        this.name = name;
        this.rollNo = rollNo;
        this.villege = villege;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    void studDisplay() {
        System.out.println("-----Student Datails----- \n\tName : " + name);
        System.out.println("\tRoll No. : " + rollNo);
        System.out.println("\tVillege : " + villege);
        System.out.println("\tCity : " + city);
        System.out.println("\tState : " + state);
        System.out.println("\tCountry : " + country);
        System.out.println("-----------------------------------");
    }
}
