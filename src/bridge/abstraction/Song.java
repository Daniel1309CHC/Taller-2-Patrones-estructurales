package bridge.abstraction;

import bridge.implementor.OS;

public class Song extends Player{

    public Song (OS os) {
        super(os);
    }

    @Override
    public void start(){
        os.open();
        System.out.println("Starting song...");
    }

    @Override
    public void pause(){
        System.out.println("Pausing song...");
    }

    @Override
    public void stop(){
        System.out.println("Stopping song...");
        os.close();
    }
}
