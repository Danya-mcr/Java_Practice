package org.example;

import org.example.Components.*;
import org.example.Components.Players.CdPlayer;
import org.example.Components.Players.DvdPlayer;

public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier,
                             Tuner tuner,
                             DvdPlayer dvdPlayer,
                             CdPlayer cdPlayer,
                             Projector projector,
                             Screen screen,
                             TheaterLights theaterLights,
                             PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreanMode();
        amplifier.on();
        amplifier.setDvd();
        amplifier.setStereoSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play();
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
