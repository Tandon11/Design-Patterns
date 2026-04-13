package org.example.adapteeImpl;

import org.example.adaptee.AdvanceMediaPlayer;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String filename) {
        // Not Supported
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP$ file : "+fileName);
    }
}
