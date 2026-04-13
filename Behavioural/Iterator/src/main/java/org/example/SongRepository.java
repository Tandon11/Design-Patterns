package org.example;

import org.example.interfaces.Container;
import org.example.interfaces.Iterator;

public class SongRepository implements Container {
    private static final String[] songs = {"Bohemian Rhapsody", "Stairway to Heaven", "Hotel California"};

    @Override
    public Iterator getIterator() {
        return new SongIterator();
    }

    // Inner class to handle iteration logic
    private static class SongIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < songs.length;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return songs[index++];
            }
            return null;
        }
    }
}
