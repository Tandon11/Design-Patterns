package org.example;

public class AdapterDemo {
    static void main() {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3", "song1.mp3");
        audioPlayer.play("MP4", "Song2.mp4");
        audioPlayer.play("VLC", "video1.vlc");
        audioPlayer.play("MPEG4", "video2.mpeg");
    }
}
