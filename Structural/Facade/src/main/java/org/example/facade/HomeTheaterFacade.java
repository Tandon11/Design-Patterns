package org.example.facade;

import org.example.subSystems.BluRayPlayer;
import org.example.subSystems.SoundSystem;
import org.example.subSystems.TV;

public class HomeTheaterFacade {
    private final TV tv;
    private final SoundSystem sound;
    private final BluRayPlayer player;

    public HomeTheaterFacade(TV tv, SoundSystem sound, BluRayPlayer player) {
        this.tv = tv;
        this.sound = sound;
        this.player = player;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        tv.on();
        tv.setInput();
        sound.on();
        sound.setVolume(20);
        player.on();
        player.play(movie);
    }
}
