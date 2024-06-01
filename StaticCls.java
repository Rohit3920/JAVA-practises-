
public class StaticCls {

    public static void main(String[] args) {
        System.out.println("Static class in java");

        // syntax for static class 
        person.staticPerson p = new person.staticPerson();
        p.getStaticData();
    }
}

class person {

    static String name = "StaticCls";

    static class staticPerson {

        void getStaticData() {
            System.out.println("Static access name in static class : " + name);
        }

    }
}
