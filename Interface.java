

//Iterface is blueprint of class means list of function in one class
interface carList {
    void engine(String EngineName);
    void gear(int noOfGear);
}

class car implements carList {
//all interface list of function as define in class
    public void engine(String EngineName) {
        System.out.println("Car ENGINE name is : " + EngineName);
    }

    public void gear(int noOfGear) {
        System.out.println("Total gear of car is : " + noOfGear);
    }

//extra function add without include list of interface
    void carPrice(float price){
        float gst = price/5;
        float roadTax = price/25;

        System.out.println("Total car price : "+ (price + gst + roadTax));
    }
}

public class Interface {

    public static void main(String[] args) {
        System.out.println("Example of interface in java");

        car c = new car();
        c.engine("Super power ");
        c.gear(5);
        c.carPrice(156000);
    }
}
