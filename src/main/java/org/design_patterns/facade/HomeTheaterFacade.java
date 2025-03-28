package org.design_patterns.facade;

public class HomeTheaterFacade {
    private TV tv;
    private DVD dvd;
    private Amplifier amplifier;

    public HomeTheaterFacade(TV tv, DVD dvd, Amplifier amplifier) {
        this.tv = tv;
        this.dvd = dvd;
        this.amplifier = amplifier;
    }

    public void watchMovie(String movieName) {
        System.out.println("Watching movie " + movieName);
        tv.on();
        dvd.on();
        amplifier.on();
        dvd.play();
    }

    public void stopMovie() {
        System.out.println("Shutting down the home theater...");
        tv.off();
        dvd.stop();
        amplifier.off();
    }
}
