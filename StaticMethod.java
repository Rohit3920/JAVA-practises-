
class person {

    static void getStaticData() {
        System.out.println("Access static data using static method");
    }

    void getData() {
        System.out.println("This is external function in person");
        //static method access the function without creating object, directly call this static function in innerside of class
        getStaticData();
    }
}

public class StaticMethod {

    public static void main(String[] args) {
        System.out.println("This is static method or function : ");
        person p = new person();
        p.getData();
        p.getStaticData();
    }
}
