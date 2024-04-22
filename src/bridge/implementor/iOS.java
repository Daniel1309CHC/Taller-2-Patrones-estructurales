package bridge.implementor;

public class iOS implements OS {

    @Override
    public void open(){
        System.out.println("Opening app in iOS...");
    }

    @Override
    public void close(){
        System.out.println("Closing app...");
    }

    @Override
    public void getVolume(){

    }

}
