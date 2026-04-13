package org.example;

import org.example.facade.HomeTheaterFacade;
import org.example.subSystems.BluRayPlayer;
import org.example.subSystems.SoundSystem;
import org.example.subSystems.TV;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FacadeDemo {
    static void main() {
        TV myTV = new TV();
        SoundSystem mySound = new SoundSystem();
        BluRayPlayer myPlayer = new BluRayPlayer();

        // Create the Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(myTV, mySound, myPlayer);

        // One simple call!
        homeTheater.watchMovie("Inception");
    }
}
