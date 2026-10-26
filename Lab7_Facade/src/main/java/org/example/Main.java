package org.example;


import org.example.Components.*;
import org.example.Components.Players.CdPlayer;
import org.example.Components.Players.DvdPlayer;

public class Main {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights theaterLights = new TheaterLights();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer,
                cdPlayer, projector, screen, theaterLights, popcornPopper);

        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        homeTheaterFacade.endMovie();
    }
}