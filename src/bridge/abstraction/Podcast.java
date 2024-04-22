package bridge.abstraction;

import bridge.implementor.OS;

public class Podcast extends Player {

    public Podcast (OS os) {
        super(os);
    }

    @Override
    public void start(){
        os.open();
        System.out.println("Starting podcast...");
    }

    @Override
    public void pause(){
        System.out.println("Pausing podcast...");
    }

    @Override
    public void stop(){
        System.out.println("Stopping podcast...");
        os.close();
    }

}