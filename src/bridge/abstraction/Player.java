package bridge.abstraction;

import bridge.implementor.OS;

public abstract class Player {

    protected OS os;

    public Player(OS os) {
        this.os = os;
    }

    public abstract void start();
    public abstract void pause();
    public abstract void stop();
}
