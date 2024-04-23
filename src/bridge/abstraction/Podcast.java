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

    public void normalSpeed(){
        os.setSpeed(1.0);
    }

    public void fastSpeed(){
        os.setSpeed(2.0);
    }

}