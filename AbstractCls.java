abstract class Android{

    Android(){
        System.out.println("This android version is 14");
    }

    abstract void feature();
}

class AnyMobile extends Android{
    void feature(){
        System.out.println("Add android feature in mobile ");
    }

    void myFeature(){
        System.out.println("Add Extra feature in mobile ");

    }
}

public class AbstractCls {
    public static void main(String[] args) {
        System.out.println("Abstract class in java \n");

        AnyMobile mob = new AnyMobile();
        mob.feature();
        mob.myFeature();
    }
}
