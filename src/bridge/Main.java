package bridge;

import bridge.implementor.*;
import bridge.abstraction.*;

public class Main {
    public static void main(String[] args) {
        OS ios = new iOS();
        OS android = new Android();

        System.out.println("*** iOS ***");
        playMedia(ios);
        System.out.println("*** Android ***");
        playMedia(android);
    }

    public static void playMedia(OS os) {
        System.out.println("== Song ==");
        Song song = new Song(os);
        song.start();
        song.muteSong();
        song.stop();

        System.out.println("== Podcast ==");
        Podcast podcast = new Podcast(os);
        podcast.start();
        podcast.fastSpeed();
        podcast.stop();
    }
}