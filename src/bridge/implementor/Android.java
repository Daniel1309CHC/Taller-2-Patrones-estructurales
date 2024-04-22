package bridge.implementor;

public class Android implements OS {

    @Override
    public void open(){
        System.out.println("Opening app in Android...");
    }

    @Override
    public void close(){
        System.out.println("Closing app...");
    }

    @Override
    public void getVolume(){

    }

}