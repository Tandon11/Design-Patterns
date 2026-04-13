package org.example.adapteeImpl;

import org.example.adaptee.AdvanceMediaPlayer;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing VLC file : "+filename);
    }

    @Override
    public void playMp4(String fileName) {
        // Not Supported
    }
}
