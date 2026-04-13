package org.example;

import org.example.interfaces.Iterator;

public class IteratorDemo {
    static void main() {
        SongRepository playlist = new SongRepository();
        Iterator playlistIterator = playlist.getIterator();

        while(playlistIterator.hasNext()) {
            String song = (String) playlistIterator.next();
            System.out.println("Now Playing : "+song);
        }
    }
}
