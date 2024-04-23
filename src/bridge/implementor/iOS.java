package bridge.implementor;

public class iOS implements OS {

    private double speed = 1.0;
    private int volume = 100;

    @Override
    public void open(){
        System.out.println("Opening app in iOS...");
    }

    @Override
    public void close(){
        System.out.println("Closing app...");
    }

    @Override
    public void setVolume(int v) {
        if (v > 100) {
            this.volume = 100;
            System.out.println("Setting volume at 100...");
        } else if (v < 0) {
            this.volume = 0;
            System.out.println("Setting volume at 0...");
        } else {
            this.volume = v;
            if (v > this.volume) {
                System.out.println("Volume up to " + v);
            } else if (v < this.volume) {
                System.out.println("Volume down to " + v);
            } else {
                System.out.println("Volume at " + v);
            }
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setSpeed(double x){
        if (x > 0) {
            this.speed = x;
            System.out.println("Speed at " + x);
        } else {
            this.speed = 1.0;
            System.out.println("Speed at 1.0");
        }
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}
