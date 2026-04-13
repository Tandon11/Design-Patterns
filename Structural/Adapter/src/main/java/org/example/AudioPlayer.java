package org.example;

import org.example.adapter.MediaAdapter;
import org.example.interfaces.MediaPlayer;

// Legacy Class Implementing Media Player
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        // Old Type Supported
        if(audioType.equalsIgnoreCase("MP3")) {
            System.out.println("Playing MP3 file : "+fileName);

            // For new Types we call Adapter
        } else if(audioType.equalsIgnoreCase("MP4") || audioType.equalsIgnoreCase("VLC")) {
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Unsupported File Type : "+fileName);
        }
    }
}
