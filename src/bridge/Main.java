package bridge;

import bridge.implementor.*;
import bridge.abstraction.*;

public class Main {
    public static void main(String[] args) {
        OS ios = new iOS();
        OS android = new Android();

        Player songIOS = new Song(ios);
        Player podcastAndroid = new Podcast(android);

        songIOS.start();
        songIOS.stop();

        podcastAndroid.start();
        podcastAndroid.pause();
        podcastAndroid.stop();
    }
}