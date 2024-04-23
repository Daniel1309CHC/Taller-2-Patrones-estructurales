package bridge.implementor;

public interface OS {
    void open();
    void close();
    void setVolume(int x);
    int getVolume();
    void setSpeed(double x);
    double getSpeed();

}
